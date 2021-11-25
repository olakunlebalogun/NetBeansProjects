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
public class Pyramid {
    public double height;
    public double breadth;
    public double length;
    
    //Creating a Constructor 
    public Pyramid(double h, double b, double l){
        this.height = h;
        this.breadth = b;
        this.length = l;
    }
    // MEthod to get the BaseArea
    public double getBaseArea(){
        return this.length * this.breadth;
    }
    
    // Method to get the Volume of a Pyramid
    public double getVolume(){
        return (getBaseArea() * this.height)/3;
    }
    
}

