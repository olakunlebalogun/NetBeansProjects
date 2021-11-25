/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BigDecimal;

import java.math.BigDecimal;

/**
 *
 * @author Olaoluwa
 */
public class BigDecimalTwo {
    public static void main(String[] args) {
        //Creating BigDecimal objects    
          BigDecimal bdValue_1, bdValue_2, bdValue_3, bdMaxValue1, bdMaxValue2;    
            
          // Assigning value into BigDecimal objects    
          bdValue_1 = new BigDecimal("152207");    
          bdValue_2 = new BigDecimal("179311");    
          bdValue_3 = new BigDecimal("128114");  
             
          // It returns Max and min value    
          bdMaxValue1 = bdValue_1 .max(bdValue_2);  
          bdMaxValue2 = bdValue_1 .min(bdValue_3);  
              
          // Displaying max value    
          System.out.println("Max Value among " + bdValue_1 +     
                       " and " + bdValue_2 + " is = " +bdMaxValue1);    
          // Displaying min value    
          System.out.println("Min Value among " + bdValue_1 +     
                       " and " + bdValue_3 + " is = " +bdMaxValue2);
    }
}
