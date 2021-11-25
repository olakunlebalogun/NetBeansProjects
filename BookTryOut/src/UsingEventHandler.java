/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.event.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

/**
 *THIS CODE BELOW IS HOW TO USE HANDLER WITH IMPLEMENTING EVENTHANDLER, THERE ARE ALTERNATES TO THIS METHOD LIKE: INNER-CLASS CREATION,
 * ANONYMOUS CLASS, AND USE OF LAMBDA... TO SEE THE FULL DETAILS CHECK TOPIC 3, DOUG LOWE- JAVAFX FOR DUMMIES 
 */
public class UsingEventHandler extends Application implements EventHandler <ActionEvent>{
    
    Button btnAdd;
    Button btnSubtract;
    Label lbl;
    int iCounter = 0;
    
    // Create the Add button
    @Override public void start(Stage primaryStage) {
        btnAdd = new Button();
        btnAdd.setText("Add");
        btnAdd.setOnAction(this);
        
        // Create the Subtract button
        btnSubtract = new Button();
        btnSubtract.setText("Subtract");
        btnSubtract.setOnAction(this);
        
        // Create a Label
        lbl = new Label();
        lbl.setText(Integer.toString(iCounter));
        
        // Add button and label to the HBOX pane
        HBox pane = new HBox(10);
        pane.getChildren().addAll(lbl, btnAdd,btnSubtract);
        
        // Add the layout pane to the scene
        Scene scene = new Scene(pane, 200, 75);
        
        //Add the scene to the stage, set the title and show the stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("Add/Sub");
        primaryStage.show();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void handle(ActionEvent e) {
        if (e.getSource() == btnAdd){
            iCounter++;
        }
        else {
            if (e.getSource() == btnSubtract){
                iCounter--;
            }
        }
        lbl.setText(Integer.toString(iCounter));
        
    }
    
    
}
