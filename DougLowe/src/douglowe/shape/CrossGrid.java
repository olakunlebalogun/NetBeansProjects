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
public class CrossGrid extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Group group = new Group();
        Line one = null;
        Line two = null;
        Line three = null;
        Line four = null;
        
        for (int i = 0; i < 600; i += 10){
            one = new Line(0, i, i, 0);
            two = new Line(0+i, 600, 600, 0+i);
            three = new Line(0, 600-i, 0+i, 600);
            four = new Line(0+i, 0, 600, 600-i);
            group.getChildren().addAll(one, two, three, four);
        
        }
        
        
       
        
        Scene scene = new Scene(group, 600, 600);
        
        primaryStage.setTitle("Cross Lines");
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
