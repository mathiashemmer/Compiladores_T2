package hmm.mathias;

import hmm.mathias.editor.EditorController;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    public static Stage primaryStage;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/hmm/mathias/editor/fxml/Editor.fxml"));
            Parent root = (Parent) loader.load();
            EditorController controller = loader.getController();
            primaryStage.setOnCloseRequest(controller::OnFechar);
            primaryStage.setScene(new Scene(root));
            primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("/icon/sketch.png")));
            primaryStage.setMaximized(true);
            primaryStage.setTitle("Compilador");
            primaryStage.show();

        }catch(Exception ex){
            System.out.println(ex.getMessage());
            throw ex;
        }
    }


}
