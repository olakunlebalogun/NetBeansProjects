/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaFXRevision;

import douglowe.MessageBox;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class StageSample extends Application {

    int iClickCount = 0;
    Button btn;

    @Override
    public void start(Stage primaryStage) {

        // Create the button
        btn = new Button();
        btn.setText("Click me please!");
        btn.setOnAction(e -> buttonClick());
// Add the button to a layout pane
        BorderPane pane = new BorderPane();
        pane.setCenter(btn);
// Add the layout pane to a scene
        Scene scene = new Scene(pane, 250, 150);
// Add the scene to the stage, set the title
// and show the stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("Click Counter");
        primaryStage.show();
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        // primaryStage.setFullScreen(true); // This ssets the stage to fullscreen
        //primaryStage.setMaximized(true);// This sets the screen to maximum size but not fullscreen
        //primaryStage.setIconified(true);
        primaryStage.setMaxHeight(550);
//        primaryStage.toFront();
        primaryStage.show();
//        primaryStage.close();
    }

    public static void main(String[] args) {
        launch(args);
    }

    public void buttonClick() {
        iClickCount++;
        if (iClickCount == 1) {
            MessageBox.show("You have clicked once.", "Click!");
        } else {
            MessageBox.show("You have clicked "
                    + iClickCount + " times.", "Click!");
        }
    }

}
