/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TryConversion;

import static conversions.ConversionFactors.*;
//import static java.lang.Math.m

/**
 *
 * @author Olaoluwa
 */
public class TryConversion {

    public static double poundsToGrams(double pounds) {
        return pounds * POUND_TO_GRAM;
    }

    public static double inchesToMillimeters(double inches) {
        return inches * INCH_TO_MM;
    }

    public static void main(String args[]) {
        int myWeightInPounds = 180;
        int myHeightInInches = 75;
        System.out.println("My weight in pounds: " + myWeightInPounds
                + " \\t-in grams: " + (int) poundsToGrams(myWeightInPounds));
        System.out.println("My height in inches: " + myHeightInInches
                + " \\t-in millimeters: " + (int) inchesToMillimeters(myHeightInInches));

       
        

    }
}
