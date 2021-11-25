/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objectclass.assignments.firstAssignment;

/**
 *
 * @author Olaoluwa
 */
public class testingAssignment {
    public static void main(String[] args) {
        Cylinder tin = new Cylinder(5, 10);
//        System.out.println(tin.height);
//        System.out.println(tin.getCurveSurface());
//        System.out.println(tin.getOneSideOpen());
//        System.out.println(tin.getTotalSurfArea());
//        System.out.println(tin.getVolume());
        System.out.println("The Cylinder with height: " + tin.height +  " and radius " + tin.radius + " has the following geometric values " +
         "\n" + " Curve Surface Area: " + tin.getCurveSurface() 
        + "\n" + " Surface Area of one Side Closed: " + tin.getOneSideOpen() 
        + "\n" + " Total Surface Area: " + tin.getTotalSurfArea() 
        + "\n" + " Volume: " + tin.getVolume() + "\n");
        
        Pyramid ex = new Pyramid(5, 4, 6);
        System.out.println("This Pyramid " + " height: " + ex.height  + ", Breadth: "  + ex.breadth + ", Lenght: " + ex.length 
                + " has the following geometric values: " 
                + "\n" + "The Base Area: " + ex.getBaseArea()
                + "\n" + "Volume: " + ex.getVolume() + "\n");
        
        
        Salary wrk = new Salary(100000);
        System.out.println("The worker with salary " + wrk.salaryAmount + " will receive: " + wrk.percentSalary());
       
    }
    
    
    
}
