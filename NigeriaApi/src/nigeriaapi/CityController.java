/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nigeriaapi;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Olaoluwa
 */
public class CityController implements Initializable {

    @FXML
    private TextField state;
    @FXML
    private ComboBox<?> city;
    @FXML
    private ComboBox<?> lga;
    @FXML
    private Button add;
    @FXML
    private Button edit;
    @FXML
    private Button delete;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void cityComboClicked(ActionEvent event) {
    }

    @FXML
    private void lgaComboClicked(ActionEvent event) {
    }

    @FXML
    private void addClicked(ActionEvent event) {
    }

    @FXML
    private void editClicked(ActionEvent event) {
    }

    @FXML
    private void deleteClicked(ActionEvent event) {
    }
    
}
