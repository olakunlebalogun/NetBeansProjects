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
public class TryVariableArgumentList {

    public static void main(String[] args) {
        printAll(2, "two", 4, "four", 4.5, "four point fi ve"); // Six arguments
        printAll(); // No arguments
        printAll(25, "Anything goes", true, 4E4, false); // Five arguments
    }

    public static void printAll(Object... args) {
        for (Object arg : args) {
            System.out.print(" " + arg);
        }
        System.out.println();
    }
}
