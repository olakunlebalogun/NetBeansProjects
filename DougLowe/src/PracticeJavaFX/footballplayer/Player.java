/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticeJavaFX.footballplayer;

/**
 *
 * @author Olaoluwa
 */
public class Player {
    private String name;
    private double value;
    private String club;
    private int age;

    public Player(String name, double value, String club, int age) {
        this.name = name;
        this.value = value;
        this.club = club;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public String toString(){
        return getName();
    }
    
}
