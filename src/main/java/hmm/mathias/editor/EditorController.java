package hmm.mathias.editor;

import hmm.mathias.Main;
import hmm.mathias.compiler.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.*;
import javafx.stage.FileChooser;
import javafx.stage.WindowEvent;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
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
    private CheckBox chkMostraTokens;

    @FXML
    private MenuItem mnuNovoArquivo;
    @FXML
    private MenuItem mnuAbrirArquivo;
    @FXML
    private MenuItem mnuSalvarArquivo;
    @FXML
    private MenuItem mnuCompilar;

    @FXML public void initialize(){
        txtLineNumber.setEditable(false);
        txtCodeOutput.setEditable(false);

        txtCode.setOnKeyReleased(event -> {
            ContadorDeLinhasEColunas();
            AuxiliarDeNovaLinha(event);
        });

        mnuNovoArquivo.setAccelerator(new KeyCodeCombination(KeyCode.N, KeyCombination.CONTROL_DOWN));
        mnuAbrirArquivo.setAccelerator(new KeyCodeCombination(KeyCode.O, KeyCombination.CONTROL_DOWN));
        mnuSalvarArquivo.setAccelerator(new KeyCodeCombination(KeyCode.S, KeyCombination.CONTROL_DOWN));
        mnuCompilar.setAccelerator(new KeyCodeCombination(KeyCode.B, KeyCombination.CONTROL_DOWN));
    }

    private void ContadorDeLinhasEColunas(){
        int caretPos = txtCode.getCaretPosition();
        String toCaret = txtCode.getText().substring(0, caretPos);
        int lastLBBeforeCaret = Math.max(0, toCaret.lastIndexOf("\n"));

        String lineno = String.valueOf(toCaret.chars().filter(ch -> ch == '\n').count() +1);
        String caretStringLine = txtCode.getText().substring(lastLBBeforeCaret, caretPos);
        String columnNo = String.valueOf(caretStringLine.chars().reduce(0, (total, ch) -> total += ch == '\t' ? 4:1));
        String txt = "L: " + lineno  + " | C:" + columnNo;
        txtLineNumber.setText(txt);
    }

    private void AuxiliarDeNovaLinha(KeyEvent event){
        if(event.getCode() != KeyCode.ENTER || event.getEventType() != KeyEvent.KEY_RELEASED) return;
        int caretPos = txtCode.getCaretPosition() -1;
        String toCaret = txtCode.getText().substring(0, caretPos);
        String afterCaret = txtCode.getText().substring(caretPos+1);
        int lastLBBeforeCaret = Math.max(0, toCaret.lastIndexOf("\n"));
        int firstLBAfterCaret = Math.max(0, afterCaret.indexOf("\n")) + toCaret.length();
        String currentLine = txtCode.getText().substring(lastLBBeforeCaret, firstLBAfterCaret);
        int tabNumber = currentLine.chars().reduce(0, (total, ch) -> total += ch == '\t' ? 1:0);
        StringBuilder newCode = new StringBuilder(toCaret);
        newCode.append("\n");

        for(int i = 0; i < tabNumber; i++)
            newCode.append("\t");

        newCode.append(afterCaret);
        txtCode.setText(newCode.toString());
        txtCode.positionCaret(caretPos+tabNumber+1);
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
            txtCodeOutput.clear();
            ConfigService.setCaminhoPadrao(Path.of(arquivoAtual.getParent()));
            fileHash = CryptoService.CriarHashDeAlteracao(txtCode.getText());
            Main.primaryStage.setTitle("Compilador - " + arquivoAtual.getName());
        }
    }
    @FXML
    private void NovoArquivo(){
        if(!OnMudancaDeArquivo())
            return;

        txtCode.clear();
        txtCodeOutput.clear();
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
            String caminhoPadrao = ConfigService.getCaminhoPadrao().toString();

            FileChooser fileChooser = new FileChooser();
            fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Text Files", "*.txt"));
            fileChooser.initialDirectoryProperty().set(new File(caminhoPadrao));
            arquivoAtual = fileChooser.showSaveDialog(Main.primaryStage);
            if(arquivoAtual == null)
                return false;

            String caminhoDoArquivo = arquivoAtual.getAbsolutePath();
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
    private void Compile(ActionEvent event) {
        txtCodeOutput.setText("");
        if(txtCode.getText().replace(" ", "").replace("\n", "").equals(""))
            return;

        StringReader reader = new StringReader(txtCode.getText());
        FoxtranTokenManager tokenManager = new FoxtranTokenManager(new JavaCharStream(reader));
        LexicalAnalyst lexicalAnalyst = new LexicalAnalyst(tokenManager, chkMostraTokens.isSelected());
        //lexicalAnalyst.AddSkipToken(FoxtranConstants.NEW_LINE);

        lexicalAnalyst.LexicalParse();
        for(String message : lexicalAnalyst.FeedbackMessage){
            txtCodeOutput.appendText(message.replace("\n", " ").replace("\t", "") + "\n");
        }

        if(lexicalAnalyst.HasError){
            txtCodeOutput.appendText("\n---STATUS---\nOcorreram erros durante a analise lexica. Marque \"Mostrar Tokens\" para mais detalhes");
            return;
        }

        txtCodeOutput.appendText("\n---STATUS---\nAnalise lexica concluida com sucesso!\n");
        txtCodeOutput.appendText("\n Iniciando parsing!\n");

        reader = new StringReader(txtCode.getText());
        Foxtran foxtranParse = new Foxtran(reader);
        foxtranParse.printer = (token,erro) -> {
            StringBuilder msg = new StringBuilder();
            String linhaCol = "(L: " + token.beginLine + "|C: " + token.beginColumn +") ";
            msg.append(linhaCol);
            msg.append(erro);
            msg.append("\n");
            txtCodeOutput.appendText(msg.toString());
        };
        try{
            foxtranParse.Grammatica();
            txtCodeOutput.appendText("\n---STATUS---\nAnalise sintatica concluida com sucesso!\n");
        }catch (Exception e){
            txtCodeOutput.appendText(e.getMessage() + "\n");
            txtCodeOutput.appendText("Ocorreu um erro durante a compilacao do codigo!\n");
        }
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
