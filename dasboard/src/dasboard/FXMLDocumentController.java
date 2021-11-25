/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dasboard;

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
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author Lanrebalo
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private TextField name;
    @FXML
    private TextField capital;
    @FXML
    private TextField code;
    @FXML
    private Button add;
    @FXML
    private Button remove;
    @FXML
    private TableColumn<?, ?> nameCol;
    @FXML
    private TableColumn<?, ?> capitalCol;
    @FXML
    private TableColumn<?, ?> codeCol;
    @FXML
    private TextField search;
    @FXML
    private AnchorPane pane;
    @FXML
    private Button home;
    
    
    
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

    private void cityClicked(MouseEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("City.fxml"));
        Scene scene = new Scene(parent);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene);
        window.show();
    }

    private void lgaClicked(MouseEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("LGA.fxml"));
        
        Scene scene = new Scene(parent);

        
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene);
        window.show();
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
