/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Olaoluwa
 */
public class PersonalAssignment extends Application {

    ChoiceBox<Laptop> rotemshop;
    Button showButton;

    @Override
    public void start(Stage primaryStage) {
        showButton = new Button("Display");
        showButton.setOnAction(e -> buttonClicked());
        rotemshop = new ChoiceBox<>();
        Laptop lapi1 = new Laptop("hp", "red", 23.3, "der", "der");
        rotemshop.getItems().add(lapi1);
        Laptop lapi2 = new Laptop("hp", "bfrd", 23.3, "derj", "der");
        rotemshop.getItems().add(lapi2);
        Laptop lapi3 = new Laptop("hp", "red", 23.3, "dvdber", "der");
        rotemshop.getItems().add(lapi3);
        rotemshop.setValue(lapi1);

//        ChoiceBox<Astronaut> apollo13;
//        apollo13 = new ChoiceBox<Astronaut>();
//        apollo13.getItems().add(new Astronaut("Jim", "Lovell"));
//        apollo13.getItems().add(new Astronaut(
//                "John", "Swigert"));
//        apollo13.getItems().add(new Astronaut("Fred", "Haise"));
        VBox root = new VBox(40);
        root.getChildren().addAll(rotemshop, showButton);

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void buttonClicked() {
        String message = "You chose ";
        message += rotemshop.getValue();
        MessageBoxClass.show(message, "Your Favorite Astronaut");

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
