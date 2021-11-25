/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.datetime;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Olaoluwa
 */
public class GregoDemo {
    public static void main(String[] args) {
        GregorianCalendar cl = new GregorianCalendar(); // Declaring the GregorianCalendar Class.
        System.out.println(cl.get(Calendar.YEAR)); // Asking to print the year of the instance 
        System.out.println(cl.get(Calendar.MONTH));// Asking to print the month of the instance
        
        
    }
    
}
