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
public class PrimeNumbers {
    public static void main(String[] args) {
        /*long limit = 20L;
        long factorial = 1L;
        
        for ( long i = 1L; i<=limit; ++i){
            factorial =1L;
            for ( long factor = 2; factor <= i; ++factor){
                factorial *=factor;
            }
            System.out.println(i +"! is " + factorial);
        }*/
        //USING A LABELED CONTINUE STATEMENT
        long limit = 20L;
        long factorial = 1L;
        OuterLoop:
        for (long i = 1L; i<=limit; ++i){
            factorial =1L;
            for ( long j= 2L; j<=i; ++j){
                if ( i>10L && i%2L ==1L){
                continue OuterLoop;
                }
                factorial *= j;
            }
            System.out.println(i +"! is " + factorial);
        }
    }
    
}
