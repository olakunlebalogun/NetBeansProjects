/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app;

import java.util.ArrayList;

/**
 *
 * @author Olaoluwa
 */
public class CollectionDemo1 {
    //List, Set, Map
    //ArrayList, LinkedList
    // Set Treeset, LinkedHashSet
    // Map HashMap, TreeMap, LinkedHashMap
    public static void main(String[] args) {
          ArrayList<String> ls = new ArrayList<>();
   ls.add("Kogi");
   ls.add("Kano");
   ls.add("Lagos");
   ls.add("Kwara");
   
   
   String state[] ={"Kogi","Kano","Lgaos"};
   System.out.println(ls.get(0));
  for(int i=0; i<ls.size(); i++){
      System.out.println(ls.get(i)) ;
  }
  
  for(String rs:ls){
   System.out.println(rs);   
  }
   
    }
    
}
