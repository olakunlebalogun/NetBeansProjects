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
public class CreateSphere1 {
    public static void main(String[] args) {
        System.out.println("Number of Objects = " + Sphere.getCount());
        
        Sphere ball = new Sphere(4.0, 0.0, 0.0, 0.0);
        System.out.println("Number of objects = " + ball.getClass());
        
        Sphere  globe = new Sphere(12.0, 1.0, 1.0, 1.0);
        System.out.println("Number of objects = " + globe.getClass());
        
        //outputs the volume of each sphere
        System.out.println("ball volume = " + ball.volume());
        System.out.println("globe volume = " + globe.volume());
        
       
        
    }
}
