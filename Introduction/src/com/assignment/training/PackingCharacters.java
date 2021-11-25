/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment.training;

import static java.lang.Long.toHexString;

/**
 *
 * @author Olaoluwa
 */
public class PackingCharacters {
    public static void main(String[] args) {
        char letterA = 'A';
        char letterB = 'B';
        char letterC = 'C';
        char letterD = 'D';
        long packed = 0L;
        packed = letterD;
        packed = (packed << 16) | letterC;
        packed = (packed << 16) | letterB;
        packed = (packed << 16) | letterA;
        System.out.println("packed contains 0x" + toHexString(packed));
        
        // Now unpack the letters and output them
        long mask = 0xFFFF;
        char letter = (char)(packed & mask);
        System.out.println("from right to left the letters in packed are:");
        System.out.println("    " + letter + "  0x" + toHexString(letter));
        packed >>= 16;
        letter = (char)(packed & mask);
        System.out.println("    "+ letter + "   0x" + toHexString(letter));
        
        packed >>= 16;
        letter = (char)(packed & mask);
        System.out.println("    "+ letter + "   0x" + toHexString(letter));

        packed >>= 16;
        letter = (char)(packed & mask);
        System.out.println("    "+ letter + "   0x" + toHexString(letter));

    }
    
}
