/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ivorhorton.chaptersix;

import java.util.Random;

/**
 *
 * @author Olaoluwa
 */
public class TryPolymorphism {

    public static void main(String[] args) {
        Animal[] theAnimals = {
            new Dog("Rover", "Poodle"),
            new Cat("Max", "Abyssinian"),
            new Duck("Daffy", "Aylesbury"),
            new Spaniel("Fido")};
        Animal petChoice;  // the choice of animal
        Random select = new Random(); // Random number generator

        // Make five random choices of pet
        for (int i = 0; i < 5; ++i) {
            // Choose a random animal as a pet
            petChoice = theAnimals[select.nextInt(theAnimals.length)];
            System.out.println("\nYour choice:\n" + petChoice);
            petChoice.sound(); // Get the pet’s reaction
        }


/*
            The code below tests the getClass method of Object Class. Check Page 238
*/
//        Animal sample = new Dog("Bingo","RottWieller");
//        //Class objectType = sample.getClass(); // Get the class type
//        System.out.println(sample.getClass().getName());
    }

}
