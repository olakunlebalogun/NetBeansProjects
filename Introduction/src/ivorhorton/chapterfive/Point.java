/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ivorhorton.chapterfive;

import static java.lang.Math.sqrt;

/**
 *
 * @author Olaoluwa
 */
public class Point {
//    // Coordinates of the point
//    double x ;
//    double y;
//    
//    // create a point from coordinates
//    Point(double xVal, double yVal){
//        x = xVal;
//        y = yVal;
//    }
//    // Create a point from another Point Object
//    Point(final Point oldPoint){
//        x = oldPoint.x;
//        y = oldPoint.y;
//    }
//    
//    //Move a point 
//    void move( double xDelta, double yDelta){
//        x += xDelta;
//        y += yDelta;
//    }
//    
//    //Calculate the distance to another point
//    double distance(final Point aPoint){
//        return sqrt((x - aPoint.x)*(x - aPoint.x) + (y - aPoint.y)*(y - aPoint.y));
//    }
//    
//    // Convert a point to a String
//    public String toString() {
//        return Double.toString(x) + ", " + y; // As "x, y"
//        // you can also use the line below as the return value
//        // return String.valueOf(x) + ", " + y;
//    }

    // Create a point from its coordinates
    public Point(double xVal, double yVal) {
        x = xVal;
        y = yVal;
    }

    // Create a Point from an existing Point object
    public Point(final Point aPoint) {
        x = aPoint.x;
        y = aPoint.y;
    }
// Move a point

    public void move(double xDelta, double yDelta) {
// Parameter values are increments to the current coordinates
        x += xDelta;
        y += yDelta;
    }
// Calculate the distance to another point

    public double distance(final Point aPoint) {
        // return sqrt((x – aPoint.x)*(x – aPoint.x) + (y – aPoint.y)*(y – aPoint.y));
        return sqrt((x - aPoint.x) * (x - aPoint.x) + (y - aPoint.y) * (y - aPoint.y));
    }
// Convert a point to a string

    @Override
    public String toString() {
        //return Double.toString(x) + “, “ + y; // As “x, y”
        return Double.toString(x) + ", " + y;
    }
// Retrieve the x coordinate

    public double getX() {
        return x;
    }
// Retrieve the y coordinate

    public double getY() {
        return y;
    }
// Set the x coordinate

    public void setX(double inputX) {
        x = inputX;
    }
// Set the y coordinate

    public void setY(double inputY) {
        y = inputY;
    }
// Coordinates of the point
    private double x;
    private double y;
    
    public static void main(String[] args) {
        Point newPoint = new Point(4.0, 5.0);
        System.out.println("This is the " + newPoint);
    }
}
