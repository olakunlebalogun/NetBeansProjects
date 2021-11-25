/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questions;

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
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Olaoluwa
 */
public class PageTwoController implements Initializable {
 // THese here is the declaration of Question 4
    @FXML private RadioButton Q4RadioOne;
    @FXML private RadioButton Q4RadioTwo;
    @FXML private RadioButton Q4RadioThree;
    @FXML private RadioButton Q4RadioFour;
    
    // This here is the declaration  of Question 5
    @FXML private RadioButton Q5RadioOne;
    @FXML private RadioButton Q5RadioTwo;
    @FXML private RadioButton Q5RadioThree;
    @FXML private RadioButton Q5RadioFour;
    
    // This here is the declaration of Question 6 
    @FXML private RadioButton Q6RadioOne;
    @FXML private RadioButton Q6RadioTwo;
    @FXML private RadioButton Q6RadioThree;
    @FXML private RadioButton Q6RadioFour;
    
    
    private ToggleGroup Q4;               // The Toggle for Radioes in Question Four
    private ToggleGroup Q5;               // The Toggle for Radioes in Question Five
    private ToggleGroup Q6;             // The Toggle for Radioes in Question six

    public void switchtoPageThree(ActionEvent event) throws IOException{
        Parent pageThree = FXMLLoader.load(getClass().getResource("PageThree.fxml"));
        Scene pageThreeScene = new Scene(pageThree);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(pageThreeScene);
        window.show();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Declaring the fourth question in group
        Q4 = new ToggleGroup();
        this.Q4RadioOne.setToggleGroup(Q4);
        this.Q4RadioTwo.setToggleGroup(Q4);
        this.Q4RadioThree.setToggleGroup(Q4);
        this.Q4RadioFour.setToggleGroup(Q4);
        
        // Declaring the fifth question in group
        Q5 = new ToggleGroup();
        this.Q5RadioOne.setToggleGroup(Q5);
        this.Q5RadioTwo.setToggleGroup(Q5);
        this.Q5RadioThree.setToggleGroup(Q5);
        this.Q5RadioFour.setToggleGroup(Q5);
        
        // Declaring the fourth question in group
        Q6 = new ToggleGroup();
        this.Q6RadioOne.setToggleGroup(Q6);
        this.Q6RadioTwo.setToggleGroup(Q6);
        this.Q6RadioThree.setToggleGroup(Q6);
        this.Q6RadioFour.setToggleGroup(Q6);
        
    }    

    
}
