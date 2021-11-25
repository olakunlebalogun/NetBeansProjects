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
public class Practice1 {
    public static void main(String[] args) {
        try{
            File fd1 = new File("C:\\Users\\DELL E5440\\Desktop\\folder1");
            File [] flist = fd1.listFiles();
             int count = 1;
            for (File f : flist){
                File fd2 = new File("C:\\Users\\DELL E5440\\Desktop\\folder2\\" +  f.getName());
                FileInputStream inFd1 = new FileInputStream(f);
                FileOutputStream outFd2 = new FileOutputStream(fd2);
                byte [] data = new byte[1024];
                int n = 0;
                while ((n = inFd1.read(data, 0, data.length)) != -1){
                    outFd2.write(data, 0, n);
                    
                }
                System.out.println("This file "+ f.getName() +" has been copied");
                outFd2.flush();
                outFd2.close();
                count += 1;
            }
            
        }catch (Exception e){
            e.printStackTrace();
        }
        
    }
}
