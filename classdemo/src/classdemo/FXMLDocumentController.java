/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classdemo;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Olaoluwa
 */
public class FXMLDocumentController implements Initializable {
    @FXML private Label headLabel;
    @FXML private TextField userTextField;
    @FXML private TextField passTextField;
    @FXML private JFXButton signInButton;
    @FXML private JFXCheckBox rbrmeCheckbox;
    @FXML private Hyperlink fPassHyperlink;
    @FXML private Label accLabel;
    @FXML private Hyperlink signupHyperlink;
    
    private void handleButtonAction(ActionEvent event) {
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
    }    
    
}
