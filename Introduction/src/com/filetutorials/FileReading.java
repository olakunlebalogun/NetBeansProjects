/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.filetutorials;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Olaoluwa
 */
public class FileReading {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\DELL E5440\\Desktop\\testrun\\romeo.txt");
//        try{
//            FileReader fRead = new FileReader(f);
//            int n ;
//            String page = "";
//            while((n = fRead.read()) != -1){
//                //System.out.println((char)n );
//                page += (char)n;
//            } 
//            System.out.println(page);
//            System.out.println("Perfectly Executed!");
//
//        }catch(Exception e){
//            e.printStackTrace();
//        }
        try {
            FileReader fRead = new FileReader(f);
            BufferedReader buRead = new BufferedReader(fRead);
            String line = "";
//            String content = "";     // Try to use the commented lines of code and see the difference in output..
//            while((line = buRead.readLine())!= null){
//                content += line;
//            }
//            System.out.println(content);
            while ((line = buRead.readLine()) != null){
                System.out.println(line);
            }
            fRead.close();
            
        
        }catch(Exception e){
            e.printStackTrace();
        
        }
    }
    
}
