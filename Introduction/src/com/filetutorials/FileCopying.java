/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.filetutorials;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Olaoluwa
 */
public class FileCopying {
    public static void main(String[] args) {
        
        FileInputStream srcIn = null;
        
//        for (File f : src.listFiles()){
//            System.out.println(f.getAbsolutePath());
//            
//        }
        try{
            File src = new File("C:\\Users\\DELL E5440\\Desktop\\AllFolders\\RandomYoutubeVideos\\How to practice effectively...for just about anything - Annie Bosler and Don Greene.mp4");
            File des = new File("C:\\Users\\DELL E5440\\Desktop\\testrun");
            srcIn = new FileInputStream(src);
            FileOutputStream desOut = new FileOutputStream(des);
            for (File f : src.listFiles()){
                byte [] data = new byte[1024];
                int iRead = 0;
                
                while (( iRead = srcIn.read(data, 0,data.length ) ) != -1){
                    desOut.write(data, 0, iRead);
                }
                desOut.flush();
                desOut.close();
                System.out.println("This File " + f + " has been copied");
            }
            
        
        }catch (Exception ex){
           //ex.printStackTrace();
           Logger.getLogger(FileCopying.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
