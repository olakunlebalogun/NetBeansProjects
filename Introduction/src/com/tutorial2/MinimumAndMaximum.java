/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial2;

/**
 *
 * @author Olaoluwa
 */
public class MinimumAndMaximum {
    public static void main(String[] args) {
        int list [] = { 3,6,5,31};
        int minimum = list[0];
        int maximum = list[0];
        
        for (int i=0; i< list.length; i++){
            if (list[i]<minimum){
            minimum = list[i];
            }
            if (list[i] > maximum){
            maximum = list[i];
            }
         
        }
        System.out.println("The minimum value is: " + minimum);
        System.out.println("The maximum value is: " + maximum);
    }   
    
}
