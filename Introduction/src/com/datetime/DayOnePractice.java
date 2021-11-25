/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.datetime;

import java.util.Date;

/**
 *
 * @author Olaoluwa
 */
public class DayOnePractice {
    public static void main(String[] args) {
        Date dayOne = new Date();
        Date dateTwo =new Date();
        
        System.out.println(dayOne.compareTo(dateTwo));
        System.out.println(dateTwo.clone());
        System.out.println(dateTwo.hashCode());
        dateTwo.setTime(1235566777);
        
        
    }
}
