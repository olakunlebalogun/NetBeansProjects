/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package douglowe;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.converter.DoubleStringConverter;
import javafx.util.converter.IntegerStringConverter;

/**
 *
 * @author Olaoluwa
 */
public class EditableTable extends Application {
    
    public static void main(String[] args) {
        launch(args);
    }

    private TableView<Movie> table;
    private TextField txtTitle, txtYear, txtPrice;

    @Override
    public void start(Stage primaryStage) {
        Label lblHeading = new Label("Movie Inventory");
        lblHeading.setFont(new Font("Arial", 20));
        
        table = new TableView();
        table.setEditable(true);
        table.setItems(loadData());
        
        TableColumn<Movie,String> colTitle = new TableColumn("Title");
        colTitle.setMinWidth(300);
        colTitle.setCellValueFactory( new PropertyValueFactory("Title"));
        colTitle.setCellFactory(TextFieldTableCell.forTableColumn());
        colTitle.setOnEditCommit(e -> colTitle_OnEditCommit(e));
        
        TableColumn<Movie, Integer> colYear = new TableColumn("Year");
        colYear.setMinWidth(100);
        colYear.setCellValueFactory(new PropertyValueFactory("Year"));
        colYear.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
        colYear.setOnEditCommit(e -> colYear_OnEditCommit(e));
        
        TableColumn<Movie, Double> colPrice = new TableColumn("Price");
        colPrice.setMinWidth(100);
        colPrice.setCellValueFactory(new PropertyValueFactory("Price"));
        colPrice.setCellFactory(TextFieldTableCell.forTableColumn(new DoubleStringConverter()));
        colPrice.setOnEditCommit(e -> colPrice_OnEditCommit(e));
        
        table.getColumns().addAll(colTitle, colYear, colPrice);
        
        txtTitle = new TextField();
        txtTitle.setPromptText("Title");
        txtTitle.setMinWidth(100);
        
        txtYear = new TextField();
        txtYear.setMaxWidth(100);
        txtYear.setPromptText("Year");
        
        txtPrice = new TextField();
        txtPrice.setMaxWidth(100);
        txtPrice.setPromptText("Price");
        
        Button btnAdd = new Button("Add");
        btnAdd.setMinWidth(60);
        btnAdd.setOnAction(e -> btnAdd_Clicked());
        
        Button btnDelete = new Button("Delete");
        btnDelete.setMinWidth(60);
        btnDelete.setOnAction(e -> btnDelete_Clicked());
        
        HBox paneAdd = new HBox();
        paneAdd.setSpacing(8);
        paneAdd.getChildren().addAll(txtTitle, txtYear, txtPrice,btnAdd, btnDelete);
        
        VBox paneMain = new VBox();
        paneMain.setSpacing(10);
        paneMain.setPadding(new Insets(10, 10, 10, 10));
        paneMain.getChildren().addAll(lblHeading, table, paneAdd);

        Scene scene = new Scene(paneMain);

        primaryStage.setTitle("About Movie!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    

    public ObservableList<Movie> loadData() {
        ObservableList<Movie> data
                = FXCollections.observableArrayList();
        data.add(new Movie("It's a Wonderful Life",
                1946, 14.95));
        data.add(new Movie("Young Frankenstein",
                1974, 16.95));
        data.add(new Movie("Star Wars Episode 4",
                1976, 17.95));
        data.add(new Movie("The Princess Bride",
                1987, 16.95));
        data.add(new Movie("Glory",
                1989, 14.95));
        data.add(new Movie("The Game",
                1997, 14.95));
        data.add(new Movie("Shakespeare in Love",
                1998, 19.95));
        data.add(new Movie("The Invention of Lying",
                2009, 18.95));
        data.add(new Movie("The King's Speech",
                2010, 19.95));
        return data;
    }

    public void colTitle_OnEditCommit(Event e) {
        TableColumn.CellEditEvent<Movie, String> ce;
        ce = (TableColumn.CellEditEvent<Movie, String>) e;
        Movie m = ce.getRowValue();
        m.setTitle(ce.getNewValue());
    }

    public void colYear_OnEditCommit(Event e) {
        TableColumn.CellEditEvent<Movie, Integer> ce;
        ce = (TableColumn.CellEditEvent<Movie, Integer>) e;
        Movie m = ce.getRowValue();
        m.setYear(ce.getNewValue());
    }

    public void colPrice_OnEditCommit(Event e) {
        TableColumn.CellEditEvent<Movie, Double> ce;
        ce = (TableColumn.CellEditEvent<Movie, Double>) e;
        Movie m = ce.getRowValue();
        m.setPrice(ce.getNewValue());
    }

    public void btnAdd_Clicked() {
        Movie m = new Movie();
        m.setTitle(txtTitle.getText());
        m.setYear(Integer.parseInt(txtYear.getText()));
        m.setPrice(Double.parseDouble(txtPrice.getText()));
        table.getItems().add(m);
        txtTitle.clear();
        txtYear.clear();
        txtPrice.clear();
    }

    public void btnDelete_Clicked() {
        ObservableList<Movie> sel, items;
        items = table.getItems();
        sel = table.getSelectionModel().getSelectedItems();
        for (Movie m : sel) {
            items.remove(m);
        }
    }
}
/*
There are so much to know in this stuff right here BASED on line number
1.  Line 55, 56, 57
2.  Line 61,62,63
3.  Line 67,68,69
4.  Method on Line 135 - Line 140
5.  Method on Line 142 - Line 147
6.  Method on Line 149 - Line 154

*/
