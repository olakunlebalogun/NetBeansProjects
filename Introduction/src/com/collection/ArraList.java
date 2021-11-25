/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.collection;

import java.util.ArrayList;

/**
 *
 * @author Olaoluwa
 */
public class ArraList {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        name.add("lekan");
        name.add("lanre");
        name.add("kunle");
        name.add("niyi");
        name.add("afeez");
        
        ArrayList<String> fam = new ArrayList<>();
        fam.add("niyi");
        fam.add("lanre");
        fam.add("lekan");
        fam.add("kunle");
        fam.add("dad");
        // to use the clone method
       ArrayList<String> balos =  (ArrayList<String>) name.clone();
        System.out.println(balos);
                   //equals: it returns boolean for two list of the same size, element, element order.
        System.out.println(name.equals(balos));
        
                //hashcode: it returns an integer of numbers, for this example- 677042396
        System.out.println(name.hashCode());
        
            //retainAll: it checks to see all common element in the specified list 
            //and removes all that is not in the list(not the specified list)
            // like (A n B) in Set Theory
            System.out.println(name.retainAll(fam));
            System.out.println(name);
            System.out.println(fam.retainAll(name));
            System.out.println(fam);
           //set: this take an element in a particular position and replace it with another specified element
            name.set(3, "oldlady");
            System.out.println(name);
            
           //sort: sorts the list in an alphabetical order, but null argument says that the default sorting
           //method should be used.
           // the command System.out.println(name.sort(null)) does not work
            name.sort(null);
            System.out.println(name);
            
            //sublist: it creates a list inside the a list by the start-index and end-index
            // the end-index one less than the executed index
            name.subList(1,3);
            System.out.println(name.subList(1, 3));
            
           ArrayList<String> clubs = new ArrayList<>();
           String [] europa = {"Arsenal", "Milan", "Getafe", "Inter", " Leicester"};
           clubs.add("Barca");
           clubs.add(0, "Chelsea");
           ArrayList<String> liga = null;
           liga.add("Barca");
           liga.add("Madrid");
           liga.add("Athletico");
           liga.add("Sevilla");
           ArrayList<String> prem = new ArrayList<>();
           prem.add("ManUtd");
           prem.add("Liverpool");
           prem.add("ManCity");
           prem.add("Chelsea");
           ArrayList<Integer> age = new ArrayList<>();
           age.add(26);
           age.add(27);
           age.add(29);
           age.add(30);
           
//           age.removeAll(age);
           System.out.println(age);
           
    }
    
}
