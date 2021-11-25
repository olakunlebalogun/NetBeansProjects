/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.datetime;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author Olaoluwa
 */
public class CalendarDemo {
    public static void main(String[] args) {
        //Using the Calendar Class
        Calendar c1 = Calendar.getInstance(); // Declaring the Calendar method
        //Date d = c1.getTime();      // 
        System.out.println(c1.getTime()); // Prints out the cl i.e today's date 
        
        c1.set(2019, 2, 27);        // setting a value of day(27th March*, 2019). note how month displays
        System.out.println(c1.getTime()); // prints the set value of  the set time.
        
        Calendar clt = Calendar.getInstance(); // creating another instance called "clt".
        clt.set(Calendar.MONTH, 1); // setting the current date clt to add its month plus 1
        System.out.println();
        
        //How to add days or month to a current date
        Calendar current = Calendar.getInstance(); //Declaring an instance here
        current.add(Calendar.MONTH, 4);        // Adds 4 months to the current date(current)
        current.add(Calendar.YEAR, 2);          //Adds 2 years to the current date(current)
        System.out.println(current.getTime());  // Prints the current date using the getTime() methods
        
    }
    
  
    
}
