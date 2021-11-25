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
import javafx.scene.control.TextArea;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.stage.Popup;
import javafx.stage.Stage;

/**
 *
 * @author Olaoluwa
 */
public class PopUp1 extends Application {
    Button button ;
    Label label;
    
    TextArea txt ;
    
    
    @Override
    public void start(Stage primaryStage) {
        
        button = new Button("Button");
        button.setTooltip(new Tooltip("This is a dynamic button"));
        label = new Label("This is a PopUp!");
        txt = new TextArea("This is a TextArea popup Message");
        TilePane tilepane = new TilePane();
        
        Popup popup = new Popup();
        
        popup.getContent().add(txt);
        
        label.setMinWidth(80);
        label.setMinHeight(50);
        
        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (!popup.isShowing())
                    popup.show(primaryStage);
                else
                    popup.hide();
            }
        };
        button.setOnAction(event);
        
        tilepane.getChildren().add(button);
        
        Scene scene = new Scene(tilepane, 200, 200);
        
        primaryStage.setTitle("Creating Pop-Up");
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
