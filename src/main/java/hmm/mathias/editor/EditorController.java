package hmm.mathias.editor;

import hmm.mathias.compiler.DVV;
import hmm.mathias.compiler.ParseException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

import java.io.Console;
import java.io.StringReader;

public class EditorController {
    @FXML
    private TextArea txtCode;
    @FXML
    private TextArea txtCodeOutput;

    @FXML
    private void printHelloWorld(ActionEvent event) {
        event.consume();
        System.out.println("Button Pressed");
    }
    @FXML
    private void Compile(ActionEvent event) throws ParseException {
        StringReader reader = new StringReader(txtCode.getText());

        DVV compiler = new DVV(reader);
        try{
            compiler.Programa();
            txtCodeOutput.setText("Lexical parsing ok");
        }catch (Exception e){
            System.out.println(e.getMessage());
            txtCodeOutput.setText(e.getMessage());
        }
    }
}
