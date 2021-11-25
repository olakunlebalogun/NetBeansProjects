/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coursera.coursetwoweek1;

/**
 *
 * @author Olaoluwa
 */
public class Point {
    private int x;
    private int y;
    public Point ( int startx, int starty){
     x = startx;
     y = starty;
    }
    public int getX(){ return x; }
    public int getY(){ return y;}
    public double distance ( Point otherPt){
    int dx = x - otherPt.getX();
    int dy = y - otherPt.getY();
    return Math.sqrt(dx*dx + dy*dy);
    }
    public static void main(String[] args) {
        Point p1 = new Point(5,4);
        Point p2 = new Point(-3,8);
        System.out.println(p1.distance(p2));
    }
    
}
