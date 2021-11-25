/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Olaoluwa
 */
public class DougLowe extends Application {

    Button btn;
    Label lbl;
    int iClickCount = 0;

    @Override
    public void start(Stage primaryStage) {
        btn = new Button();
        btn.setText("Click me please!");
        btn.setOnAction(e -> buttonClick());  // Find out how to write this if it is a set of methods
        btn.setOnAction(e -> buttonCounter());

//        StackPane root = new StackPane();
//        root.getChildren().add(btn);
        
        lbl = new Label();
        lbl.setText("You Have Not Clicked the Button!");
        
        BorderPane root = new BorderPane(); // Either oof these can be used, i.e BorderPane or StackPane only the method to add differentiate them
        root.setCenter(btn);
        root.setTop(lbl);
        

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Click Counter");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void buttonClick() {
        if (btn.getText() == "Click me please!") {
            btn.setText("You clicked me!");
        } else {
            btn.setText("Click me please!");
        }
    }
    public void buttonCounter(){
        iClickCount++;
        if(iClickCount == 1)
            lbl.setText("You have Clicked Once!");
        else
            lbl.setText("You have clicked " + iClickCount + " times.");
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Launching JavaFX");
        launch(args);
        System.out.println("Finished!");
    }

}
