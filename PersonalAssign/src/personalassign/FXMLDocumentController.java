/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalassign;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Window;

/**
 *
 * @author Olaoluwa
 */
public class FXMLDocumentController implements Initializable {

    // Buttons
    @FXML
    private Button okButton;
    @FXML
    private Button cancelButton;
    // Field Textbox
    @FXML
    private TextField nameTextBox;
    @FXML
    private TextField phoneTextBox;
    @FXML
    private TextField AddressTextBox;
    // Size RadioButton
    @FXML
    private RadioButton smallSizeRadio;
    @FXML
    private RadioButton mediumSizeRadio;
    @FXML
    private RadioButton largeSizeRadio;
    // Crust RadioButton
    @FXML
    private RadioButton thinCrustRadio;
    @FXML
    private RadioButton thickCrustRadio;
    // Toppings CheckBox 
    @FXML
    private CheckBox pepperoniToppingsCheck;
    @FXML
    private CheckBox mushroomToppingscheck;
    @FXML
    private CheckBox archoviesToppingsCheck;

    //  Creating ToggleGroups for the Radios 
    private ToggleGroup size;
    private ToggleGroup crust;

    // The Panes used 
    @FXML
    private AnchorPane anchorpane;
    @FXML
    //private GridPane gridpane;

    //okButton.setOnAction ( new EventHandler<ActionEvent>(){ 
        public void okbutton(ActionEvent event) {
            if (nameTextBox.getText().isEmpty() == true) {
                showAlert(Alert.AlertType.ERROR, anchorpane.getScene().getWindow(), "Form Error", "Please enter your name");
                return;
            }
            if (phoneTextBox.getText().isEmpty() == true) {
                showAlert(Alert.AlertType.ERROR, anchorpane.getScene().getWindow(), "Form Error", "Please Enter your Phone Number");
                return;
            }
            if (AddressTextBox.getText().isEmpty() == true) {
                showAlert(Alert.AlertType.ERROR, anchorpane.getScene().getWindow(), "Form Error", "Please Enter your home address");
                return;
            } 
            
            showAlert(Alert.AlertType.CONFIRMATION, anchorpane.getScene().getWindow(), "Successful!",
                    "Dear, " + nameTextBox.getText() + " You have ordered a " + size.getSelectedToggle().toString() + "size"
                    + crust.getSelectedToggle().toString() + "crust Pizza with ");
            
            

        }
   // }

private void showAlert(Alert.AlertType alertType, Window owner, String title, String message) {
        Alert alert = new Alert(alertType);  // this uses the alertType parameteer 
        alert.setTitle(title);  // the title is the title of the displayed pop-up message
        alert.setHeaderText(null);  // this is the Header if not necessary use null as the parameter, but it must be a string.
        alert.setContentText(message); // the message is the what informmation you passing in the pop-up 
        alert.initOwner(owner); //where do you want it dispalyed
        alert.show(); // show the pop-up message
    }
    
    
    @Override
        public void initialize(URL url, ResourceBundle rb) {
        // Declaring the Groups 
        size = new ToggleGroup();
        this.smallSizeRadio.setToggleGroup(size);
        this.mediumSizeRadio.setToggleGroup(size);
        this.largeSizeRadio.setToggleGroup(size);
        
        // Declaring the Groups 
        crust = new ToggleGroup();
        this.thinCrustRadio.setToggleGroup(crust);
        this.thickCrustRadio.setToggleGroup(crust);
        
        
    }
    
}
