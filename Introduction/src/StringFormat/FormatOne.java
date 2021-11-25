/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringFormat;

/**
 *
 * @author Olaoluwa
 */
public class FormatOne {

    public static void main(String[] args) {
        String name = "Chris";
        String sf1 = String.format("name is %s", name);
        String sf2 = String.format("value is %f", 32.33434);
        String sf3 = String.format("value is %32.12f", 32.33434);//returns 12 char fractional part filling with 0  

        System.out.println(sf1);
        System.out.println(sf2);
        System.out.println(sf3);

        

    }

}
