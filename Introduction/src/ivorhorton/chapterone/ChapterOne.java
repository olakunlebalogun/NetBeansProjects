/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ivorhorton.chapterone;

import ivorhorton.*;

/**
 *
 * @author Olaoluwa
 */
public class ChapterOne {
    public static void main(String[] args) {
        String text = "To be or not be, that is the question;"
                     +"Whether 'tis nobler in the mind to suffer"
                     +" the slings and arrows of outrageous fortune,"
                     +" or to take arms against a sea of troubles,"
                     +" and by opposing end them?";
        int spaces = 0,                     // count of spaces
            vowels = 0,                     // count of vowels
            letters = 0;                    // count of letters 
        // Analyse all the characters in the string 
        int textLength = text.length();
        
        for ( int i = 0; i < textLength; ++i){
        // Check for vowels
            char ch = Character.toLowerCase(text.charAt(i));
            if (ch =='a' || ch =='e' || ch =='i' || ch =='0' || ch =='u'){
                vowels++;
            }
            //Check for letters
            if ( Character.isLetter(ch)){
                letters++;
            }
            // Checks for spaces
            if ( Character.isWhitespace(ch)){
                spaces++;
            }
            
        }
        System.out.println("The text contained vowels:  " + vowels + "\n" + 
                "                          consonants: "  + (letters-vowels) + "\n" +
                "                           spaces:    "  + spaces );
    }
    
}
