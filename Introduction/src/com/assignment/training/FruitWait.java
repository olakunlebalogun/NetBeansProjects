/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment.training;

import java.io.IOException;

/**
 *
 * @author Olaoluwa
 */
public class FruitWait {
    public static void main(String[] args) {
        //Declare and initialize three variables
        /*int numOranges = 5,
            numApples = 10,
            numFruit = 0;
        numFruit = numOranges + numApples;
        
        // Display the result of the program
        System.out.println("A totally fruity program");
        System.out.println("Total fruit is " + numFruit);
        
        // code to delay ending the program
        System.out.println("(press Enter to exit)");
        try {
            System.in.read();
        }
        catch (IOException e) {
            return;
        }*/
        //char wor = 'X';
        char myOwn = '\u0058';
        System.out.println(myOwn);
        // what he said - "that's is word he said"
        System.out.println("\"that\'s his word \r he said\"");
        
        
        char aChar = 0,
             bChar = '\u0028';
        aChar = (char)(2*bChar + 8);
        System.out.println(bChar);
        System.out.println(aChar);
        
        
    }
    
}
