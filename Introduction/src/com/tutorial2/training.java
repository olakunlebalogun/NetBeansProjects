/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial2;

import static java.lang.Math.ceil;
import static java.lang.Math.sqrt;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
/**
 *
 * @author Olaoluwa
 */
public class training {
    public static void main(String[] args) {
//         Calendar cl = Calendar.getInstance();
//        Date today = cl.getTime();
//        System.out.println(cl.getTime());
//        cl.set(2020, 10, 26, 11, 45);
//        System.out.println(cl.getTime());
//        cl.add(Calendar.MONTH, 5);
//        System.out.println(cl.getTime());
//       GregorianCalendar vac= new GregorianCalendar();
//        System.out.println(vac.get(Calendar.YEAR));
//         System.out.println(vac.get(Calendar.MONTH));

//            int [] primes = new int [10];
//            primes[0] = 2;
//            primes[1] = 3;
//            primes[2] = 5;
//            primes[3] = 7;
//            primes[4] = 11;
//            primes[5] = 13;
//            primes[6] = 17;
//            primes[7] = 19;
//            primes[8] = 23;
//            primes[9] = 29;
//            
//            // The instruction gives you a random numbers in array
//            primes = new int[15];
//            for ( int i = 0; i < primes.length; i++){
//                primes[i] = (int) Math.round(Math.random() * 100);
//            }
//            System.out.println(Arrays.toString(primes));
            
            long[] primes = new long[50];    //Array to store primes
            primes[0] = 2L;                     //Seed thr first Prime
            primes[1] = 3L;                 // and the Second                                           
            int count = 2;                  // Count of primes found up to now,
                                            // Which is also the array index
            long number = 5L;               // Next Integer to be tested
            
            outer:
            for ( ; count < primes.length; number += 2L){
                // The maximum divisor we need to try is square root of number
                long limit = (long)ceil(sqrt((double)number));
                
                // Divide by all the primes we have up to limit
                for ( int i = 1; i < count && primes[i] <= limit; ++i ){
                    if (number%primes[i] == 0L){    // is it an exact divisor
                    continue outer;                 // Yes, so try the next number
                    }
                }
                primes[count++] = number; // We got one!
            }
            for (long n : primes){
                System.out.println(n);              // Output all the primes
            }
       
       
    }
 
}
