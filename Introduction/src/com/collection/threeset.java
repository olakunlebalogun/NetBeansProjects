/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.collection;
import java.util.TreeSet;

/**
 *
 * @author Olaoluwa
 */
public class threeset {
    public static void main(String[] args) {
        TreeSet<String> prog = new TreeSet();
        prog.add("python");
        prog.add("java");
        prog.add("ruby");
        prog.add("csharp");
        prog.add("pandas");
        
        System.out.println(prog);
        
        System.out.println(prog.ceiling("ruby"));  
        System.out.println(prog.first());
       
    }
}
