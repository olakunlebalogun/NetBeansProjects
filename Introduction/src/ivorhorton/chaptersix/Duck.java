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
public class Duck extends Animal {

    public Duck(String aName) {
        super("Duck"); // Call the base constructor
        name = aName; // Supplied name
        breed = "Unknown"; // Default breed value
    }

    public Duck(String aName, String aBreed) {
        super("Duck"); // Call the base constructor
        name = aName; // Supplied name
        breed = aBreed; // Supplied breed
    }
// Return a String full of a duck’s details
    @Override
    public String toString() {
        return super.toString() + "\\nIt’s " + name + " the "+ breed;
    }
        // A quacking method
    @Override
    public void sound() {
        System.out.println("Quack quackquack");
}
    protected String name;              // Duck name
    protected String breed;            // Duck breed
}


