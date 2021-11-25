/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.filetutorials;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Olaoluwa
 */
public class FileThing {
    public static void main(String[] args) throws IOException {
//        File f = new File("C:\\Users\\DELL E5440\\Desktop\\testrun\\illegality.txt");
//        try {
//            FileOutputStream fs = new FileOutputStream(f);
//            String mag = "The Only way i'm gonna stay here is if i get $2 billion for compensation ";
//            fs.write(mag.getBytes());
//            //fs.close();
//            String mag2 = "But on a serious note the only thing i enjoy here is silence, that is just it. I would"
//                    + " have preferred if the whole class had been done in lagos ffrom here, maybe the fuss about all these would have"
//                    + " reduced and the pressure too."
//                    + " \nThere so many things i would have written in this short notes of mine i call pouring my vent "
//                    + " i know you won't appreciate this little gesture of truth from me, but this is one of the best we you get to "
//                    + "enjoy me."; 
//            ObjectOutputStream fso = new ObjectOutputStream(fs);
//            fso.writeBytes ("this is bad");
//            fs.close();
//            //fso.close();
//            
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(FileThing.class.getName()).log(Level.SEVERE, null, ex);
//        }




//        try{
//            FileOutputStream filex = new FileOutputStream("C:\\Users\\DELL E5440\\Desktop\\testrun\\testing.txt", true);
//            OutputStreamWriter outfile = new OutputStreamWriter(filex);
//            BufferedWriter bufile = new BufferedWriter(outfile);
//            bufile.write("\n\nThis is different totally from the upper class, this one accepts OutputStreamWriter \n"
//                    + "and BufferedWriter, While the previous writing method accepts ObjectOutputWriter.");
//            bufile.newLine();
//            bufile.write("Have you noticed that i did use escape method of newline in the first string write method, but here to"
//                    + " seperate it with i used a newline method. \nSo as i was saying STUDY and KNOW the differences betwwen these"
//                    + " Stream of writing and reading to avoid confusion, \nTrust me you will be fine! ");
//            
//            System.out.println("Execution was successful!");
//            bufile.close();
//            outfile.close();
//        
//        }catch (Exception e){
//            e.printStackTrace();
//        
//        }
        try{
            //File f = new File("C:\\Users\\DELL E5440\\Desktop\\testrun\\legality.txt");
            FileWriter wrt = new FileWriter("C:\\Users\\DELL E5440\\Desktop\\testrun\\today.txt");
            wrt.write("Hello World");
            wrt.write("\n");
            wrt.write("Goodbye");
            wrt.close();
            System.out.println("This was processed properly");
            
        }catch(Exception e){
            e.printStackTrace();
        
        }
        
        
        
        
    }
    
}
