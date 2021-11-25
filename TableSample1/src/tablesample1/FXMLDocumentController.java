package tablesample1;
import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;


public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private TableColumn<Phone, String> makerColumn;
    @FXML
    private TableColumn<Phone, String> modelColumn;
    @FXML
    private TableColumn<Phone, String> specColumn;
    @FXML
    private TableColumn<Phone, Double> priceColumn;
    @FXML
    private TextField searchTF;
    @FXML
    private TextField makerTF;
    @FXML
    private TextField modelTF;
    @FXML
    private TextField specTF;
    @FXML
    private TextField priceTF;
    @FXML
    private JFXButton addButton;
    @FXML
    private JFXButton removeButton;
    @FXML
    private JFXButton addToCartButton;
    @FXML
    private TableView<Phone> table;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        table.setItems(loadData());
        table.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        table.setPlaceholder( new Label("NO CONTENT"));
        setColumn();
        searchItem();
        
    }    
    public void setColumn(){
        makerColumn.setCellValueFactory(new PropertyValueFactory<Phone, String>("maker")); // makerColumn.setCellValueFactory(new PropertyValueFactory<Phone, String>("Maker"));
        modelColumn.setCellValueFactory(new PropertyValueFactory<Phone, String>("model"));
        specColumn.setCellValueFactory(new PropertyValueFactory<Phone, String>("spec"));
        priceColumn.setCellValueFactory(new PropertyValueFactory<Phone, Double>("price"));
    }
    
    public ObservableList<Phone> loadData(){
        ObservableList phone = FXCollections.observableArrayList();
        Phone ph1 = new Phone("Samsung", "A20", "3GB 32GB", 80000.00);
        phone.add(ph1);
        phone.add(new Phone("Itel", "S12", "2GB 16GB", 35000.00));
        phone.add(new Phone("Infinix", "Hot 5", "2GB 16GB", 40000.00));
        phone.add(new Phone("IPhone", "12", "4GB 64GB", 500000.00));
        return phone;
    }
    @FXML
    public void searchItem(){
        FilteredList<Phone> filteredData = new FilteredList<>(loadData(), p -> true);

        // Set the Filter predicate whenever the filter changes.
        searchTF.textProperty().addListener((observable, oldValue, newValue) -> {
            filteredData.setPredicate(Phone -> {
                //  if filter text is empty, display all persons.
                if (newValue == null || newValue.isEmpty()) {
                    return true;
                }

                // compare firstname and lastname of every person with the filtered text.
                String lowerCaseFilter = newValue.toLowerCase();
                if (Phone.getMaker().toLowerCase().contains(lowerCaseFilter)) {
                    return true; // filter matches firstname 
                } else if (Phone.getModel().toLowerCase().contains(lowerCaseFilter)) {
                    return true;
                } else if (Phone.getSpec().toLowerCase().contains(lowerCaseFilter)) {
                    return true;
                }  else if (Phone.getPrice().toString().toLowerCase().contains(lowerCaseFilter)) { 
                    return true;
                }
                
                return false;
            });
        });
            // Wrap the FilteredList in a SortedList
            SortedList<Phone> sortedData = new SortedList<>(filteredData);

            // Bind the SortedListcompany to the Tableview comparator
            sortedData.comparatorProperty().bind(table.comparatorProperty());

            // Add Sorted and Filtered data to the table.
            table.setItems(sortedData);
    }
    @FXML
    public void addButtonClicked(){
        Phone newPhone = new Phone(makerTF.getText(),modelTF.getText(), specTF.getText(), Double.valueOf(priceTF.getText()));
        table.getItems().add(newPhone);
        clearTextFields();
    }
    public void clearTextFields(){
        makerTF.clear();
        modelTF.clear();
        specTF.clear();
        priceTF.clear();
    }
    
    @FXML
    public void removeButtonClicked(){
        ObservableList<Phone> selectedItems = table.getSelectionModel().getSelectedItems();
        ObservableList<Phone> allItems = table.getItems();
        
        
        for (Phone i : selectedItems){
            allItems.remove(i);
        }
            
        
        clearTextFields();
    }
}
