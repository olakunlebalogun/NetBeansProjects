/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsonassignment.trying;

/**
 *
 * @author Olaoluwa
 */
public class Sphere {
    // class variable

    static double PI = 3.14;
// instance variables
    double xCenter;
    double yCenter;
    double zCenter;
    double radius;
    
    static double calVolume( Double r){
    
        return Sphere.PI*r*r*r;
    }

}
