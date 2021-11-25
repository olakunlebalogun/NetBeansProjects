/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package douglowe;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Olaoluwa
 */
public class SpinOffs extends Application {

    TreeView<String> tree;
    Label lblShowName;

    @Override
    public void start(Stage primaryStage) {
        TreeItem<String> root, andy, archie, happy, george, maude;
        
        root = new TreeItem<String>("Spin Offs");
        root.setExpanded(true);// To make the root expandable 
        
        andy = makeShow("The Andy Griffith Show", root);
        // Those Under andy with Display name The Andy Griffith
        
            makeShow("Gomer Pyle, U.S.M.C.", andy); // This is under andy with name "Gomer Pyle..."
            makeShow("Mayberry R.F.D", andy); // This is under andy with name "Mayberry..."
        
        // Those under archie called All in the Family
        archie = makeShow("All in the Family", root); // this is dirctly under root with name "All in the Family"
        
            george = makeShow("The Jeffersons", archie); // this is under archie, with name "The Jeffersons" 
                makeShow("Checking In", george); // this is under george, with name "The Jeffersons" 
        
            maude = makeShow("Maude", archie); // this is under archie, with name "Maude"
                makeShow("Good Times", maude);// this is under maude, with name "Good Times " while, george is under archie
        
            makeShow("Gloria", archie); // this is under archie, with name "Gloria"
            makeShow("Archie Bunker's Place", archie); // this is under archie, with name "Archie B..."
        
        happy = makeShow("Happy Days", root); // this is dirctly under root with name "Happy Days"
            //Those under happy called Happy Days
            makeShow("Mork and Mindy", happy);// this is under happy, with name "Mork and Mindy"
            makeShow("Laverne and Shirley", happy); // this is under happy, with name "Laverine and Shirley"
            makeShow("Joanie Loves Chachi", happy); // this is under happy, with name "Joanie Loves..."
        
        tree = new TreeView<String>(root);
        tree.setShowRoot(false);
        tree.getSelectionModel().selectedItemProperty()
                .addListener((v, oldValue, newValue)
                        -> tree_SelectionChanged(newValue));
        lblShowName = new Label();
        VBox pane = new VBox(10);
        pane.setPadding(new Insets(20, 20, 20, 20));
        pane.getChildren().addAll(tree, lblShowName);
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("My Favorite Spin Offs");
        primaryStage.show();  
    }

    public TreeItem<String> makeShow(String title, TreeItem<String> parent) {
        TreeItem<String> show = new TreeItem<String>(title);
        show.setExpanded(true);
        parent.getChildren().add(show);
        return show;
    }

    public void tree_SelectionChanged(TreeItem<String> item) {
        if (item != null) {
            lblShowName.setText(item.getValue());
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

}
