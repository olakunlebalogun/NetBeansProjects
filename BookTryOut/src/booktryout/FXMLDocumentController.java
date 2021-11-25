/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booktryout;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.SelectionMode;

/**
 *
 * @author Olaoluwa
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML private Label displaylabel;
    @FXML private ComboBox combobox;
    @FXML private Button button; 
    
    public void onClickButton(){
        displaylabel.setText("Selected Subjects are: \n" +combobox.getValue().toString());
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        displaylabel.setText("");
        combobox.getItems().addAll("Mathematics", "English", "Chemistry", "Physics", "Biology");
        combobox.setPromptText("Select Subject");
        combobox.setValue("Select Course");
        combobox.setEditable(false);
        //combobox.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
    }    
    
}
