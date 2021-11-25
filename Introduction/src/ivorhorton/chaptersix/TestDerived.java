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
public class TestDerived {

    public static void main(String[] args) {
        Dog aDog = new Dog("Fido", "Chihuahua"); // Create a dog
        Dog starDog = new Dog("Lassie"); // Create a Hollywood dog
        System.out.println(aDog); // Let’s hear about it
        System.out.println(starDog); // and the star
    }

}
