/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ivorhorton.chapterfive;

/**
 *
 * @author Olaoluwa
 */
public class PowerCalc {
    // Raise x to the power n
    static double power(double x, int n){
        if (n > 1){
            return x*power(x, n-1); // Recursive call
        }
        else if (n < 0){
            return 1.0/power(x, -n); // Negative power of x
        }
        else {
            return n == 0 ? 1.0 : x; // when n is 0 return 1, otherwiswe x
        }
            
    }
    public static void main(String[] args) {
        double x = 5.0;
        System.out.println( x + " to the power 4 is " + power(x,4));
        System.out.println( "7.5 to the power 5 is " + power(7.5,5));
        System.out.println("7.5 to the power 0 is " + power(7.5,0));
        System.out.println("10 to the power -2 is " + power(10,-2));
          
    }
    
}
