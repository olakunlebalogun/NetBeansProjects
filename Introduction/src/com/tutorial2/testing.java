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
public class testing {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter Score: ");
        double score = Double.valueOf(input);     
        if ( score <= 39) {
        System.out.println("You got an F");
        JOptionPane.showMessageDialog(null,"you failed");
        
        }
        else if ( score>=40 && score <= 45){
        System.out.println("You got an E");
        JOptionPane.showMessageDialog(null,"Fair");
        }
        else if ( score>=46 && score <= 49){
        System.out.println("You got a D");
        JOptionPane.showMessageDialog(null,"good");
        }
        else if ( score>=50 && score <= 59){
        System.out.println("You got a C");
        JOptionPane.showMessageDialog(null,"Almost very good");
        }
        else if ( score>=60 && score <= 69){
        System.out.println("You got a B");
        JOptionPane.showMessageDialog(null,"very good");
        }
        else if ( score > 100) {
        System.out.println("The value is out of range");
        JOptionPane.showMessageDialog(null,"oga put better value");
        }
        else {
        System.out.println("You are a Scholar");
        JOptionPane.showMessageDialog(null,"Excellent!");
        }
    }
}
// try to this by intorducing a constant, and an input