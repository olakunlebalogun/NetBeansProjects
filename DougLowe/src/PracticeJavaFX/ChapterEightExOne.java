/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticeJavaFX;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import douglowe.MessageBox;

/**
 *
 * @author Olaoluwa
 */
public class ChapterEightExOne extends Application {
    ComboBox<String> comboBox ;
    ListView<String> listView1, listView2;
    Button comboButton, listViewButton, listViewRemoveButton; 
    Label comboLabel;
    @Override
    public void start(Stage primaryStage) {
        // ComboBox Combination
        comboBox = new ComboBox<String>();
       
        comboBox.getItems().add("Rice"); comboBox.getItems().add("Beans"); comboBox.getItems().add("Garri"); comboBox.getItems().add("Yam");
        comboBox.setPromptText("Select Food"); comboBox.setVisible(true);
        
        comboButton = new Button("Select");
        comboButton.setOnAction(e -> comboButtonClicked());
        
        comboLabel = new Label("");
        
            // ListView 
        listView1 = new ListView<String>();
        listView2 = new ListView<String>();
        
        listView1.getItems().addAll("Apple", "Banana", "Pineapple", "Grape", "Orange", "Pear", "Avocadoes","Mango", "Tangerine", "Salad");
        
        
        listViewButton = new Button("Add");
        listViewButton.setOnAction( e -> List1toList2Clicked());
        
        listViewRemoveButton = new Button("Remove");
        listViewRemoveButton.setOnAction(e -> RemoveButtonClicked());
        
        VBox buttonPane = new VBox(10);
        buttonPane.getChildren().addAll(listViewButton,listViewRemoveButton);
        
        HBox listViewPane = new HBox(10);
        listViewPane.getChildren().addAll(listView1, buttonPane, listView2);
        
        
                
                
                
        VBox pane = new VBox();
        pane.getChildren().addAll(comboBox, comboButton, comboLabel, listViewPane);    pane.setPadding(new Insets(20));
 
        Scene scene = new Scene(pane, 600, 550);
        
        primaryStage.setTitle("ComboBox"); primaryStage.setScene(scene); primaryStage.show();
    }

    public void comboButtonClicked(){
        String value = comboBox.getValue();
        String message = "Thanks for selecting " + value;
        comboLabel.setText(message);
    }
    public void List1toList2Clicked(){
        ObservableList<String> selectedAddItem = listView1.getSelectionModel().getSelectedItems();
        for (String item : selectedAddItem){
            if(listView2.getItems().contains(item))
                MessageBox.show("This Item already exist", "Redundant!");
            else
                listView2.getItems().add(item);
        }
    }
    public void RemoveButtonClicked(){
        if(!listView2.getItems().isEmpty()){
            ObservableList<String> selectedRemoveItem = listView2.getSelectionModel().getSelectedItems();
            for (String item : selectedRemoveItem){
                listView2.getItems().remove(item);
                MessageBox.show("This Item has been Deleted from the List2", "Item Removed");
            }   
        }
       else
            listViewRemoveButton.setVisible(false);
        
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
