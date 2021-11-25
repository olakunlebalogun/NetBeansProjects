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
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Olaoluwa
 */
public class StarkFamilyTree extends Application {
    private TreeView<String> starkTree;
    
    public TreeItem<String> makeBranch(String title, TreeItem parent){
        TreeItem<String> newTreeItem = new TreeItem<String>(title);
        newTreeItem.setExpanded(true);
        
        parent.getChildren().add(newTreeItem);
        return newTreeItem;
        
    
    }
    
    @Override
    public void start(Stage primaryStage) {
        TreeItem<String> brandon, eddard, lyanna, benjen, root;
        root = new TreeItem<String>();
        root.setExpanded(true);
        
        brandon = makeBranch("Brandon Stark", root);
        
        eddard = makeBranch("Eddard Stark", root);
        makeBranch("Robb Stark", eddard);
        makeBranch("Sansa Stark", eddard);
        makeBranch("Arya Stark", eddard);
        makeBranch("Brandon Stark", eddard);
        makeBranch("Rickon Stark", eddard);
        
        lyanna = makeBranch("Lyanna Stark", root);
        makeBranch("Jon Snow", lyanna);
        
        
        benjen = makeBranch("Benjen Stark", root);
        
        
        
        
        starkTree = new TreeView<String>(root);
        starkTree.setShowRoot(false);
        
        
        StackPane pane = new StackPane();
        pane.getChildren().add(starkTree);
        
        
        Scene scene = new Scene(pane, 300, 250);
        
        primaryStage.setTitle("Hello World!");
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
