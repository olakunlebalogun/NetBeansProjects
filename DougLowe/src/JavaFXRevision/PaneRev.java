/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaFXRevision;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Olaoluwa
 */
public class PaneRev extends Application {

    @Override
    public void start(Stage primaryStage) {
       // HBox pane = new HBox();

        // The needed controls 
        Button btn1 = new Button("One");
        Button btn2 = new Button("Two");
        Button btn3 = new Button("Three");

        HBox.setMargin(btn1, new Insets(10));
        HBox.setMargin(btn2, new Insets(10));
        HBox.setMargin(btn3, new Insets(10));

        Region rgn1 = new Region();
        Region rgn2 = new Region();
        

        HBox.setHgrow(rgn1, Priority.SOMETIMES);
        HBox.setHgrow(rgn2, Priority.SOMETIMES);

//        pane.getChildren().addAll(10, btn1, btn2, rgn1, btn3);
        HBox hbox = new HBox(10, btn1, rgn2, btn2, rgn1, btn3);
        
        Scene scene = new Scene(hbox,350, 200);

        primaryStage.setTitle("Region in Pane");
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
