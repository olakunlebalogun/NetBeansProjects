/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.filetutorials;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author Olaoluwa
 */
public class ClassFileTut {
    public static void main(String[] args) throws FileNotFoundException, IOException {
//        File fi = new File("C:\\Users\\DELL E5440\\Desktop\\testrun\\ newFile.gif");
//        if (fi.createNewFile()){
//            System.out.println(" Done!");
//        }
//        else {
//            System.out.println("An Error Occured");
//        }
        try {
            File fi = new File("C:\\Users\\DELL E5440\\Desktop\\testrun\\romeo.txt");
            FileOutputStream outstr = new FileOutputStream(fi, true);
            ObjectOutputStream obj = new ObjectOutputStream(outstr);
            //String text = "This is what i intend to write to a file";
            obj.writeBytes("This is how life is");
//            System.out.println(outstr.toString());

            
//            outstr.write(text.getBytes());
            //outstr.close();
            obj.close();
        
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("The Error has been caught");
        
        }
    }
}
