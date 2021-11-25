/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twitter;

import java.math.RoundingMode;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author Lanrebalo
 */
public class FXMLDocumentController implements Initializable {
    // The labels for each buttons
    @FXML private Label leoLabel;
    @FXML private Label ronLabel;
    @FXML private Label neyLabel;
    
    // The Buttons for each guys
    @FXML private Button leoButton;
    @FXML private Button ronButton;
    @FXML private Button neyButton;
    
    // The counts for each button when clicked.
    private double leoCount = 0;
    private double ronCount = 0;
    private double neyCount = 0;
    
    // ratio of vote
    private double leoValue;
    private double ronValue;
    private double neyValue;
    HashMap<String, Double> player;
    
    //Declaring that the answer should be in decimal points.
    
    
    
    
    public void pushLeoButton(){
        
        leoCount += 1;
        leoValue = (leoCount)*100/(leoCount + ronCount + neyCount);
        ronValue = (ronCount)*100/(leoCount + ronCount + neyCount);
        neyValue = (neyCount)*100/(leoCount + ronCount + neyCount);
        this.leoLabel.setText("" +leoValue +"%");
        this.ronLabel.setText("" +ronValue +"%");
        this.neyLabel.setText("" +neyValue +"%");
        
        
    
    }
    public void pushRonButton(){
       
        ronCount += 1;
        leoValue = (leoCount)*100/(leoCount + ronCount + neyCount);
        ronValue = (ronCount)*100/(leoCount + ronCount + neyCount);
        neyValue = (neyCount)*100/(leoCount + ronCount + neyCount);
        this.leoLabel.setText("" +leoValue +"%");
        this.ronLabel.setText("" +ronValue +"%");
        this.neyLabel.setText("" +neyValue +"%");
    
    }
    
    public void pushNeyButton(){
        
        neyCount += 1;
        leoValue = (leoCount)*100/(leoCount + ronCount + neyCount);
        ronValue = (ronCount)*100/(leoCount + ronCount + neyCount);
        neyValue = (neyCount)*100/(leoCount + ronCount + neyCount);
        
        this.leoLabel.setText(""+player.get("Messi") +"%");
        this.ronLabel.setText("" +ronValue +"%");
        this.neyLabel.setText("" +neyValue +"%");
    
    }
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        leoLabel.setText("");
        ronLabel.setText("");
        neyLabel.setText("");
        player.put("Messi",0.0);
        player.put("Ronaldo", 0.0);
        player.put("Neymer", 0.0);
    }    
    
}
