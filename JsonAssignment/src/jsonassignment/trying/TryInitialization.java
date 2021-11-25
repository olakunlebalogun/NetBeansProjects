/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsonassignment.trying;

/**
 *
 * @author Olaoluwa
 */
public class TryInitialization {

    static int[] values = new int[10]; // Static array member
// Initialization block

    static {
        System.out.println("Running initialization block.");
        for (int i = 0; i < values.length; ++i) {
            values[i] = (int) (100.0 * Math.random());
        }
    }
// List values in the array for an object

    void listValues() {
        System.out.println(); // Start a new line
        for (int value : values) {
            System.out.print(" " + value); // Display values
        }
        System.out.println(); // Start a new line
    }

    static void listValuess() {
        System.out.println(); // Start a new line
        for (int value : values) {
            System.out.print("" + value); // Display values
        }
        System.out.println(); // Start a new line
    }

    public static void main(String[] args) {
        TryInitialization example = new TryInitialization();
        System.out.println("\\nFirst object:");
        example.listValues();
        example = new TryInitialization();
        System.out.println("\\nSecond object:");
        example.listValues();

        System.out.println("\nNo object:");
        TryInitialization.listValuess();
    }

}
