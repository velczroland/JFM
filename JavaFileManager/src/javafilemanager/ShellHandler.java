/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafilemanager;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author roland
 */
public class ShellHandler {
    
    private static String runShellCommand(String cmd){
        try{
            Process p = Runtime.getRuntime().exec(cmd);
            p.waitFor();
                    
            BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
            
            String line="";
            StringBuilder sb = new StringBuilder();
            
            while( (line = reader.readLine()) != null ){
                sb.append(line + "\n");
            }
            System.out.println( sb.toString() );
            return sb.toString();
        } catch(Exception e){
            //System.err.println(cmd);
            e.printStackTrace();
            return null;
        }
    }
    
    public static void cp(String from, String to){
    //TODO what happens if destination file already exists?
        runShellCommand("cp "+from+" "+to);
    }
    
    public static void mv(String from, String to){
    //TODO what happens if destination file already exists?
        runShellCommand("mv "+from+" "+to);
    }
    
    public static ArrayList<String> ls(String cmd){
        ArrayList<String> result = new ArrayList<>();
        try{
            Process p = Runtime.getRuntime().exec("ls -a "+cmd);
            p.waitFor();
                    
            BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
            
            String line="";
            StringBuilder sb = new StringBuilder();
            
            while( (line = reader.readLine()) != null ){
                //sb.append(line + "\n");
                result.add(line);
            }
            
            return result;
        } catch(Exception e){
            //System.err.println(cmd);
            e.printStackTrace();
            return result;
        }
    }
    
}
