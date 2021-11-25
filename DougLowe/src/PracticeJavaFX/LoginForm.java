/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticeJavaFX;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.Window;

/**
 *
 * @author Olaoluwa
 */
public class LoginForm extends Application {
    Label loginHeader;
    Button signInButton, toSignUpButton;
    TextField nameTextField,passwordTextField;
    BorderPane pane;
    Scene loginScene, signUpScene;
    Stage stage;
    VBox nextScene;
    
    @Override
    public void start(Stage primaryStage) {
        stage = primaryStage;
        
        // This is Header Label to be displayed in the Login form
       loginHeader  = new Label("Login Page");
       loginHeader.setFont(Font.font("Calibri", FontWeight.BOLD, FontPosture.REGULAR, 24));
       loginHeader.setAlignment(Pos.CENTER);
       
       // Label for the name TextField
       Label nameLabel = new Label();
       nameLabel.setText("Name: ");
       nameLabel.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.REGULAR, 14));
      
       
       // The name text box
        nameTextField = new TextField();
        nameTextField.setPromptText("Please Enter Your Name...");
        nameTextField.setMinHeight(10);
        nameTextField.setMinWidth(300);
        nameTextField.setPadding(new Insets(15));
        nameTextField.setAlignment(Pos.CENTER_RIGHT);
        
        HBox namepane = new HBox(20);
        HBox.setMargin(nameLabel, new Insets(10));
        HBox.setMargin(nameTextField, new Insets(10));
        namepane.getChildren().addAll(nameLabel, nameTextField);
        
        // Label for the password TextField
       Label passwordLabel = new Label();
       passwordLabel.setText("Password: ");
       passwordLabel.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.REGULAR, 14));
      
       
       // The name text box
         passwordTextField = new TextField();
        passwordTextField.setPromptText("Please Enter Your Password...");
        passwordTextField.setMinWidth(300);
        passwordTextField.setMinHeight(10);
        passwordTextField.setPadding(new Insets(15));
        //passwordTextField.setAlignment(Pos.CENTER_LEFT);
        
        HBox passwordpane = new HBox(20);
        HBox.setMargin(passwordLabel, new Insets(10));
        HBox.setMargin(passwordTextField, new Insets(10));
        passwordpane.setAlignment(Pos.CENTER_LEFT);
        passwordpane.getChildren().addAll(passwordLabel, passwordTextField);
        
        
        
        
        signInButton = new Button("SIGN IN");
        signInButton.setPadding(new Insets(10));
        signInButton.setAlignment(Pos.CENTER_LEFT);
        signInButton.setDefaultButton(true);
        signInButton.setOnAction(e -> signInClicked());
        
        toSignUpButton = new Button("Sign Up here");
        toSignUpButton.setPadding(new Insets(10));
        toSignUpButton.setAlignment(Pos.CENTER_RIGHT);
        toSignUpButton.setDefaultButton(false);
        toSignUpButton.setOnAction(e -> signUpClicked());
        
        Region buttonRegion = new Region();
        
        HBox buttonPane = new HBox(20);
        HBox.setMargin(signInButton, new Insets(10));
        HBox.setMargin(toSignUpButton, new Insets(10));
        HBox.setMargin(buttonRegion, new Insets(10));
        
        HBox.setHgrow(buttonRegion, Priority.ALWAYS);
        buttonPane.getChildren().addAll(signInButton, buttonRegion, toSignUpButton);
        
        
        VBox centrePane = new VBox(20);
        centrePane.getChildren().addAll(loginHeader,namepane,passwordpane);
        pane = new BorderPane();
        pane.setCenter(centrePane);
        pane.setBottom(buttonPane);
        
        nextScene = new VBox();
        
  
        
        loginScene = new Scene(pane, 300, 250);
        
        stage.setTitle("Login Here");
        stage.setScene(loginScene);
        stage.show();
    }
    public void signInClicked(){
        if (nameTextField.getText().isEmpty()){
            displayAlert(Alert.AlertType.ERROR, pane.getScene().getWindow(), "Sign in Error!", "Please Enter Your Name...");
        }
        if (passwordTextField.getText().isEmpty()){
            displayAlert(Alert.AlertType.ERROR, pane.getScene().getWindow(), "Sign in Error!", "Please Enter Password...");
        }
        displayAlert(Alert.AlertType.CONFIRMATION, pane.getScene().getWindow(), "Congratulation!",  "Sign in Successful!");
        System.out.println("Sign in Successful!");
        
    }
    public void signUpClicked(){
        stage = new Stage();
        signUpScene = new Scene(nextScene, 300, 300);
        stage.setScene(signUpScene);
        
        
    }
    public void displayAlert(Alert.AlertType alerttype,Window owner, String title, String message){
        Alert alt = new Alert(alerttype);
        alt.setTitle(title);
        alt.setContentText(message);
        alt.initOwner(owner);
        alt.initModality(Modality.APPLICATION_MODAL);
        alt.show();
        
                
    
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
