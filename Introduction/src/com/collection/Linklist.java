/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.collection;

import java.util.LinkedList;

/**
 *
 * @author Olaoluwa
 */
public class Linklist {
    public static void main(String[] args) {
        LinkedList<String> boys = new LinkedList();
        boys.add("kunle");
        boys.add("yemi");
        boys.add("segun");
        boys.add("mark");
        boys.add("shola");
        System.out.println(boys);
        // element: it returns the first element
        System.out.println(boys.element());
        // offer: it takes the specified element and duplicates it to the end of the list
        // offerFirst; it does the same thing as offer but appends it to the beginning and not the end.
        boys.offer("segun");
        boys.offerFirst("yemi");
        System.out.println(boys);
        
        
       
        
        
        
        
    }
    
}
