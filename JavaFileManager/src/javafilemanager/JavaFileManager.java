/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafilemanager;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 *
 * @author roland
 */
public class JavaFileManager extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        test();
        System.out.println("TODO: JavaFileManager / start");
    }
    
    //TODO delete method
    public void test(){
        
        Stage s = new Stage();
        s.setTitle("JFM - TestGUI");
        
        FilePane p = new FilePane();
        
        
        s.setScene(new Scene(p));
        s.setWidth(500);
        s.setHeight(500);
        s.show();
        
        //new testClass();
    }
    
}
