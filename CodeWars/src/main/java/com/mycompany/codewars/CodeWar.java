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
public class CodeWar {
    public static void main(String[] args) {
        
    }
    
    public static int digitalRoot(int lak) {
            int sum = 0;
            String inp = "";


            while (inp.length()>1) {
                lak = sum;
                inp = Integer.toString(lak);
                String [] numbers = inp.split("");
                int [] answer;
                for (int i = 0; i < numbers.length; i++){
                    sum += Integer.parseInt(numbers[i]);
                }
                inp = Integer.toString(sum);
//                return sum;
            }
             return sum;
        };
    
}
