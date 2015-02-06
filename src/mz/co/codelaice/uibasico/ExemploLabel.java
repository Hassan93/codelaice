package mz.co.codelaice.uibasico;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Elton Tomas Laice
 * @since 6/02/2015
 */
public class ExemploLabel extends Application{

    @Override
    public void start(Stage primaryStage){
        //Label com texto
        Label label = new Label("Ola CodeLaice");
        
        //Label sem Texto
        Label label1 = new Label();
        label1.setText("Estou Programando em JavaFX");//Adiona texto a label1
        
        VBox root = new VBox(label,label1);
        Scene scene = new Scene(root,300,50);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
  
    public static void main(String[] args) {
        launch(args);
    }
}
