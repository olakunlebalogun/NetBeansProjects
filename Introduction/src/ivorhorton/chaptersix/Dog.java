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
public class Dog extends Animal {

    public Dog(String aName) {
        super("Dog");
        name = aName;
        breed = "Unknown";
    }

    public Dog(String aName, String aBreed) {
        super("Dog");
        name = aName;
        breed = aBreed;
    }
    // Copy constructor

    public Dog(Dog dog) {
        super(dog); // Call base copy constructor
        name = dog.name;
        breed = dog.breed;
    }
// Rename the dog

    public void setName(String name) {
        this.name = name;
    }
// Return the dog’s name

    public String getName() {
        return name;
    }
// Return the breed

    public String getBreed() {
        return breed;
    }
// Pres
    protected String name;
    protected String breed;

    @Override
    public String toString() {
        return super.toString() + "\nIt's " + name + " the " + breed;
    }

    @Override
    public void sound() {
        System.out.println("Woof woof!");
    }

    public static void main(String[] args) {
        Dog aDog = new Dog("Fido", "Chihuahua");
        Dog starDog = new Dog("Lassie");
        System.out.println(aDog);
        System.out.println(starDog);
        System.out.println(Integer.parseInt("6")); 
        System.out.println(Boolean.valueOf(""));
    }
}
