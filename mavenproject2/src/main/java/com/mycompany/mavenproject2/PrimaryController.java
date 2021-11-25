package com.mycompany.mavenproject2;

import java.io.IOException;
import javafx.fxml.FXML;
import org.controlsfx.control.Notifications;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
    void open(){
      Notifications notify = Notifications.create();
      
    }
}
