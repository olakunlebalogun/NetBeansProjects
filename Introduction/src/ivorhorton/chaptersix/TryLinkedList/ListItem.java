/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ivorhorton.chaptersix.TryLinkedList;

/**
 *
 * @author Olaoluwa
 */
public class ListItem {
    // Constructor

    public ListItem(Object item) {
        this.item = item; // Store the item
        next = null; // Set next as end point
    }
// Return class name & object

    @Override
    public String toString() {
        return "ListItem " + item;
    }
    ListItem next; // Refers to next item in the list
    Object item; // The item for this ListItem
}
