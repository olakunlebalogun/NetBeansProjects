/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tryouthere;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Lanrebalo
 */
public class FxmlDocController implements Initializable {

    @FXML
    private AnchorPane state;
    @FXML
    private AnchorPane city;
    @FXML
    private AnchorPane lga;
    @FXML
    private BorderPane mainPane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void stateClicked(MouseEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        mainPane.setCenter(parent);
        Scene scene = new Scene(mainPane);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene);
        window.show();
    }

    @FXML
    private void cityClicked(MouseEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("City.fxml"));
        mainPane.setCenter(parent);
        Scene scene = new Scene(mainPane);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene);
        window.show();
    }

    @FXML
    private void lgaClicked(MouseEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("LGA.fxml"));
        mainPane.setCenter(parent);
        Scene scene = new Scene(mainPane);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene);
        window.show();
    }
    
}
