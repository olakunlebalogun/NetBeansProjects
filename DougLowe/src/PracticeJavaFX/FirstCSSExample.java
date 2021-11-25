/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticeJavaFX;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 *
 * @author Olaoluwa
 */
public class FirstCSSExample extends Application {
    Label emailLabel, passwordLabel;
    TextField emailTextField, passwordTextField;
    Button submitButton, clearButton;
    @Override
    public void start(Stage primaryStage) {
        emailLabel = new Label("Email");
        //emailLabel.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.REGULAR, 16));
        
        passwordLabel = new Label("Password");
       // passwordLabel.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.REGULAR, 16));
        
        submitButton = new Button("Submit");
        submitButton.setOnAction(e ->submitClicked());
        
        VBox paneOne = new VBox(15);
        paneOne.getChildren().addAll(emailLabel, passwordLabel, submitButton);
        paneOne.setAlignment(Pos.CENTER_LEFT);
        
        //Pane Two Design
        emailTextField = new TextField();
        emailTextField.setPromptText("Enter Your Email here");
        
        passwordTextField = new TextField();
        passwordTextField.setPromptText("Enter Your Password here");
        
        clearButton = new Button("Clear");
        clearButton.setOnAction(e ->ClearClicked());
        
        VBox paneTwo = new VBox(15);
        paneTwo.getChildren().addAll(emailTextField, passwordTextField, clearButton);
        paneTwo.setAlignment(Pos.BASELINE_LEFT);
        
        HBox paneThree = new HBox(5);
        paneThree.getChildren().addAll(paneOne, paneTwo);
        
        
        Scene scene = new Scene(paneThree ,300, 250);
        scene.getStylesheets().add("firstCSS,css");
        
        primaryStage.setTitle("CSS Example");
        
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public void submitClicked(){
    
    }
    public void ClearClicked(){
    
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
