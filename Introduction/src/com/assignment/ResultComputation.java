/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment;

import java.text.NumberFormat;
import javax.swing.JOptionPane;
/*import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;*/

/**
 *
 * @author Olaoluwa
 */
public class ResultComputation {
    public static void main(String[] args) {
       /* Scanner scanner = new Scanner(System.in) ; 
        int value = scanner.nextInt();
        System.out.println("the " + value);*/
      /**double age = 4.7787878787;
      final double PI = 3.142;*/
     /*?String message = "How are you";
      
      System.out.println(message.replace());*/
      /*int[] value = new int[5];
        System.out.println(Arrays.toString(value));*/
      /*int [][] mat = {{1,2,3},{4,5,6},{7,8,9}};*/
      /*mat[0][0] = 1;
      mat[0][1] = 2;
      mat[0][2] = 3;
      mat[1][0] = 4;
      mat[1][1] = 5;
      mat[1][2] = 6;
      mat[2][0] = 7;
      mat[2][1] = 8;
      mat[2][2] = 9;*/
      
        /*System.out.println(Arrays.deepToString(mat));
        double result = (double)Math.ceil(1.1F);
        System.out.println(result);
        double ind = Math.random();*/
        /*NumberFormat currency = NumberFormat.getPercentInstance();
        String result = currency.format(number: 2345.56);
        System.out.println(result);*/
        /*int ans =  (int)Math.pow(Math.floor(2.4), 3);
        System.out.println(ans);*/
        final double PI = 3.142;
        final double PERMITIVITY = 8.89 * Math.pow(10, -12);
        String input = JOptionPane.showInputDialog("Enter q1: ");
        double charge1 = Double.valueOf(input);
        
        String inp = JOptionPane.showInputDialog("Enter q2: ");
        double charge2 = Double.valueOf(inp);
        
        String inpu = JOptionPane.showInputDialog("Enter radius: ");
        double radius = Double.valueOf(inpu);
        
        double force = (charge1 * charge2)/ (4 * PI * PERMITIVITY * Math.pow(radius, 2));
        JOptionPane.showMessageDialog(null,"Force  "+ force);
        
        
                
        
        
      
        
              
    }   
  
}

