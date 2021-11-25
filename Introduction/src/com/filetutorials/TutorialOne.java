/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.filetutorials;

import java.io.File;
import java.util.Arrays;

/**
 *
 * @author Olaoluwa
 */
public class TutorialOne {
    public static void main(String[] args) {
//        File song = new File("C:\\Users\\DELL E5440\\Desktop\\testrun");
//        System.out.println(song.canExecute());
//        System.out.println(song.getAbsoluteFile()); 
//        String name [] = song.list();
//        System.out.println(Arrays.toString(name));
//        
//        File setfile [] = song.listFiles();
//        for ( File i : setfile){
//            System.out.println(i);
//        }
        String stringOne = "JoshAazvh";
        String stringTwo = "Joshzrm";
        // This Comparison isdone by comparing their ASCII codes
        // A-65, Z-90, a-97, z-122
        System.out.println(stringOne.compareTo(stringTwo));
    }
}
