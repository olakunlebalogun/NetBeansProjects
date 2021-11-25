/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DougLowe;

//import static javafx.application.Application.launch;
//import javafx.application.*;
import javafx.application.Application;
//import static javafx.application.Application.launch;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;

/**
 *
 * @author Olaoluwa
 */
public class ClickMe extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    Button btn;

    @Override 
    public void start(Stage stage) {
// Create the button
        btn = new Button();
        btn.setText("Click me please!");
        btn.setOnAction(e -> buttonClick());
// Add the button to a layout pane
        BorderPane pane = new BorderPane();
        pane.setCenter(btn);
// Add the layout pane to a scene
        Scene scene = new Scene(pane, 300, 250);
// Finalize and show the stage
        stage.setScene(scene);
        stage.setTitle("The Click Me App");
        stage.show();
    }

    public void buttonClick() {
        if ("Click me please!".equals(btn.getText())) {
            btn.setText("You clicked me!");
        } else {
            btn.setText("Click me please!");
        }
    }

//    public void buttonClick() {
//        if (btn.getText() == "Click me please!") {
//            btn.setText("You clicked me!");
//        } else {
//            btn.setText("Click me please!");
//        }
//    }
}
