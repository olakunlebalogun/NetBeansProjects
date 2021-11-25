/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statedemo;


import com.jfoenix.controls.JFXComboBox;
import java.net.URL;
import java.util.Collections;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.TreeSet;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 *
 * @author Hp
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private JFXComboBox<String> state;

    @FXML
    private JFXComboBox<String> lga;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        // TODO
                
        
        Set<String> statelist = Nigeria.getStateList();
        TreeSet<String> trlist = new TreeSet();
        trlist.addAll(statelist);
        state.getItems().addAll(trlist);
        addListener();
        state.setPromptText("Select State");
       state.setEditable(false);
        
    }    
    public void addListener(){
        state.valueProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
           List<String> lgalist = Nigeria.getLga(newValue);
          Collections.sort(lgalist);
           lga.getItems().clear();
          lga.getItems().addAll(lgalist);
            }
        });
    }
}
