/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticeJavaFX;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

/**
 *
 * @author Olaoluwa
 */
public class RegForm extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    
    Label nameLabel, dobLabel, genderLabel, ResLabel, TechLabel, EduLabel, locLabel;
    TextField nameTextField;
    DatePicker dobDatePicker;
    RadioButton maleRadio, femaleRadio;
    Button yesButton, noButton, RegButton;
    CheckBox javaChkBox, dotnetChkBox;
    ListView eduListView;
    ComboBox locComboBox;
    
    @Override
    public void start(Stage primaryStage) {
        // This Instantiating all Label
        nameLabel = new Label("Name");
        dobLabel = new Label("Date of Birth");
        genderLabel = new Label("Gender");
        ResLabel = new Label("Reservation");
        TechLabel = new Label("Technologies Known");
        EduLabel = new Label("Educational Qualification");
        locLabel = new Label("Location");

        // Instantiating all other Nodes 
        nameTextField = new TextField();
        dobDatePicker = new DatePicker();
        // RadioButtons
        maleRadio = new RadioButton("Male");
        femaleRadio = new RadioButton("Female");
        ToggleGroup sex = new ToggleGroup();
        maleRadio.setToggleGroup(sex);
        femaleRadio.setToggleGroup(sex);
        // The Buttons
        yesButton = new Button("Yes");
        noButton = new Button("No");
        RegButton = new Button("Register");
        RegButton.setOnAction(e -> regButtonClicked());

        // CheckBoxes 
        javaChkBox = new CheckBox("Java");
        dotnetChkBox = new CheckBox("DotNet");

        // For the ListView
        ObservableList eduObsvList = FXCollections.observableArrayList();
        eduObsvList.addAll("Enginnering", "MCA", "MBA", "Graduation", "MTECH", "Mphil", "Phd");
        //eduListView.setPrefHeight(50);
        //eduListView.setMaxSize(400, 500);
        eduListView = new ListView(eduObsvList);
        eduListView.setMaxHeight(500);
        

        // For the ComboBox 
        ObservableList locObsvList = FXCollections.observableArrayList();
        locObsvList.addAll("Hyderadad", "Chennai", "Delhi", "Mumbai", "Vishakhapatnam");
        locComboBox = new ComboBox(locObsvList);
        
        GridPane pane = new GridPane();
        pane.setHgap(10);
        pane.setVgap(10);
        pane.add(nameLabel, 0, 0);
        pane.add(nameTextField, 1, 0);
        pane.add(dobLabel, 0, 1);
        pane.add(dobDatePicker, 1, 1);
        pane.add(genderLabel, 0, 2);
        pane.add(maleRadio, 1, 2);
        pane.add(femaleRadio, 2, 2);
        pane.add(ResLabel, 0, 3);
        pane.add(yesButton, 1, 3);
        pane.add(noButton, 2, 3);
        pane.add(TechLabel, 0, 4);
        pane.add(javaChkBox, 1, 4);
        pane.add(dotnetChkBox, 2, 4);
        pane.add(EduLabel, 0, 5);
        pane.add(eduListView, 1, 5);
        pane.add(locLabel, 0, 6);
        pane.add(locComboBox, 1, 6);
        pane.add(RegButton, 2, 6);
        ColumnConstraints  colOne = new ColumnConstraints(200, 200, 300);
        ColumnConstraints colTwo = new ColumnConstraints(400, 400, 400);
        ColumnConstraints colThree = new ColumnConstraints(100, 100, 150);
        pane.getColumnConstraints().addAll(colOne, colTwo, colThree);
        AnchorPane mainPane = new AnchorPane();
        mainPane.setPadding(new Insets(40));
        mainPane.getChildren().add(pane);
        
        Scene scene = new Scene(mainPane);
        scene.getStylesheets().add(getClass().getResource("RegFormCSS.css").toExternalForm());
        
        primaryStage.setTitle("Registration Form");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void regButtonClicked() {
        
    }    

}
/*
The Padding, Margin of the form
The Listview Should display limited number of rows
The Buttons should perform their respective functions 
Do the CSS Design
*/