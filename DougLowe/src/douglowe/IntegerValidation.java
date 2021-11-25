/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package douglowe;

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
import javafx.stage.Stage;

/**
 *
 * @author Olaoluwa
 */
public class IntegerValidation extends Application {

    Label fullName, email, age;
    TextField fullNameTF, emailTF, ageTF;
    Button okButton;

    @Override
    public void start(Stage primaryStage) {
        // For the fullname Label
        fullName = new Label("Fullname:");
        fullName.setAlignment(Pos.CENTER_RIGHT);

        // FOr the fullname textfiled 
        fullNameTF = new TextField();
        fullNameTF.setPromptText("Please Enter Fullname...");

        //Full name container
        HBox fullNamePane = new HBox(20);
        fullNamePane.getChildren().addAll(fullName, fullNameTF);

        email = new Label("Email:");
        email.setAlignment(Pos.CENTER_RIGHT);

        // FOr the fullname textfiled 
        emailTF = new TextField();
        emailTF.setPromptText("Please Enter Email...");

        //Full name container
        HBox emailPane = new HBox(20);
        emailPane.getChildren().addAll(email, emailTF);

        age = new Label("Age:");
        age.setAlignment(Pos.CENTER_RIGHT);

        // FOr the fullname textfiled 
        ageTF = new TextField();
        ageTF.setPromptText("Please Enter Your Age...");

        //Full name container
        HBox agePane = new HBox(20);
        agePane.getChildren().addAll(age, ageTF);

        okButton = new Button("OK");
        okButton.setOnAction(e -> btnOK_Click());

        VBox pane = new VBox(10);
        pane.getChildren().addAll(fullNamePane, emailPane, agePane, okButton);

        Scene scene = new Scene(pane, 300, 250);

        primaryStage.setTitle("Testing Validation");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void btnOK_Click() {
        String errorMessage = "";
        if (fullNameTF.getText().length() == 0) {
            errorMessage += "\nFullname is a required field.";
        }
        if (emailTF.getText().length() == 0) {
            errorMessage += "\nEmail is a required field.";
        }
        if (ageTF.getText().length() == 0) {
            errorMessage += "\nAge is a required field.";
        }
        if (errorMessage.length() == 0) {
            String message = "Dear "
                    + fullNameTF.getText()
                    + ", with "
                    + emailTF.getText()
                    + "."
                    + " Your age is "
                    + ageTF.getText();
            MessageBox.show(message, "Register");
        } else {
            MessageBox.show(errorMessage, "Missing Data");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    private boolean isInt(TextField f, String msg) {
        try {
            Integer.parseInt(f.getText());
            return true;
        } catch (NumberFormatException e) {
            MessageBox.show(msg, "Data Entry Error");
            return false;
        }
    }

    public void buttonOKClick() {
        if (isInt(ageTF,
                "You must enter an integer.")) {
            MessageBox.show("You entered "
                    + Integer.parseInt(ageTF.getText()),
                    "Your Number");
        }
        ageTF.requestFocus();
    }
}
