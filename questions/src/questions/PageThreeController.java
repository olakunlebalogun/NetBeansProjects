/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questions;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author Olaoluwa
 */
public class PageThreeController implements Initializable {

    
    @FXML private Label answerLabel;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void buttonPressed(ActionEvent event) {
        int count = 0;
        double value;
        String word = "Your Score is: ";
        if (Q2CheckOne.isSelected() && Q2CheckTwo.isSelected()){
            count = count +1;
        }
//        else
//            count = count;
        
        if (Q1RadioTwo.isSelected())
            count += 1;
        
        if (Q3RadioFour.isSelected())
            count += 1;
        
        
        if (Q4RadioFour.isSelected())
            count +=1;
        
        if (Q5RadioThree.isSelected())
            count += 1;
        
        
        if (Q6RadioOne.isSelected())
            count += 1;
        
        
        value = (count/6.0)*100;
        
        
        this.answerLabel.setText("\nYour Score is: " + value + "%");
        //System.out.println(firstName.getText());
    }
    
}
