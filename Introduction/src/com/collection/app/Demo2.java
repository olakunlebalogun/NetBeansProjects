/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.collection.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Olaoluwa
 */
public class Demo2 {
    public static void main(String[] args) {
        List<String> ls = new ArrayList<>();
        ls.add("Kogi");
   ls.add("Kano");
   
   ls.add("Lagos");
   ls.add("Kwara");
   ls.add("Ogun");
   ls.add("Osun");
   ls.add("Jos");
    ls.add("Jos");
     ls.add("Jos");
   List<String> lst = new LinkedList();
   lst.add("Sokoto");
   lst.add("Oyo");
   
   ls.addAll(lst);
  Collections.shuffle(ls);
  System.out.println(Collections.frequency(ls, "Jos"));

   System.out.println(ls.get(9));
  System.out.println(lst.isEmpty());
 //  ls.remove("Osun");
  //ls.remove(0);
   for(String rs:ls){
       System.out.println(rs);
   }
    }
}
