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
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.stage.Popup;
import javafx.stage.Stage;

/**
 *
 * @author Olaoluwa
 */
public class PopUp2 extends Application {
    Button button;
    
    Label label;
    @Override
    public void start(Stage primaryStage) {
        
        button = new Button("popup");
        
        TilePane tilepane = new TilePane();
        
        label = new Label("This is a Popup");
        
        Popup popup = new Popup();
        popup.getContent().add(label);
        
        label.setMinWidth(80);
        label.setMinHeight(50);
        
        popup.setAutoHide(true);
        
        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (!popup.isShowing())
                    popup.show(primaryStage);
            }
        };
        
        button.setOnAction(event);
        
        tilepane.getChildren().add(button);
        
        
        
        
        Scene scene = new Scene(tilepane, 300, 250);
        
        primaryStage.setTitle("Creating Popup");
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
