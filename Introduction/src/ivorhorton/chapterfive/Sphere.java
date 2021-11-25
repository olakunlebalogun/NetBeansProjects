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
public class Sphere {
    static final double PI = 3.14;
    static int count = 0;
    // Instance Variables
    double radius;
    
    double xCenter;
    double yCenter;
    double zCenter;
    // Class Constructor 
    public Sphere(double theRadius, double x, double y, double z){
        radius = theRadius;
        
        //set the cooordinates of the center
        xCenter = x;
        yCenter = y;
        zCenter = z;
        ++count;
    }
    //Static method of report number of the objects created
    public static int getCount(){
        return count;
    }
    
    // Instance method to calculate volume
    public double volume(){
        return 4.0/3.0*PI*radius*radius*radius;
    }
    
}
