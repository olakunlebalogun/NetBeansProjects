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
public class averageOfNumbers {
    public static void main(String[] args) {
        int [] numbers = { 3,4,5,6,7};
        int sum = 0;
        double average;
        for (int number : numbers){
        sum += number;
        }
        int arrayLength = numbers.length;
        average = ((double)sum/arrayLength);
        System.out.println("Sum: "+ sum);
        System.out.println("Average: "+ average );
        
        
    }
    
}
