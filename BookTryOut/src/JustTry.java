/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 *
 * @author Olaoluwa
 */
public class JustTry extends Application {

    @Override
    public void start(Stage primaryStage) {
//        GridPane gridpane = new GridPane();
//        for (int i = 0; i < 5; i++) {
//                ColumnConstraints column = new ColumnConstraints(100);
//                gridpane.getColumnConstraints().add(column);
//        }
        Label headerLabel = new Label("Registration Form");
        headerLabel.setFont(Font.font("ARIAL",FontWeight.BOLD, 0));
        
        

        GridPane gridpane = new GridPane(); // This code creates a new Gridpane 
        gridpane.setAlignment(Pos.BOTTOM_RIGHT);// the position(pos) alignment does not work too
        gridpane.setPadding( new Insets(20,20,20,20)); // Though not completely sure, but it is the inner borderlining by say here 20 top,bottom,left,right.
        gridpane.alignmentProperty().set(Pos.TOP_RIGHT);
        gridpane.setHgap(10); // This sets the space between the elements used inside this gridpane by horinzontal height of 10
        gridpane.setVgap(20); // This sets the space between the elements used inside this gridpane by vertical diatance of 10
        //ColumnConstraints  columncom = ColumnConstraints
        gridpane.add(headerLabel, 0, 0, 2, 1);
        Scene scene = new Scene(gridpane, 800, 500);
        /* This code creates a scene which take the type of node(gridpane here) as a parameter, 
                                                       The 800 and 500 parameter is supposed to be the width and height of the scene but it does not work, 
                                                       to make it work, clean and build it, then you can run.
         */


        primaryStage.setTitle("Hello World!"); // This is to create a title on the pop-up windows like the title tag in HTML
        primaryStage.setTitle("This the default window"); // This is to create a title on the pop-up windows like the title tag in HTML
        primaryStage.setScene(scene);   // This is to set this particular scene on the stage
        primaryStage.show(); // Thus show this scene
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
