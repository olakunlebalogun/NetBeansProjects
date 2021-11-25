 

package tableproject;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import tableproject.model.Student;
import tableproject.service.AppService;

/**
 *
 * @author Olaoluwa
 */
public class FXMLDocumentController implements Initializable {
    

    private Label label;
    @FXML
    private TableView<Student> table;
    @FXML
    private TableColumn<Student, String> nameCol;
    @FXML
    private TableColumn<Student, String> idCol;
    @FXML
    private TableColumn<Student, String> phoneCol;
    @FXML
    private TableColumn<Student, String> matricCol;
    @FXML
    private TableColumn<Student, Double> feeCol;
    @FXML
    private TextField nameTextField;
    @FXML
    private TextField idTextField;
    @FXML
    private TextField phoneTextField;
    @FXML
    private TextField matricTextField;
    @FXML
    private TextField feeTextField;

    @FXML
    private Button save;
      @FXML
    private Button print;
    ObservableList<Student> roomobs = FXCollections.observableList(getStudent());
    @FXML
    private TextField filterTF;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        System.out.println("Loaded this");
        setColumnValue();
        populateTable();
        updateSelection();
        print.setVisible(false);
        //Wrap the Observation list  in a filteredList  (initialize display in all data)
        FilteredList<Student> filteredData = new FilteredList<>(roomobs, p -> true);

        // Set the Filter predicate whenever the filter changes.
        filterTF.textProperty().addListener((observable, oldValue, newValue) -> {
            filteredData.setPredicate(Student -> {
                //  if filter text is empty, display all persons.
                if (newValue == null || newValue.isEmpty()) {
                    return true;
                }

                // compare firstname and lastname of every person with the filtered text.
                String lowerCaseFilter = newValue.toLowerCase();
                if (Student.getName().toLowerCase().contains(lowerCaseFilter)) {
                    return true; // filter matches firstname 
                } else if (Student.getMatricNumber().toLowerCase().contains(lowerCaseFilter)) {
                    return true;
                } else if (Student.getPhoneNumber().toLowerCase().contains(lowerCaseFilter)) {
                    return true;
                } else if (Student.getStudentID().toLowerCase().contains(lowerCaseFilter)) {
                    return true;
                } else if (Student.getFees().toString().toLowerCase().contains(lowerCaseFilter)) { 
                    return true;
                }
//                else if (Student.getName().toLowerCase().contains(lowerCaseFilter)) { 
//                    return true;
//                }
                return false;
            });
        });
            // Wrap the FilteredList in a SortedList
            SortedList<Student> sortedData = new SortedList<>(filteredData);

            // Bind the SortedListcompany to the Tableview comparator
            sortedData.comparatorProperty().bind(table.comparatorProperty());

            // Add Sorted and Filtered data to the table.
            table.setItems(sortedData);
        

        
        
    }
    void updateSelection(){
        table.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Student>() {
            @Override
            public void changed(ObservableValue<? extends Student> observable, Student oldValue, 
                    Student newValue) {
                updateFields(newValue);
                print.setVisible(true);
               
            }
        });
    }
    
    public void updateFields(Student newValue){
        idTextField.setText(newValue.getStudentID());
        phoneTextField.setText(newValue.getPhoneNumber());
        matricTextField.setText(newValue.getMatricNumber());
       nameTextField.setText(newValue.getName());
        feeTextField.setText(newValue.getFees().toString());
        save.setText("Update");
    }
    
    @FXML
    public void addStudent(){
        if(save.getText().equals("Update")){
            updateRecord();
        }else{
            addRecord();
        }
        
    }
    void addRecord(){
        Student newStudent = new Student();
        newStudent.setFees(Double.valueOf(feeTextField.getText()));
        newStudent.setMatricNumber(matricTextField.getText());
        newStudent.setName(nameTextField.getText());
        newStudent.setPhoneNumber(phoneTextField.getText());
        newStudent.setStudentID(idTextField.getText());
        table.getItems().add(newStudent);
    }
    void updateRecord(){
        
    }
    void clear(){
        matricTextField.setText("");
    }

    void setColumnValue() {
        matricCol.setCellValueFactory(new PropertyValueFactory<>("matricNumber"));
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        phoneCol.setCellValueFactory(new PropertyValueFactory<>("phoneNumber"));
        feeCol.setCellValueFactory(new PropertyValueFactory<>("fees"));
        idCol.setCellValueFactory(new PropertyValueFactory<>("studentID"));

    }

    void populateTable() {
        table.setPlaceholder(new Label("No rows to display"));
        table.getItems().addAll(roomobs);
    }
    public void clearTextField(){
        nameTextField.clear();
        idTextField.clear();
        matricTextField.clear();
        phoneTextField.clear();
        feeTextField.clear();
        
    }

    public List<Student> getStudent(){
        return AppService.listStudent();
    }
    public void removeButtonClicked(){
       ObservableList<Student> selectedItem = table.getSelectionModel().getSelectedItems();
        ObservableList<Student> allItems = table.getItems();
        for (Student i : selectedItem){
            allItems.remove(i);
            AppService.deleteStudent(i.getStudentID());
            System.out.println("Deleted.");
        }
        
    }
}
