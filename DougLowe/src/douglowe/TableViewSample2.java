/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package douglowe;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Olaoluwa
 */
public class TableViewSample2 extends Application {
    ObservableList<Laptop> data ;
    @Override
    public void start(Stage primaryStage) {
        TableView<Laptop> table = new TableView();
         
        table.setItems(loadData());
        
        
        StackPane root = new StackPane();
        root.getChildren().add(table);
       
        
        Scene scene = new Scene(root, 700, 650);
        
        primaryStage.setTitle("This really sucks!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public  ObservableList<Laptop> loadData(){
        ObservableList<Laptop> data =  FXCollections.observableArrayList();
        Laptop lp1 = new Laptop("Asus ", "Green",3000.34, "Notebook", "FC_551C");
        Laptop lp2 = new Laptop("HP", "Black", 2500.99, "Pavilion", "PV_321");
        data.add(lp1);
        data.add(lp2);
        return data;
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
