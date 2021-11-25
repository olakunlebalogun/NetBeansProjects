/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ivorhorton.chaptertwo;

import java.io.IOException;

/**
 *
 * @author Olaoluwa
 */
public class FruitWait {
    public static void main(String[] args) {
        // Declare and initialize three variables
        int numOranges = 5;     // count of oranges
        int numApples = 10;     // count of apples
        int numFruit = 0;      // count of Friuts
        
        numFruit =  numOranges + numApples;        // Calculate the total fruit count
        // Display the result
        System.out.println("A totally fruity program");
        System.out.println("Total fruit is " + numFruit);
        // Code to display ending the program
        System.out.println("(press Enter to exit)");
        try{
            System.in.read();  // Read some input from the keyboard
        }catch(IOException e){  // Catch the input exception
            return;             // and just return
        }
    }
    
}
