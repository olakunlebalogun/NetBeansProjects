/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questions;

import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

/**
 *
 * @author Lanrebalo
 */
public class FXMLDocumentController implements Initializable {
    // Variables for the labels in each questions respectively
    @FXML private Label Q1label;
    @FXML private Label Q2label;
    @FXML private Label Q3label;
    
    
    // Radio button in Question1
    @FXML private RadioButton Q1RadioOne;
    @FXML private RadioButton Q1RadioTwo;
    @FXML private RadioButton Q1RadioThree;
    
    // Radio buttons in Q3
    @FXML private RadioButton Q3RadioOne;
    @FXML private RadioButton Q3RadioTwo;
    @FXML private RadioButton Q3RadioThree;
    @FXML private RadioButton Q3RadioFour;
    
    // Radio buttons in Q4
    @FXML private RadioButton Q4RadioOne;
    @FXML private RadioButton Q4RadioTwo;
    @FXML private RadioButton Q4RadioThree;
    @FXML private RadioButton Q4RadioFour;
    
   
    
    
    // The toggleGroups for the radio
    
    private ToggleGroup Q1 ;              // The Toggle for Radioes in Question One
    private ToggleGroup Q3;               // The Toggle for Radioes in Question Three
    
    
    
    //Checkboexes in Question 2
    @FXML private CheckBox Q2CheckOne;
    @FXML private CheckBox Q2CheckTwo;
    @FXML private CheckBox Q2CheckThree;
    @FXML private CheckBox Q2CheckFour;
    
    // The third page variable declaration
    @FXML private JFXTextField firstName;
    @FXML private JFXTextField lastName;
    @FXML private JFXTextField matricNo;
    
    //The Button Method
    // Configure this method to update score when pressed in the next page 
    
    
    public void switchtoPageTwo(ActionEvent event) throws IOException{
        Parent pageTwo = FXMLLoader.load(getClass().getResource("PageTwo.fxml"));
        Scene pageTwoScene = new Scene(pageTwo);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(pageTwoScene);
        window.show();
  
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        // Declaring the first question Toggles in group.
        Q1 = new ToggleGroup();
        this.Q1RadioOne.setToggleGroup(Q1);
        this.Q1RadioTwo.setToggleGroup(Q1);
        this.Q1RadioThree.setToggleGroup(Q1);
        
        // Declaring the Third Question in group.
        Q3 = new ToggleGroup();
        this.Q3RadioOne.setToggleGroup(Q3);
        this.Q3RadioTwo.setToggleGroup(Q3);
        this.Q3RadioThree.setToggleGroup(Q3);
        this.Q3RadioFour.setToggleGroup(Q3);
         
    }    
    
}
