/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.collection;

import java.util.LinkedHashSet;

/**
 *
 * @author Olaoluwa
 */
public class LinkhaSet {
    public static void main(String[] args) {
        LinkedHashSet<String> rand = new LinkedHashSet();
        rand.add("three");
        rand.add("two");
        rand.add("one");
        rand.add("zero");
        rand.add("one");
        System.out.println(rand.getClass());
        System.out.println(rand.size());
        
    }
    
}
