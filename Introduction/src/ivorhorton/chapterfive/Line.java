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
public class Line {

    Point start;
    Point end;
//
//    // Create a line from two points
//    Line(final Point start, final Point end) {
//        this.start = new Point(start);
//        /* this is an example of duplicating an object in java
//        there is a difference in effect if it were this.start = start;
//         */
//        this.end = new Point(end);
//
//    }
//
//    /*Line(final Point start, final Point end){  // This constructor has a different effect compare to the one above.
//        this.start = start;                     //  Check page 190 @ Ivor Horton
//        this.end = end;
//    }*/
//    // Create a line from two coordinate pair
//    Line(double xStart, double yStart, double xEnd, double yEnd) {
//        start = new Point(xStart, yStart);
//        end = new Point(xEnd, yEnd);
//    }
//
//    // Calculate the lenght of a line
//    double length() {
//        return start.distance(end);
//    }
//
//    // Convert a line to a string
//    public String toString() {
//        return "(" + start + ") : (" + end + ")"; // As "(start):(end)
//    }
//
//    Point intersect(final Line line1) {
//        Point localPoint = new Point(0, 0);
//
//        double num = (end.y - start.y) * (start.x - line1.start.x) - (end.x - start.x) * (start.y - line1.start.y);
//        double denom = (end.y - start.y) * (line1.end.x - line1.start.x) - (end.x - start.x) * (line1.end.y - line1.start.y);
//        localPoint.x = line1.start.x + (line1.end.x - line1.start.x) * num / denom;
//        localPoint.y = line1.start.y + (line1.end.y - line1.start.y) * num / denom;
//        return localPoint;
//    }
    // Create a line from two points

    public Line(final Point start, final Point end) {
        this.start = new Point(start);
        this.end = new Point(end);
        
//        // Try Using this get the example in the main class
//        this.start = start;
//        this.end = end;

    }
// Create a line from two coordinate pairs

    public Line(double xStart, double yStart, double xEnd, double yEnd) {
        start = new Point(xStart, yStart); // Create the start point
        end = new Point(xEnd, yEnd); // Create the end point
    }
// Calculate the length of a line

    public double length() {
        return start.distance(end); // Use the method from the Point class
    }
// Return a point as the intersection of two lines -- called from a Line object

    public Point intersects(final Line line1) {
        Point localPoint = new Point(0, 0);
        //double num = (end.getY() – start.getY()) * (start.getX()–line1.start.getX())- (end.getX() - start.getX()) * (start.getY() - line1.start.getY());
        double num = (end.getY() - start.getY()) * (start.getX() - line1.start.getX()) - (end.getX() - start.getX()) * (start.getY() - line1.start.getY());
        double denom = (end.getY() - start.getY()) * (line1.end.getX() - line1.start.getX()) - (end.getX() - start.getX()) * (line1.end.getY() - line1.start.getY());
        localPoint.setX(line1.start.getX() + (line1.end.getX() - line1.start.getX()) * num / denom);
        localPoint.setY(line1.start.getY() + (line1.end.getY() - line1.start.getY()) * num / denom);
        return localPoint;
    }
    // Convert a line to a string

    @Override
    public String toString() {
        return "(" + start + "):(" + end + ")"; // As “(start):(end)”} // that is, “(x1, y1):(x2, y2)”
        // Data members
    }

    public static void main(String[] args) {
        // Create two points and display them
        Point start = new Point(0.0, 1.0);
        Point end = new Point(5.0, 6.0);
        System.out.println("Points created are " + start + " and " + end);
// Create two lines and display them
        Line line1 = new Line(start, end);
        Line line2 = new Line(0.0, 3.0, 3.0, 0.0);
        System.out.println("Lines created are " + line1 + " and " + line2);
// Display the intersection
        System.out.println("Intersection is " + line2.intersects(line1));
// Now move the end point of line1 and show the new intersection
        end.move(1.0, -5.0);
        System.out.println("Intersection is " + line1.intersects(line2));
    }
}
