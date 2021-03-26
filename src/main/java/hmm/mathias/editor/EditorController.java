package hmm.mathias.editor;

import hmm.mathias.compiler.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.Console;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Scanner;

public class EditorController {
    private boolean NovoArquivo = true;
    private boolean ArquivoEditado = false;


    @FXML
    private TextArea txtCode;
    @FXML
    private TextArea txtCodeOutput;

    @FXML
    private void AbrirArquivo(){
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Escolha um arquivo de texto");
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Text Files", "*.txt"));
        File selectedFile = fileChooser.showOpenDialog(new Stage());
        if(selectedFile != null){
            NovoArquivo = false;
            txtCode.setText(LerArquivoParaEditor(selectedFile));
        }else{

        }
    }

    @FXML
    private void NovoArquivo(){
        txtCode.setText("");
        txtCodeOutput.setText("");

        NovoArquivo = true;
        ArquivoEditado = false;
    }


    @FXML
    private void Compile(ActionEvent event) throws ParseException {
        StringReader reader = new StringReader(txtCode.getText());
        txtCodeOutput.setText("");

        FoxtranTokenManager lexicalTester = new FoxtranTokenManager(new JavaCharStream(reader));
        Token currentToken = null;
        boolean error = false;

        do{
            try{
                currentToken = lexicalTester.getNextToken();

                if(currentToken.kind == FoxtranTokenManager.EOF || currentToken.kind == FoxtranTokenManager.LINEBREAK)
                    continue;

                String newLexema = GetTokenType(currentToken) + " '" + currentToken.toString()+ "' em (L:"+currentToken.beginLine+",C:"+currentToken.beginColumn+") ID:" + currentToken.kind + "\n";
                txtCodeOutput.setText(txtCodeOutput.getText() + newLexema);
            }catch (TokenMgrError e){
                txtCodeOutput.setText(txtCodeOutput.getText() + e.getMessage());
                continue;
            }
        } while(currentToken.kind != FoxtranTokenManager.EOF);
    }

    String GetTokenType(Token token){
        if(token == null)
            return "";

        int tokenId = token.kind;

        if(tokenId >= 6 && tokenId < 26)
            return "<PALAVRA RESERVADA>";
        if(tokenId >= 26 && tokenId < 50)
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
}
