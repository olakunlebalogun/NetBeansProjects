/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Olaoluwa
 */
public class Astronaut {

    private String firstName;
    private String lastName;

    public Astronaut(String FirstName, String LastName) {
        firstName = FirstName;
        lastName = LastName;
    }

    public String toString() {
        return firstName + " " + lastName;
    }

}
