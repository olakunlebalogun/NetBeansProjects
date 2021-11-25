/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package douglowe.shape;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/**
 *
 * @author Olaoluwa
 */
public class GridLines extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Group group = new Group();
        Line one = null; 
        Line two = null;
        
        for (int i = 0; i < 600; i += 10){
            one = new Line(i, 0, i, 600);
            two = new Line(0, i, 600, i);
            group.getChildren().addAll(one, two);
        }
        
        
       
       
        
        Scene scene = new Scene(group, 600, 600);
        
        primaryStage.setTitle("Grid Lines");
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
