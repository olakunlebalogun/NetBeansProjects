/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Olaoluwa
 */
public class Myproject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter Lenght");
        double lenght = Double.valueOf(input);
        
        String value = JOptionPane.showInputDialog("Enter Breadth");
        double Breadth = Double.valueOf(value);
        Double area = (lenght * Breadth );
       JOptionPane.showMessageDialog(null, "The Area is " + area);
        
    }
} 
        
        