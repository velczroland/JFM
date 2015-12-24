/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafilemanager;

import java.io.File;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;

/**
 *
 * @author roland
 */
public class FilePane extends FlowPane{
    
    private String currentDirectory;
    
    private class FileItem extends FlowPane{
        public FileItem(File file){
            setOrientation(Orientation.HORIZONTAL);
            if(file.exists()){
                this.getChildren().add(new Label(file.getName()));
                this.getChildren().add(new Label( Long.toString(file.getTotalSpace()) ));
            }else{
                this.getChildren().add(new Label("NULL"));
                this.getChildren().add(new Label("NULL"));
            }
        }
    }
    
    public FilePane(){
        //TODO ask home directory
        currentDirectory = "/home/roland";
        init();
    }
    
    public FilePane(String currentDirectory){
        this.currentDirectory = currentDirectory;
        init();
    }
    
    private void init(){
        this.setOrientation(Orientation.VERTICAL);
        test();
    }
        
    private void setListItems(){
        
    }
    
    //TODO delete method
    private void test(){
        /*ArrayList<String> dirList = ShellHandler.ls(currentDirectory);
        
        ObservableList<FileItem> items =FXCollections.observableArrayList ();
        
        
        for(String i: dirList){
            items.add(new FileItem( 
                new File(currentDirectory+"/"+i) ));
        }
        
        fileList = new ListView();
        fileList.setItems(items);
        
        this.getChildren().add(fileList);
        */
        
        TableView table = new TableView();
        table.setEditable(true);
        TableColumn fileName = new TableColumn("Name");
        TableColumn size = new TableColumn("Size");
        TableColumn ext = new TableColumn("ext");
        
        table.getColumns().addAll(fileName, size, ext);
        
        final VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 0, 0, 10));
        
        vbox.getChildren().add(table);
        
        this.getChildren().add(vbox);
    }
}
