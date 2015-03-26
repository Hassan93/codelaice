/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mz.co.codelaice.exemplos;

import java.time.LocalDate;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Elton Tomas Laice
 */
public class FormularioBasico extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        //Cria Label com texto "Nome"
        Label nomeLabel = new Label("Nome");
        
        //Cria Label com texto "Apelido"
        Label apelidoLabel = new Label("Apelido");
        
        //Cria Label com texto "Data de Nascimento"
        Label dataNacimentoLabel = new Label("Nascimento");
        
        //Cria Label com texto "Sexo"
        Label sexoLabel = new Label("Sexo");
        
        //Cria Label com texto "Area de Formacao"
        Label formacaoLabel = new Label("Area de Formacao");
        
        //Cria Label com texto "Informacoes Gerais"
        Label infoGeraisLabel = new Label("Informacoes Gerais");
        
        //Cria campo para receber nome do usuario
        TextField nomeField = new TextField();
        
        //Cria campo para receber Apelido do usuario
        TextField apelidoField = new TextField();
        
        ////Cria campo para usuario definir data de nascimento
        DatePicker dataNascDatePicker = new DatePicker(LocalDate.MIN);
        
        //definicao de sexo do usuario
        RadioButton femeninoRadioButton = new RadioButton("Femenio");
        RadioButton masculinoRadioButton = new RadioButton("Masculino");
        
        //Lista de Areas de formacao em uma combobox
        ComboBox<String> formacaoComboBox = new ComboBox<>();
        
        //Adicao de elementos(Profissoesou area de formacao)
        formacaoComboBox.getItems().addAll("Programador","DBA","Eng. de Software"
                ,"Gestor de Projectos");
        
        //Cria campo para receber Informacoes Gerais do usuario
        TextArea infoGeraisTextArea = new TextArea();
        
        //Cria button para salvar dados
        Button salvarButton = new Button("Salvar");
        
        //Cria button para limpar dados no formulario
        Button limoparButton = new Button("Limpar");
        
        GridPane form = new GridPane();
        form.setVgap(5);
        form.setHgap(5);
        
        form.add(nomeLabel, 0, 0);
        form.add(apelidoLabel, 0, 1);
        form.add(dataNacimentoLabel, 0, 2);
        form.add(sexoLabel, 0, 3);
        form.add(formacaoLabel, 0, 4);
        form.add(infoGeraisLabel, 0, 5);
        
        form.add(nomeField,1,0);
        form.add(apelidoField,1,1);
        form.add(dataNascDatePicker,1,2);
        form.add(femeninoRadioButton,1,3);
        form.add(formacaoComboBox,1,4);
        form.add(infoGeraisTextArea,1,5,2,1);
        
        Scene scene = new Scene(form, 500, 250);
        
        primaryStage.setTitle("Hello World!");
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
