/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tryouthere;

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
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Lanrebalo
 */
public class LGAController implements Initializable {

    @FXML
    private TableColumn<?, ?> nameCol;
    @FXML
    private TableColumn<?, ?> lgaIdCol;
    @FXML
    private TableColumn<?, ?> stateIdCol;
    @FXML
    private TextField search;
    @FXML
    private TextField name;
    @FXML
    private TextField lgaID;
    @FXML
    private Button add;
    @FXML
    private Button remove;
    @FXML
    private TextField stateID;
    @FXML
    private Button home;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void addClicked(ActionEvent event) {
    }

    @FXML
    private void removeClicked(ActionEvent event) {
    }

    @FXML
    private void homeClicked(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("FxmlDoc.fxml"));
        Scene scene = new Scene(parent);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene);
        window.show();
    }
    
}
