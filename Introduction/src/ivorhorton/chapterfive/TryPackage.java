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
public class TryPackage {
/*
    THIS SET OF CODE IS DAMN USEFUL! MAKE SURE YOU UNDERSTAND EVERY NOW AND THEN
    */
    public static void main(String[] args) {
        double[][] coords = {{1.0, 0.0}, {6.0, 0.0}, {6.0, 10.0},
        {10.0, 10.0}, {10.0, -14.0}, {8.0, -14.0}};
// Create an array of points and fi ll it with Point objects
        Point[] points = new Point[coords.length];
        for (int i = 0; i < coords.length; i++) {
            points[i] = new Point(coords[i][0], coords[i][1]);
        }
// Create an array of lines and fi ll it using Point pairs

        Line[] lines = new Line[points.length - 1];
        double totalLength = 0.0; // Store total line length here
        for (int i = 0; i < points.length - 1; i++) {
            lines[i] = new Line(points[i], points[i + 1]); // Create a Line
            totalLength += lines[i].length(); 
            // Add its length
            System.out.println("Line " + (i + 1) + " " + lines[i] + " Length is " + lines[i].length());
}
            // Output the total length
            System.out.println("\nTotal line length = " + totalLength);
            
           int [][] test = {{3, 5, 3}, {2, 5,-1}, {4, 5,3}, {3,7,8}, {2, 5}};
           System.out.println("!!!!!!!!! Just testing boss " + test.length);
    }
}
    

