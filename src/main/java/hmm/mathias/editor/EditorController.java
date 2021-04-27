package hmm.mathias.editor;

import hmm.mathias.Main;
import hmm.mathias.compiler.*;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.*;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Optional;

public class EditorController {
    private boolean NovoArquivo = true;
    private String fileHash = CryptoService.CriarHashDeAlteracao("");
    private File arquivoAtual;

    @FXML
    private TextArea txtCode;
    @FXML
    private TextArea txtCodeOutput;
    @FXML
    private TextField txtLineNumber;

    @FXML
    private MenuItem mnuNovoArquivo;
    @FXML
    private MenuItem mnuAbrirArquivo;
    @FXML
    private MenuItem mnuSalvarArquivo;

    @FXML public void initialize(){
        txtLineNumber.setEditable(false);
        txtCodeOutput.setEditable(false);

        txtCode.setOnKeyReleased(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                int caretPos = txtCode.getCaretPosition();
                String toCaret = txtCode.getText().substring(0, caretPos);
                int lastLBBeforeCaret = Math.max(0, toCaret.lastIndexOf("\n"));

                String lineno = String.valueOf(toCaret.chars().filter(ch -> ch == '\n').count());
                String caretStringLine = txtCode.getText().substring(lastLBBeforeCaret, caretPos);
                String columnNo = String.valueOf(caretStringLine.chars().reduce(0, (total, ch) -> total += ch == '\t' ? 4:1));
                String txt = "L: " + lineno  + " | C:" + columnNo;
                txtLineNumber.setText(txt);
            }
        });

        KeyCombination atalhoSalvar = new KeyCodeCombination(KeyCode.S, KeyCombination.CONTROL_DOWN);
        KeyCombination atalhoNovo = new KeyCodeCombination(KeyCode.N, KeyCombination.CONTROL_DOWN);
        KeyCombination atalhoAbrir = new KeyCodeCombination(KeyCode.O, KeyCombination.CONTROL_DOWN);

        mnuNovoArquivo.setAccelerator(atalhoNovo);
        mnuAbrirArquivo.setAccelerator(atalhoAbrir);
        mnuSalvarArquivo.setAccelerator(atalhoSalvar);
    }

    @FXML
    private void AbrirArquivo() throws IOException {
        if(!OnMudancaDeArquivo())
            return;

        FileChooser fileChooser = new FileChooser();

        String defaultPath =  ConfigService.getCaminhoPadrao().toString();
        fileChooser.initialDirectoryProperty().set(new File(defaultPath));
        fileChooser.setTitle("Escolha um arquivo de texto");
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Text Files", "*.txt"));
        arquivoAtual = fileChooser.showOpenDialog(Main.primaryStage);
        if(arquivoAtual != null){
            NovoArquivo = false;
            txtCode.setText(LerArquivoParaEditor(arquivoAtual));
            ConfigService.setCaminhoPadrao(Path.of(arquivoAtual.getParent()));
            fileHash = CryptoService.CriarHashDeAlteracao(txtCode.getText());
            Main.primaryStage.setTitle("Compilador - " + arquivoAtual.getName());
        }else{

        }
    }
    @FXML
    private void NovoArquivo(){
        if(!OnMudancaDeArquivo())
            return;

        txtCode.setText("");
        txtCodeOutput.setText("");
        Main.primaryStage.setTitle("Compilador");
        arquivoAtual = null;
        fileHash = CryptoService.CriarHashDeAlteracao("");

        NovoArquivo = true;
    }
    @FXML
    private boolean SalvarArquivo(){
        try {
            String caminhoDoArquivo = "";

            if(NovoArquivo){
                FileChooser fileChooser = new FileChooser();
                String defaultPath =  ConfigService.getCaminhoPadrao().toString();
                fileChooser.initialDirectoryProperty().set(new File(defaultPath));
                arquivoAtual = fileChooser.showSaveDialog(Main.primaryStage);
                if(arquivoAtual == null)
                    return false;
            }

            caminhoDoArquivo = arquivoAtual.getAbsolutePath();
            String codigo = txtCode.getText();

            FileWriter myWriter = new FileWriter(caminhoDoArquivo);
            myWriter.write(codigo);
            myWriter.close();

            fileHash = CryptoService.CriarHashDeAlteracao(codigo);
            ConfigService.setCaminhoPadrao(Path.of(arquivoAtual.getParent()));
            NovoArquivo = false;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }
    @FXML
    private boolean SalvarArquivoComo(){
        try {
            String caminhoDoArquivo = "";

            FileChooser fileChooser = new FileChooser();
            arquivoAtual = fileChooser.showSaveDialog(Main.primaryStage);
            if(arquivoAtual == null)
                return false;

            caminhoDoArquivo = arquivoAtual.getAbsolutePath();
            caminhoDoArquivo += arquivoAtual.getName();

            String codigo = txtCode.getText();

            FileWriter myWriter = new FileWriter(caminhoDoArquivo);
            myWriter.write(codigo);
            myWriter.close();

            fileHash = CryptoService.CriarHashDeAlteracao(codigo);
            NovoArquivo = false;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }

    public void OnFechar(WindowEvent ev){
        if(!OnMudancaDeArquivo())
            ev.consume();
    }

    @FXML
    private void Compile(ActionEvent event) throws ParseException {
        txtCodeOutput.setText("");
        if(txtCode.getText().replace(" ", "").replace("\n", "").equals(""))
            return;

        StringReader reader = new StringReader(txtCode.getText());

        FoxtranTokenManager lexicalTester = new FoxtranTokenManager(new JavaCharStream(reader));
        Token currentToken = null;
        boolean houveErro = false;
        do{
            try{
                currentToken = lexicalTester.getNextToken();

                if(currentToken.kind == FoxtranTokenManager.EOF || currentToken.kind == FoxtranTokenManager.LINEBREAK)
                    continue;

                String newLexema = GetTokenType(currentToken) + " '" + currentToken.toString()+ "' em (L:"+currentToken.beginLine+",C:"+currentToken.beginColumn+") ID:" + currentToken.kind + "\n";
                txtCodeOutput.appendText(newLexema);
            }catch (TokenMgrError e){
                txtCodeOutput.appendText(e.getMessage());
                houveErro = true;
                continue;
            }
        } while(currentToken.kind != FoxtranTokenManager.EOF);

        if(!houveErro){
            txtCodeOutput.appendText("\n---STATUS---\nCompilacao concluida com sucesso!");
        }
    }

    String GetTokenType(Token token){
        if(token == null)
            return "";

        int tokenId = token.kind;

        if(tokenId >= 6 && tokenId < 26)
            return "<PALAVRA RESERVADA>";
        if(tokenId >= 26 && tokenId < 52)
            return "<SIMBOLO RESERVADO>";

        //>50
        return FoxtranConstants.tokenImage[tokenId];

    }

    private String LerArquivoParaEditor(File file) {
        try{
            byte[] bytes = Files.readAllBytes(file.toPath());
            return new String(bytes, StandardCharsets.UTF_8);
        }catch (Exception ex){
            return "";
        }

    }


    private boolean OnMudancaDeArquivo(){
        if(ArquivoAlterado()){
            Optional<ButtonType> resposta = MostrarPopUpDeSalvar();

            boolean ehSim = resposta.isPresent() && resposta.get().getButtonData().equals(ButtonBar.ButtonData.YES);
            boolean ehCancelar = resposta.isPresent() && resposta.get().getButtonData().equals(ButtonBar.ButtonData.CANCEL_CLOSE);

            if(ehCancelar)
                return false;

            if(ehSim){
                boolean deuBoa = true;
                Optional<ButtonType> modoDeSalvar = MostrarPopUpDeModoDeSalvar();
                if(modoDeSalvar.isPresent() && modoDeSalvar.get().getButtonData().equals(ButtonBar.ButtonData.YES))
                    deuBoa = SalvarArquivo();
                else
                    deuBoa =SalvarArquivoComo();

                if(!deuBoa)
                    return false;
            }
        }
        return true;
    }

    private Optional<ButtonType> MostrarPopUpDeSalvar(){
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.getButtonTypes().remove(ButtonType.OK);
        alert.getButtonTypes().add(new ButtonType("Sim",ButtonBar.ButtonData.YES));
        alert.getButtonTypes().add(new ButtonType("Nao",ButtonBar.ButtonData.NO));
        alert.getButtonTypes().add(new ButtonType("Cancelar",ButtonBar.ButtonData.CANCEL_CLOSE));
        alert.setTitle("Salvar arquivos");
        alert.setContentText(String.format("Modificacoes foram feitas, deseja salvar o arquivo antes de fechar?"));
        alert.initOwner(Main.primaryStage.getOwner());
        return alert.showAndWait();
    }

    private Optional<ButtonType> MostrarPopUpDeModoDeSalvar(){
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.getButtonTypes().remove(ButtonType.OK);
        alert.getButtonTypes().add(new ButtonType("Salvar",ButtonBar.ButtonData.YES));
        alert.getButtonTypes().add(new ButtonType("Salvar como",ButtonBar.ButtonData.NO));
        alert.setTitle("Salvar arquivos");
        alert.setContentText(String.format("Como deseja efetuar a gravacao?"));
        alert.initOwner(Main.primaryStage.getOwner());
        return alert.showAndWait();
    }

    private boolean ArquivoAlterado(){
        String hashDeAlteracao = CryptoService.CriarHashDeAlteracao(txtCode.getText());
        return(!fileHash.equals(hashDeAlteracao));
    }
}
