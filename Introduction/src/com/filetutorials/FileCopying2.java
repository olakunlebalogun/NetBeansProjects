/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.filetutorials;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author Olaoluwa
 */
public class FileCopying2 {
    public static void main(String[] args) {
        try{
            File src = new File("C:\\Users\\DELL E5440\\Desktop\\All Folders\\RandomYoutubeVideos");
            
            File flist [] = src.listFiles();
            FileInputStream srcIn = null;
            for (File f : flist){
                File des = new File("C:\\Users\\DELL E5440\\Desktop\\testrun\\" + f.getName());
                srcIn = new FileInputStream(f);
                
                FileOutputStream desOut = new FileOutputStream(des);
                byte[] data = new byte[1024];
                int nRead = 0;
                while ((nRead = srcIn.read(data,0, data.length)) != -1){
                    desOut.write(data, 0, nRead);
                    
                }
                desOut.flush();
                desOut.close();
                
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
