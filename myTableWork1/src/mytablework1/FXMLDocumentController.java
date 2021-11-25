/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytablework1;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 *
 * @author Lanrebalo
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private TableView<Shoe> table;
    @FXML
    private TableColumn<Shoe, String> companyColumn;
    @FXML
    private TableColumn<Shoe, String> colorColumn;
    @FXML
    private TableColumn<Shoe, String> modelColumn;
    @FXML
    private TextField searchTextField;
    @FXML
    private TextField companyTextField;
    @FXML
    private TextField colorTextField;
    @FXML
    private TextField modelTextField;
    @FXML
    private Button addButton;
    @FXML
    private Button removeButton;
    
    ObservableList<Shoe> shoeObsvList = FXCollections.observableList(getShoe());       //  This Observable list is the lst structure for JavaFX. 
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        addButton.setTooltip(new Tooltip("Adds to the rows"));
        table.getItems().addAll(shoeObsvList);
        table.setPlaceholder(new Label("No Content"));  // Check the meaning of setplaceholder is displayed when there is no value or comtent in the table.
        table.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);// TO BE ABLE TO SELECT MORE THAN ONE ROW AT A TIME
        
        if (removeButton.isPressed()){
            clearTextFields();
        }
        else{
          updateSelection();
        }
        
        // Declaring the CellValueProperty and PropertyValueFactory of each column.
        companyColumn.setCellValueFactory(new PropertyValueFactory<>("company"));
        colorColumn.setCellValueFactory(new PropertyValueFactory<>("color"));
        modelColumn.setCellValueFactory(new PropertyValueFactory<>("model"));
    }   
    void updateSelection(){
        table.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Shoe>() {
            @Override
            public void changed(ObservableValue<? extends Shoe> observable, Shoe oldValue, Shoe newValue) {
                updateFields(newValue);
            }
        });
        
//        table.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Student>() { // for the row to be functionable
//            @Override
//            public void changed(ObservableValue<? extends Shoe> observable, Shoe oldValue, Shoe newValue) {
//                updateFields(newValue);
//                //print.setVisible(true);
//               
//            }
//        });
    }
    
    public void updateFields(Shoe newValue){
        colorTextField.setText(newValue.getColor());
        companyTextField.setText(newValue.getCompany());
        modelTextField.setText(newValue.getModel());
       
        //save.setText("Update");
    }
    public List<Shoe> getShoe(){
        List<Shoe> setOfShoes = new ArrayList<Shoe>();          // Creating a List of shoes from an array list
        Shoe sh1 = new Shoe("Nike", "White", "Airforce");       // Creating instances of shoes to be added to the arraylist
        Shoe sh2 = new Shoe("Adidas", "Blue", "Boot");
        Shoe sh3 = new Shoe("Puma", "Black", "Jumperman");
        Shoe sh4 = new Shoe("Timberland", "Gold", "Sandal");
        
        setOfShoes.add(sh1);        // Adding instances to arraylist
        setOfShoes.add(sh2);
        setOfShoes.add(sh3);
        setOfShoes.add(sh4);
        
        return setOfShoes;
    
    }

    @FXML
    private void addButtonClick() {
        Shoe newShoe = new Shoe(companyTextField.getText(), colorTextField.getText(), modelTextField.getText());
        table.getItems().add(newShoe);
        // These clears the whole TextFields in the window.
        clearTextFields();
    }

    @FXML
    private void removeButtonClick() {
        ObservableList<Shoe> selectedShoes;
        ObservableList<Shoe> allitems;
        
        selectedShoes = table.getSelectionModel().getSelectedItems();
        allitems = table.getItems();
        
        for (Shoe i : selectedShoes){
            allitems.remove(i);
        }
        
        
        
        
    }
    public void clearTextFields(){
        // These clears the whole TextFields in the window.
        companyTextField.clear();
        colorTextField.clear();
        modelTextField.clear();
        
    }
    
}
/*
**** Next Set of Work ****
1. Add and Update button for existing row
2. Clear before new add button clicked 
3. Send alert/Notification if all textfields are empty when add button pressed.
4. Make sure empty set of textfields cant add to the rows
5. Study the filter code.
6. Set tooltip on every cellvalue
7. Incase any cell of a row is empty set a default text to fill it.
8. Create select all button
9. Create a button that sends you to a new windows that displays all the properties of the shoe selected
10. This method does not verify that the user really wants to remove the selected
rows. In a more realistic program, you’d want to first display an alert box
asking the user whether she really wants to delete the rows. Then, you’d
delete the rows only if the user clicks Yes.
*/