/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ivorhorton;

/**
 *
 * @author Olaoluwa
 */
public class Point {
    public static void main(String[] args) {
        // Write a method oof string that takes a set of strings and returns the concatenated string and length
        String dna = "TAGGAGTTAGCCTAATATAGTCTAATGCAGT";
        int startIndex = dna.indexOf("ATG");
        int currIndex = dna.indexOf("TAA", startIndex);
        while(currIndex != -1){
            if (dna.indexOf(startIndex - currIndex + 3)% 3 ==0){
                String result = (dna.substring(startIndex,currIndex+3));
                System.out.println("Real gene is: " + result);
            }
            else {
                currIndex = dna.indexOf("TAA", currIndex +1);
            }
        }
    }
}
