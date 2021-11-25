/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ivorhorton.chapterfive.TryNestedClass;

/**
 *
 * @author Olaoluwa
 */
import java.util.Random;

public class MagicHat {
    /*
    THIS IS A NESTED CLASS WITH A STATIC CLASS WITHIN 
    STUDY THE DETAILS OF THE CODE
    REFER TO AS MANY REFERENCES AS POSSIBLE
    */
    
    static int maxRabbits = 5; // Maximum rabbits in a hat
    static Random select = new Random(); // Random number generator . THIS IS HOW TO CREATE A RANDOM GENERATOR IN JAVA

// Constructor for a hat
    public MagicHat(String hatName) {
        this.hatName = hatName; // Store the hat name
        rabbits = new Rabbit[1 + select.nextInt(maxRabbits)]; // Random rabbits
        for (int i = 0; i < rabbits.length; ++i) {
            rabbits[i] = new Rabbit(); // Create the rabbits
        }
    }
// String representation of a hat

    public String toString() {
        // Hat name first...
        String hatString = "\\n" + hatName + " contains:\n";
        for (Rabbit rabbit : rabbits) {
            hatString += " " + rabbit; // Add the rabbits strings
        }
        return hatString;
    }
    private String hatName; // Name of the hat
    private Rabbit rabbits[]; // Rabbits in the hat

    static class Rabbit {

        // Definition of the Rabbit class...
        // Nested class to define a rabbit
        // A name is a rabbit name from rabbitNames followed by an integer
        static private String[] rabbitNames = {"Floppsy", "Moppsy", "Gnasher", "Thumper"};
        static private int[] rabbitNamesCount = new int[rabbitNames.length];
        private String name; // Name of the rabbit

        // Constructor for a rabbit
        public Rabbit() {
            int index = select.nextInt(rabbitNames.length); // Get random name index
            name = rabbitNames[index] + (++rabbitNamesCount[index]);
        }
        // String representation of a rabbit

        public String toString() {
            return name;
        }
    }

    static public void main(String[] args) {
// Create three magic hats and output them
        System.out.println(new MagicHat("Gray Topper"));
        System.out.println(new MagicHat("Black Topper"));
        System.out.println(new MagicHat("Baseball Cap"));
}

}
