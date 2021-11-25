/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuproject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;

/**
 *
 * @author Olaoluwa
 */
public class FXMLDocumentController implements Initializable {
    
    
    @FXML
    private MenuBar menubar;
    @FXML
    private Menu fileMenuBar;
    @FXML
    private Menu editMenuBar;
    @FXML
    private Menu viewMenuBar;
    @FXML
    private Menu insertMenuBar;
    @FXML
    private Menu windowMenuBar;
    @FXML
    private Menu helpMenuBar;
    @FXML
    private Label fileNameLabel;
    @FXML
    private Button closeButton;
    
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }   
    public void readFile(File filename){
        try {
            FileReader fRead = new FileReader(filename);
            BufferedReader buRead = new BufferedReader(fRead);
            String line = "";
            while ((line = buRead.readLine()) != null){
                System.out.println(line);
            }
            fRead.close();
            
        
        }catch(Exception e){
            e.printStackTrace();
        
        }
    
    }
    
    public void writeFile(File filename, String text){
        try{
            //File f = new File("C:\\Users\\DELL E5440\\Desktop\\testrun\\legality.txt");
            FileWriter wrt = new FileWriter(filename);
            BufferedWriter buf = new BufferedWriter(wrt);
            buf.write(text);
            buf.close();
            System.out.println("File Copied");
            
        }catch(Exception e){
            e.printStackTrace();
        
        }
    
    }
    
    
    
    
}
