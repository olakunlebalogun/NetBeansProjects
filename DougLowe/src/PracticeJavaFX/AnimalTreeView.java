
package PracticeJavaFX;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Olaoluwa
 */
public class AnimalTreeView extends Application {

    TreeView<String> treeView;
    TreeItem<String> root,animal, vertebrate, invertebrate;

    @Override
    public void start(Stage primaryStage) {
        treeView = new TreeView<String>();
        
        root = new TreeItem<String>("Roots"); 
        root.setExpanded(true);

        animal = getChild(root, "Animal");

        vertebrate = getChild(animal, "Vertebrate");
        invertebrate = getChild(animal, "Invertebrate");

        //All under Vertebrate
        getChild(vertebrate, "Pisces");
        getChild(vertebrate, "Birds");
        getChild(vertebrate, "Amphibians");
        getChild(vertebrate, "Reptiles");
        getChild(vertebrate, "Mammals");

        //All under Invertebrates
        getChild(invertebrate, "Polifera");
        getChild(invertebrate, "Colenrentara");
        getChild(invertebrate, "Phythehemithys");
        getChild(invertebrate, "Nematodas");
        getChild(invertebrate, "Annelida");
        getChild(invertebrate, "arthropada");
        getChild(invertebrate, "Mollusca");
        getChild(invertebrate, "Echinodermata");
        getChild(invertebrate, "Chordata");
        
        treeView.setRoot(root);
        treeView.setShowRoot(false);

        VBox pane = new VBox(10);
        pane.getChildren().add(treeView);

        Scene scene = new Scene(pane, 600, 700);

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public TreeItem<String> getChild(TreeItem<String> parent, String name) {
        TreeItem<String> child = new TreeItem<String>(name);
        child.setExpanded(true);
        parent.getChildren().add(child);
        return child;

    }

//    public TreeItem<String> makeShow(String title, TreeItem<String> parent) {
//        TreeItem<String> show = new TreeItem<String>(title);
//        show.setExpanded(true);
//        parent.getChildren().add(show);
//        return show;
//    }

    public static void main(String[] args) {
        launch(args);
    }

}
