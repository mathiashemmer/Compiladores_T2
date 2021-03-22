package hmm.mathias;

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

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = null;
        try{
            root = FXMLLoader.load(getClass().getResource("/hmm/mathias/editor/fxml/Editor.fxml"));
        }catch(Exception ex){
            System.out.println( "Exception on FXMLLoader.load()" );
            System.out.println( "  * " + ex );
            System.out.println( "    ----------------------------------------\n" );
            throw ex;
        }

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("/icon/sketch.png")));
        primaryStage.setMaximized(true);
        primaryStage.show();
    }
}
