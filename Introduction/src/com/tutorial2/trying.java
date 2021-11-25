/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Olaoluwa
 */
public class trying {
    enum Season { spring, summer, fall, winter  }
    public static void main(String[] args) {
        /*String input = JOptionPane.showInputDialog("Enter Number: ");
        int name = Integer.valueOf(input);
          
        if (name % 2 == 0){
        JOptionPane.showMessageDialog(null, "The Number is an Even number");  
        }
        else  {
        JOptionPane.showMessageDialog(null, "The Number is an Odd number");
        
        }*/
        byte value = 1;
        /*for ( int i = 0; i < 8; ++i){
        value *= 2;
            System.out.println("Value is now: " + value);
        }*/
        
        /*for ( int i = 0; i < 8; i++){
        value += 2;
            System.out.println("Value is now: " + value);
        }
        for ( int i = 0; i < 8; i+=2){
        value += 2;
            System.out.println("Value is now: " + value);
        }*/
        /*for ( int i = 0; i < 8; i=2*i+1){
        value += 2;
            System.out.println("Value is now: " + value);
        }*/
        //SUMMATION OF INTEGERS IN SEQUENCCE
        /*int limit = 20;
        int sum = 0;
        for (int i=1; i<=limit; ++i){
            sum +=i;
            
        }
        System.out.println("sum = " + sum);*/
        // Another Way for the above code
        // This code is good!
        /*int limit = 5;
        int sum = 0;
        for (int i=1, j = 0; i <= limit; ++i){
            
            System.out.print("i: " + i);
            System.out.print("\tj: " + j);
            sum +=i * j++;
            System.out.println("\tsum = " + sum);
            
        }*/
        /*int limit = 5;
        int sum = 0;
        for (int i=1, j = 0; i <= limit; ++i, ++j){
            System.out.print("i: " + i);
            System.out.print("\tj: " + j);
            sum += i * j;
            System.out.println("\tsum = " + sum);
        
        }*/
        /*int limit = 5;
        int sum = 0;
        for (int i =1; i<=limit; sum+=i, ++i){
            System.out.println("i: " + i);
            
            
        }
        System.out.println("\tsum = " + sum);
        // Try to get the diiference between the increment in the two codes
       for (int i =1; i<=limit; ++i, sum+=i){
        System.out.println("i: " + i);
        System.out.print("sum = " + sum + "\t");
        }
        System.out.println("\nsum = " + sum);*/
        
        
        
        // the enumeration statement has been declared at line 16
        for (Season season : Season.values()){
        
            System.out.println(" The season is now " + season);
        }
       
                
        
        
        
        
        
        
        
                
    }
}    

