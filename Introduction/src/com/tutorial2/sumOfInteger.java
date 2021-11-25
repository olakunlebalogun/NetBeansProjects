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
public class sumOfInteger {
    public static void main(String[] args) {
        String number = JOptionPane.showInputDialog("Enter Value: ");
        int value = Integer.valueOf(number);
        int i = 1;
        int num = 0;
        while (i<=value){
        num = num + i;
        i++;
        
            
        }
        System.out.println(num);
        
    }
    
}
