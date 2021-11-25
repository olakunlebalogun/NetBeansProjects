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
public class Cat extends Animal {
    
    public Cat(String aName) {
        super("Cat");               // Call the base constructor
        name = aName;               // Supplied name
        breed = "Unknown";          // Default breed value
    }
    public Cat(String aName, String aBreed) {
        super("Cat");               // Call the base constructor
        name = aName;               // Supplied name
        breed = aBreed;             // Supplied breed
    }
    @Override 
    public String toString(){
        return super.toString() + "\\nIt’s " + name + " the "+ breed;
    }
    @Override
    public void sound() {
        System.out.println("Miiaooww");
    }
    protected String name;          // Name of a cat
    protected String breed;         // Cat breed

    
}
