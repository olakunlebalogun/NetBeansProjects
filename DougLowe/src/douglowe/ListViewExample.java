/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package douglowe;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Olaoluwa
 */
public class ListViewExample extends Application {

    Stage stage;
    Scene scene1, scene2, scene3;
    Button scene1to2, scene1to3, scene2to1, scene2to3, scene3to1, scene3to2;
    Label sceneOneLabel, sceneTwoLabel, sceneThreeLabel;

    @Override
    public void start(Stage primaryStage) {
        stage = primaryStage;

        // Scene One design
        sceneOneLabel = new Label("TThis is my lesss than incredible Scene One");

        scene1to2 = new Button("To Scene Two");
        scene1to2.setOnAction(e -> sceneOneToTwoClicked());

        scene1to3 = new Button("To Scene Three");
        scene1to3.setOnAction(e -> sceneOneToThreeClicked());

        VBox paneOne = new VBox(20);
        paneOne.getChildren().addAll(sceneOneLabel, scene1to2, scene1to3);

        // Scene Two design
        sceneTwoLabel = new Label("This is more than i can say for the Second Scene");

        scene2to1 = new Button("To Scene One");
        scene2to1.setOnAction(e -> sceneTwoToOneClicked());

        scene2to3 = new Button("To Scene Three");
        scene2to3.setOnAction(e -> sceneTwoToThreeClicked());

        VBox paneTwo = new VBox(20);
        paneTwo.getChildren().addAll(sceneTwoLabel, scene2to1, scene2to3);

        // Scene Three design
        sceneThreeLabel = new Label("Oh my God Scene Three is Incredible");

        scene3to1 = new Button("To Scene One");
        scene3to1.setOnAction(e -> sceneThreeToOneClicked());

        scene3to2 = new Button("To Scene Two");
        scene3to2.setOnAction(e -> sceneThreeToTwoClicked());

        VBox paneThree = new VBox(20);
        paneThree.getChildren().addAll(sceneThreeLabel, scene3to1, scene3to2);

        scene1 = new Scene(paneOne, 300, 250);
        scene2 = new Scene(paneTwo, 300, 250);
        scene3 = new Scene(paneThree, 300, 250);

        stage.setTitle("Welcome to Scene One");
        stage.setScene(scene1);
        stage.show();
    }

    public void sceneOneToTwoClicked() {
        stage.setScene(scene2);
        stage.setTitle("Welcome to Scene Two");
    }

    public void sceneOneToThreeClicked() {

        stage.setScene(scene3);
        stage.setTitle("Welcome to Scene Three");
    }

    public void sceneTwoToOneClicked() {
        stage.setScene(scene1);
        stage.setTitle("Welcome to Scene One");

    }

    public void sceneTwoToThreeClicked() {
        stage.setScene(scene3);
        stage.setTitle("Welcome to Scene Three");

    }

    public void sceneThreeToOneClicked() {
        stage.setScene(scene1);
        stage.setTitle("Welcome to Scene One");

    }

    public void sceneThreeToTwoClicked() {
        stage.setScene(scene2);
        stage.setTitle("Welcome to Scene Two");

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
