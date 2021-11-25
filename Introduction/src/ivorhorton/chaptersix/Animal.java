/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ivorhorton.chaptersix;

/**
 *
 * @author Olaoluwa
 */
public class Animal {

    public Animal(String aType) {
        type = new String(aType);
        // this.type = aType;
    }
    // A copy constructor in the base class... For details check the copy constructor in java(Ivor Horton Page 240 Duplicating objects)
    public Animal(Animal animal) { 
        type = animal.type;
    }

    public String toString() {
        return "This is a " + type;
    }
    private String type;

    // Creating a sound method for animals, but the method is empty because sound is specific to particular animal
    public void sound() {

    }

}
