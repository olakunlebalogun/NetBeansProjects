/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package douglowe;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.SelectionModel;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Olaoluwa
 */
public class TreeViewSample extends Application {

    TreeItem andy, archie, happy, george, maude;

    public TreeItem<String> makeShow(String title,
            TreeItem<String> parent) {
        TreeItem<String> show = new TreeItem<String>(title);
        show.setExpanded(true);
        parent.getChildren().add(show);
        return show;
    }

    @Override
    public void start(Stage primaryStage) {
        TreeItem root = new TreeItem("Spin Offs ");
        root.setExpanded(true);

        andy = makeShow("The Andy Griffith Show", root);

        makeShow(
                "Gomer Pyle, U.S.M.C.", andy);
        makeShow(
                "Mayberry R.F.D.", andy);

        archie = makeShow("All in the Family", root);
        george = makeShow("The Jeffersons", archie);

        makeShow(
                "Checking In", george);
        maude = makeShow("Maude", archie);

        makeShow(
                "Good Times", maude);
        makeShow(
                "Gloria", archie);
        makeShow(
                "Archie Bunker's Place", archie);

        happy = makeShow("Happy Days", root);

        makeShow(
                "Mork and Mindy", happy);
        makeShow(
                "Laverne and Shirley", happy);
        makeShow(
                "Joanie Loves Chachi", happy);
        TreeView tree;
        tree = new TreeView(root);

        tree.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        tree.setShowRoot(false);

        StackPane pane = new StackPane();
        pane.getChildren().add(tree);

        Scene scene = new Scene(pane, 700, 800);

        primaryStage.setTitle("This is an Amazing Tree View Sample");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
