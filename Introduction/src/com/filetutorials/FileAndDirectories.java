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
import java.io.FilenameFilter;
import java.io.IOException;

/**
 *
 * @author Olaoluwa
 */
public class FileAndDirectories {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        File set = new File("C:\\Users\\DELL E5440\\Videos\\FIlms");
        FilenameFilter directory = null;
        for ( File d : set.listFiles(directory)){
            if (d.isDirectory() == true){
                System.out.println(d);
            }
            
        }
        

            
    }
}
