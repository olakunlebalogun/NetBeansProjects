 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial2;

import javax.swing.JOptionPane;



/**
 *
 * @author Olaoluwa
 */
public class evening {
    public static void main(String[] args) {
        String result ="30.90";
        //int age =Integer.valueOf(result);
        double salary =Double.valueOf(result);
        String sal =String.valueOf(salary);
         
        String inputScore =JOptionPane.showInputDialog("Please enter score");
        
        Double score = Double.valueOf(inputScore);        
        if ( score <= 39) {
        System.out.println("You got an F");
       JOptionPane.showMessageDialog(null, "You got an F");
        }
        else if ( score>=40 && score <= 45){
        System.out.println("You got an E");
        }
        else if ( score>=46 && score <= 49){
        System.out.println("You got a D");
        }
        else if ( score>=50 && score <= 59){
        System.out.println("You got a C");
        }
        else if ( score>=60 && score <= 69){
        System.out.println("You got a B");
        }
        else if (score > 100) {
        System.out.println("The value is out of range");
        }
        else {
        System.out.println("You are a Scholar");
        }
    }
}
// try to this by intorducing a constant, and an input