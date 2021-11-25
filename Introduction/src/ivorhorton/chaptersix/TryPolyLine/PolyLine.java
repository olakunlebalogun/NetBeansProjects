/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ivorhorton.chaptersix.TryPolyLine;

/**
 *
 * @author Olaoluwa
 */
public class PolyLine {
    // Construct a polyline from an array of points

    public PolyLine(Point[] points) {
        if (points != null) { // Make sure there is an array
            for (Point p : points) {
                addPoint(p);
            }
        }
    }
// Add a Point object to the list

    public void addPoint(Point point) {
        ListPoint newEnd = new ListPoint(point); // Create a new ListPoint
        if (start == null) {
            start = newEnd; // Start is same as end
        } else {
            end.setNext(newEnd); // Set next variable for old end as new end
        }
        end = newEnd; // Store new point as end
    }

    // Add a point defined by a coordinate pair to the list
    public void addPoint(double x, double y) {
        addPoint(new Point(x, y));
    }

// Construct a polyline from an array of coordinates
    public PolyLine(double[][] coords) {
        if (coords != null) {
            for (int i = 0; i < coords.length; ++i) {
                addPoint(coords[i][0], coords[i][1]);
            }
        }
    }
// String representation of a polyline

    @Override
    public String toString() {
        StringBuffer str = new StringBuffer("Polyline:");
        ListPoint nextPoint = start; // Set the 1st point as start
        while (nextPoint != null) {
            str.append(" " + nextPoint); // Output the current point
            nextPoint = nextPoint.getNext(); // Make the next point current
        }
        return str.toString();
    }
    private ListPoint start; // First ListPoint in the list
    private ListPoint end; // Last ListPoint in the list
}
