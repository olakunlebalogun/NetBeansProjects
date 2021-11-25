/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticeJavaFX;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Olaoluwa
 */
public class LoginForm2 extends Application {
    Button screenOneButton, screenTwoButton;
    Stage stage;
    Scene scene1, scene2;
    Label screen1Label, screen2Label;
    @Override
    public void start(Stage primaryStage) {
        
        //Label in screen one
        screen1Label = new Label("Okay, This is Screen One!");
        
        // Label in Screen Two
        
        screen2Label = new Label("Oh My God! I'm in the Second Screen!");
        
        // This button switches to screen two.
        screenOneButton = new Button();
        screenOneButton.setText("Screen Two");
        screenOneButton.setOnAction(e ->buttonOneClicked());
        
        // This Button switches to screen one
        screenTwoButton = new Button();
        screenTwoButton.setText("Screen One");
        screenTwoButton.setOnAction(e ->buttonTwoClicked());
        
        // Screen One Pane
        VBox paneOne = new VBox();
        paneOne.getChildren().addAll(screen1Label,screenOneButton);
        
        //Screen Two Pane
        VBox paneTwo = new VBox();
        paneTwo.getChildren().addAll(screen2Label,screenTwoButton);
        
        
        
        scene1 = new Scene(paneOne, 300, 250);
        scene2 = new Scene(paneTwo, 300, 250);
        
        
        stage.setScene(scene1);
        stage.show();
    }
    public void buttonOneClicked(){
        stage.setScene(scene2);
      stage.setTitle("This is Screen Two");

        
    }
    public void buttonTwoClicked(){
    stage.setScene(scene1);
    stage.setTitle("This is Screen One");
    
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
