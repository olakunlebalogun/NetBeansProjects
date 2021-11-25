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
public class DuplicateObjects {
    public static void main(String[] args) {
        PetDog myPet = new PetDog("Fang", "Chihuahua", "Max", "Circus flea");
        System.out.println("\nMy pet details:\n"+ myPet);
        PetDog yourPet = new PetDog(myPet);
        System.out.println("\nYour pet details:\n"+yourPet);
        yourPet.setName("Gnasher"); // Change your dog’s name
        yourPet.getFlea().setName("Atlas"); // Change your dog’s fl ea’s name
        System.out.println("\nYour pet details:\n"+yourPet);
        System.out.println("\nMy pet details:\n"+ myPet);
    }
    
}
