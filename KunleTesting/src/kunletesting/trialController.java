/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kunletesting;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

/**
 *
 * @author Lanrebalo
 */
public class trialController implements Initializable {
    // These here declares all variable 
    @FXML private Label displayLabel;
    @FXML private CheckBox mathsCheckbox;
    @FXML private CheckBox chemCheckbox;
    @FXML private CheckBox phyCheckbox;
    
    public void selectButton(){
        String subjects = "";
        if ( mathsCheckbox.isSelected()){
            System.out.println("Mathematics");
            subjects += "\nMathematics";
        }
        if ( chemCheckbox.isSelected()){
            System.out.println("Chemistry");
            subjects += "\nChemistry";
        }
        if ( phyCheckbox.isSelected()){
            System.out.println("Physics");
            subjects += "\nPhysics";
        }
        this.displayLabel.setText("The two Subjects selected are: " + subjects);
        
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        displayLabel.setText("");
    }    
    
}
