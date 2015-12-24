/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafilemanager;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author roland
 */
public class testClass {
    public testClass(){
        String currentDirectory = "/home/roland/dev";
        ArrayList<String> dirList = ShellHandler.ls(currentDirectory);
        
        for(String i : dirList){
            
            if(i.equals(".") || i.equals("..")){
                
            }else{
                
                File file = new File(currentDirectory+"/"+i);
                
                
                FileModel model = new FileModel();
            }
            
            System.out.println(i);
        }
        
    }
}
