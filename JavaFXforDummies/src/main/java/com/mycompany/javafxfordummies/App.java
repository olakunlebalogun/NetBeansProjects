package com.mycompany.javafxfordummies;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {
    Button btn;

    @Override
    public void start(Stage stage) {
        var javaVersion = SystemInfo.javaVersion();
        var javafxVersion = SystemInfo.javafxVersion();

        var label = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
        var scene = new Scene(new StackPane(label), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

//          // Create the button
//        btn = new Button();
//        btn.setText("Click me please!");
//        btn.setOnAction(e -> buttonClick());
//// Add the button to a layout pane
//        BorderPane pane = new BorderPane();
//        pane.setCenter(btn);
//// Add the layout pane to a scene
//        Scene scene = new Scene(pane, 300, 250);
//// Finalize and show the stage
//        stage.setScene(scene);
//        stage.setTitle("The Click Me App");
//        stage.show();
//    }
//    public void buttonClick() {
//        if ("Click me please!".equals(btn.getText())) {
//            btn.setText("You clicked me!");
//        } else {
//            btn.setText("Click me please!");
//        }
//    }

    public static void main(String[] args) {
        launch();
    }

}