/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package douglowe;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author Olaoluwa
 */
public class RolePlayer extends Application {

    TextField txtCharacter;
    TextField txtActor;

    @Override
    public void start(Stage primaryStage) {
        
// Create the Character 
        Label lblCharacter = new Label("Character's Name:");
        lblCharacter.setMinWidth(100);
        lblCharacter.setAlignment(Pos.BOTTOM_RIGHT);
        
// Create the Character text field 
        txtCharacter = new TextField();

        txtCharacter.setMinWidth(200);
        txtCharacter.setMaxWidth(200);
        txtCharacter.setPromptText("Enter the name of the character here.");
        
// Create the Actor label 
        Label lblActor = new Label("Actor's Name:");
        lblActor.setMinWidth(100);
        lblActor.setAlignment(Pos.BOTTOM_RIGHT);
        
// Create the Actor text field 
        txtActor = new TextField();
        txtActor.setMinWidth(200);
        txtActor.setMaxWidth(200);
        txtActor.setPromptText("Enter the name of the actor here.");
        
// Create the OK button 
        Button btnOK = new Button("OK");
        btnOK.setMinWidth(75);
        btnOK.setOnAction(e -> btnOK_Click());
        
// Create the Character pane 
        HBox paneCharacter = new HBox(20, lblCharacter, txtCharacter);
        paneCharacter.setPadding(new Insets(10));
        
// Create the Actor pane 
        HBox paneActor = new HBox(20, lblActor, txtActor);
        paneActor.setPadding(new Insets(10));
        
// Create the Button pane 
        HBox paneButton = new HBox(20, btnOK);
        paneButton.setPadding(new Insets(10));
        paneButton.setAlignment(Pos.BOTTOM_RIGHT);
        
// Add the Character, Actor, and Button panes to a VBox 
        VBox pane = new VBox(10, paneCharacter, paneActor, paneButton);
        
// Set the stage 
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Role Player");
        primaryStage.initStyle(StageStyle.DECORATED);
        primaryStage.toFront();
        primaryStage.show();
    }

    public void btnOK_Click() {
        String errorMessage = "";
        if (txtCharacter.getText().length() == 0) {
            errorMessage += "\nCharacter is a required field.";
        }
        if (txtActor.getText().length() == 0) {
            errorMessage += "\nActor is a required field.";
        }
        if (errorMessage.length() == 0) {
            String message = "The role of "
                    + txtCharacter.getText()
                    + " will be played by "
                    + txtActor.getText()
                    + ".";
            MessageBox1.show(message, "Cast");
        } else {
            MessageBox1.show(errorMessage, "Missing Data");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    

    /*
    THIS WORKS AS A DATA VALIDATION OF TEXTFIELDS, REFER TO THIS WHENEVER THERE IS A NEEED FOR THAT.
     */
    
    // Thia here is the validate code it is from Doug Lowe JavaFX for Dummies
    private boolean isInt(TextField f, String msg) {
        try {
            Integer.parseInt(f.getText());
            return true;
        } catch (NumberFormatException e) {
            MessageBox1.show(msg, "Data Entry Error");
            return false;
        }
    }
    // This is the method to be used for the button associated with it.
    public void buttonOKClick() {
        if (isInt(textCount,
                "You must enter an integer.")) {
            MessageBox1.show("You entered "
                    + Integer.parseInt(textCount.getText()),
                    "Your Number");
        }
        textCount.requestFocus();
    }
    
    private TextField textCount;

}
