/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticeJavaFX.footballplayer;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class FootballPlayers extends Application {
    TableView players;
    TableColumn<Player, String> nameCol = new TableColumn<>("Player");
    TableColumn<Player, Double> valueCol = new TableColumn<>("Worth");
    TableColumn<Player, String> clubCol = new TableColumn<>("Club");
    TableColumn<Player, Integer> ageCol = new TableColumn<>("Age");
    @Override
    public void start(Stage primaryStage) {
        players = new  TableView();
        players.setItems(playerList);
        nameCol.setCellValueFactory( new PropertyValueFactory<Player, String>("player"));
        valueCol.setCellValueFactory(new PropertyValueFactory<Player, Double>("worth"));
        clubCol.setCellValueFactory(new PropertyValueFactory<Player, String>("club"));
        ageCol.setCellValueFactory(new PropertyValueFactory<Player, Integer>("age"));
        
        players.getColumns().addAll(nameCol, valueCol, clubCol, ageCol);
        players.setPlaceholder(new Label("Nothing here, get the fuck!"));
        
        VBox pane = new VBox();
        pane.getChildren().add(players);
                
        
        
        Scene scene = new Scene(pane, 600, 500);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    ObservableList<Player> playerList = FXCollections.observableArrayList(loadData());
    public ArrayList<Player> loadData(){
        ArrayList<Player> sample = new ArrayList<Player>();
        Player p1 = new Player("Messi", 100.00, "Barcelona", 33);
        Player p2 = new Player("Neymar", 90.00, "PSG", 28);
        Player p3 = new Player("Ronaldo", 85.00, "Juventus", 35);
        Player p4 = new Player("De Bruyne", 80.00, "Man City", 27);
        Player p5 = new Player("Lewandowski", 80.00, "Bayern Muchin", 31);
        sample.add(p1); sample.add(p2); sample.add(p3); sample.add(p4); sample.add(p5);
        return sample;
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
