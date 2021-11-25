/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.collection;

import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author Olaoluwa
 */
public class DropDown {
    public static void main(String[] args) {
        String pop = JOptionPane.showInputDialog("Enter State Here: ");
        HashMap<String, String> state = new HashMap<>();
        state.put("Kwara", "Ilorin");
        state.put("Lagos","Ikeja");
        state.put("Oyo","Ibadan");
        state.put("Osun","Osogbo");
        state.put("Ogun","Abeokuta");
        state.put("Ondo","Akure");
        state.put("Ekiti","Ado-Ekiti");
        System.out.println(state.get(pop));
        
        //System.out.println(state);
        //System.out.println(state.get("Lagos"));
        //System.out.println(state.values());
        //System.out.println(state.keySet());
        
        
        /*LinkedHashMap<String, Integer> vol = new LinkedHashMap<>();
        vol.put("Olakunle", 26);
        vol.put("Olanrewaju", 30);
        vol.put("Olaniyi", 22);
        
        System.out.println(vol.get("Olaniyi"));
        
        System.out.println(vol.containsKey("Olaniyi"));
        System.out.println(vol);
        vol.replace("Olakunle", 26, 27);
        System.out.println(vol);*/
    }
    
}
