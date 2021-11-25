/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nigeriaapi;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Olaoluwa
 */
public class NavPageController implements Initializable {

    @FXML
    private Button state;
    @FXML
    private Button lga;
    @FXML
    private Button city;
    @FXML
    private Button logout;
    @FXML
    private BorderPane pane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void stateClicked(ActionEvent event)  {
        
        Parent parent;
        try {
            parent = FXMLLoader.load(getClass().getResource("State.fxml"));
            pane.setCenter(parent);
        Scene scene1 = new Scene(pane);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene1);
        window.show();
        } catch (IOException ex) {
            Logger.getLogger(NavPageController.class.getName()).log(Level.SEVERE, null, ex);
            //ex.printStackTrace();
        }
        
    }

    @FXML
    private void lgaClicked(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("Local.fxml"));
        pane.setCenter(parent);
        Scene scene1 = new Scene(pane);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene1);
        window.show();
    }

    @FXML
    private void cityClicked(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("City.fxml"));
       pane.setCenter(parent);
        Scene scene1 = new Scene(pane);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene1);
        window.show();
    }

    @FXML
    private void logoutClicked(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        pane.setCenter(parent);
        Scene scene1 = new Scene(pane);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene1);
        window.show();
    }
    
}
