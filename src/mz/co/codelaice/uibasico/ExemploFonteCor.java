
package mz.co.codelaice.uibasico;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author Elton Tomas Laice
 * @since 6/02/2015
 */
public class ExemploFonteCor extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        //Label com texto
        Label label = new Label("Ola CodeLaice");
        label.setFont(Font.font("Cambria", 16));
        label.setTextFill(Color.BLUE);
        
        //Label sem Texto
        Label label1 = new Label();
        label1.setText("Estou Programando em JavaFX");//Adiona texto a label1
        label1.setFont(Font.font("Cambria", 18));
        
        //Definição de cor usando RGB
        label1.setTextFill(Color.rgb(54, 210, 101));
        
        Label label2 = new Label("Como e Bom Programar em Java");
        label2.setFont(Font.font("Cambria", 24));
        label2.setTextFill(Color.rgb(210, 54, 96));

        
        Label label3 = new Label("Como e Bom Programar em Java");
        label3.setFont(Font.font("Arial", 30));
        label3.setTextFill(Color.rgb(54, 69, 210));
        
        VBox root = new VBox(label,label1,label2,label3);
        Scene scene = new Scene(root,550,150);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
