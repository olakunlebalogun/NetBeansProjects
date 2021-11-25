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
public class PetDog extends Dog {
    // Constructor

    public PetDog(String name, String breed, String fleaName, String fleaSpecies) {
        super(name, breed);
        petFlea = new Flea("Max","circus flea"); // Initialize petFlea}
    }
            // Copy constructor
    public PetDog(PetDog pet) {
        super(pet); // Call base copy constructor
        petFlea = new Flea(pet.petFlea); // Duplicate the flea. This is referring to the petFlea in line 17 new Flea("Max",...
    }
            // Return the flea

    public Flea getFlea() {
        return petFlea;
    }

    @Override
    public void sound() {
        System.out.println("Woof");
    }
        // Return a String for the pet dog
    @Override
    public String toString() {
        return super.toString() + " - a pet dog.\\nIt has a fl ea:\\n" + petFlea;}
    protected Flea petFlea; // The pet fl ea
}


