/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.datetime;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Olaoluwa
 */
public class DateDemo {
    public static void main(String[] args) {
        Date d = new Date();        // Declaring the date class
        
        SimpleDateFormat ft = new SimpleDateFormat("yyyy/MM/dd");  // declaring and setting the DateFormat 
        SimpleDateFormat ft2 = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");//declaring and setting the DateFormat for ft2
        SimpleDateFormat ft3 = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss a");// declaring and setting the DateFormat for ft3
        System.out.println(ft.format(d));   //Printing each of the classes out with the associated format.
        System.out.println(ft2.format(d));  //Printing each of the classes out with the associated format.
        System.out.println(ft3.format(d));  //Printing each of the classes out with the associated format.
    }
    
}
