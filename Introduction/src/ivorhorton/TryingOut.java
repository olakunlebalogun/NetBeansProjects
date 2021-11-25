/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ivorhorton;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Olaoluwa
 */
public class TryingOut {
    public static void main(String[] args) {
        HashMap<String, List<String>> leagues = new HashMap<>();
        List<String> liga = new ArrayList<>();
        leagues.put("Spain",liga );
        liga.add("Barca");
        liga.add("Madrid");
        liga.add("Getafe");
        liga.add("Atletico");
        
        List<String> prem = new ArrayList<>();
        leagues.put("England",prem);
        prem.add("ManCity");
        prem.add("Liverpool");
        prem.add("Chelsea");
        prem.add("Arsenal");
                
        List<String> serie = new ArrayList<>(); 
        leagues.put("Italy",serie);
        serie.add("Juventus");
        serie.add("Inter");
        serie.add("Milan");
        serie.add("Napoli");
        
//        System.out.println(leagues.keySet());           // Using the ketSet method
//        System.out.println(leagues.values());           // Using the values Method
//        System.out.println(leagues.get("England"));    // Using the get method
//        System.out.println(leagues.remove("Italy"));     // Removes the key and its values
          System.out.println(leagues.entrySet());
          
          
    }
    
}
