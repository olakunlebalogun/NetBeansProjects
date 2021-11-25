/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.codewars;

/**
 *
 * @author Olakunle
 */
public class Factorial {
    public static void main(String[] args) {
        Factorial.permutation(5, 3);
    }
    
    public static int permutation(int n, int r){
        int i = 1;
        int numerator = n;
        int denominator = r;
        
        while (n>=i || r>=i){
            numerator *= n-1;
            denominator *= r-1;
            
            n--;
            r--;
            
            
        }
        System.out.println(n/r);
    return n;
    
    
    }
    
    
}
