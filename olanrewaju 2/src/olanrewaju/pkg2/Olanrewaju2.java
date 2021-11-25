/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olanrewaju.pkg2;

/**
 *
 * @author Olaoluwa
 */
public class Olanrewaju2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int score =101;
        if (score>=70 && score <=100){
        System.out.println("A");
        }
        else if(score>=60 && score <=69){
        System.out.println("B");
        }
        else if(score>=50 && score<=59){
        System.out.println("C");
        }
        else if(score>=46 && score<=49){
        System.out.println("D");
        }
        else if(score>=40 && score<=45){
        System.out.println("E");
        }
        else if (score<0) {
        System.out.println("Examination OLE!");
        }
        else if (score > 100) {
            System.out.println("Re-enter, the value should be btw 0-100");
        }
        else{
        System.out.println("F");
        }
            
            
        }
                
                
    }
    

