/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author Olaoluwa
 */
public class TestLoopTryCatch {

    public static void main(String[] args) {
        int i = 12;
        for (int j = 3; j >= -1; --j){
            try {
                System.out.println("Try block entered i = " + i + " j = " + j);
                System.out.println(i / j); // Divide by 0 - exception thrown
                System.out.println("Ending try block");
            } catch (ArithmeticException e) { // Catch the exception
                System.out.println("Arithmetic exception caught: " + e);
            }
        }
        System.out.println("After try block");
    }
}
