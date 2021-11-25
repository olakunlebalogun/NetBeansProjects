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
public class BigDecimalOne {
    public static void main(String[] args) {
        // Create BigDecimal object      
        BigDecimal bdValue1, bdValue2;     
        // Create  int variable      
        int integerValue1, integerValue2;      
      
        // Assigning value into BigDecimal object       
        bdValue1 = new BigDecimal("-36755");   
        bdValue2 = new BigDecimal("63745");  
      
        // It returns int value of BigDecimal      
        integerValue1 = bdValue1.intValue();      
        integerValue2=bdValue2.intValueExact();  
      
        // Displaying int Value       
        System.out.println( "Returned int value is = "+integerValue1);  
        // Displaying exact Integer Value  
        System.out.println("Returned Exact Integer Value of " +bdValue2 + " is = " + integerValue2); 
    }
   
}
