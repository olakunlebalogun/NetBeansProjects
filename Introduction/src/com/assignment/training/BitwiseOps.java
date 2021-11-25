/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment.training;
import static java.lang.Integer.toBinaryString;

/**
 *
 * @author Olaoluwa
 */
public class BitwiseOps {
    public static void main(String[] args) {
        int indicators = 0b1111_1111_0000_1111;
        int selectBit3 = 0b0000_0000_0000_0100;
        
        //Try the bitwise AND to select the third bit in indicators
        System.out.println("indicators               ="+
                                                        toBinaryString(indicators));
        System.out.println("selectBit3               ="+
                                                        toBinaryString(selectBit3));
        System.out.println("indicators & selectBit3  ="+
                                                        toBinaryString(indicators));
        
        // Try the bitwise OR to switch the third bit on 
        indicators = 0b1111_1111_0000_1001;         //Same as 0xFF09
        System.out.println("\nindicators             ="+
                                                        toBinaryString(indicators));
        System.out.println("selectBit3             ="+
                                                        toBinaryString(selectBit3));
        indicators |= selectBit3;
        System.out.println("indicator|selectBit3   ="+
                                                        toBinaryString(indicators));
        
        //Now switch the third bit off again
        indicators &= -selectBit3;
        System.out.println("\nThe third in the previous value of indicators" + 
                                                      " has been switches off");
        System.out.println("indicators & -selectBit3 = " + 
                                                        toBinaryString(indicators));
    }
    
}
