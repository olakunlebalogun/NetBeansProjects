/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial2;

/**
 *
 * @author Olaoluwa
 */
public class IfStatementExamaple {
    public static void main(String[] args) {
      int age =-10;
      
      if(age<0){
          System.out.println("Invalid value");
      }else if(age<=5){
          System.out.println("Toodler");
      }else if(age>=6 && age<13){
          System.out.println("Other");
      }else if(age>=13 && age<=19){
          System.out.println("Teeneger");
      }else{
          System.out.println("Adult");
      }
    }
}
