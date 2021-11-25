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
public class Cylinder {
    public double PI = 3.142;
    public double radius;
    public double height;
    
    // The First Constructor
    public Cylinder( double r, double h){
        radius = r;
        height = h;
    }
    
    // Method to get the Volume of a Cylinder
    public double getVolume(){
        return radius*radius*height*Math.PI;
    }
    
    // Method to Calculate the Curve Surface Area
    public double getCurveSurface(){
        return 2*PI*radius*height;
    }
    
    // Method to get Total Surface area witn one end opened
    public double getOneSideOpen(){
        return radius*PI*(radius + 2*height);
    }
    
    // Method to calculate the Total Surface area
    public double getTotalSurfArea(){
        return 2 * radius*PI*(radius + height);
    }
    
    
}
