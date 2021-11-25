/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ivorhorton.chaptersix;

/**
 *
 * @author Olaoluwa
 */
public class Cell {
    private String cellname;
    
    public Cell(String cellname) {
        this.cellname = cellname;
    }

    public String getCellname() {
        return cellname;
    }

    public void setCellname(String cellname) {
        this.cellname = cellname;
    }
    
    public static void main(String[] args) {
        Cell c1 = new Cell("mit");
        System.out.println(c1.toString());
        System.out.println(c1.getClass());
        System.out.println(c1.hashCode());
        Animal pet = new Animal("Pet");
        Class petType =  pet.getClass();
        System.out.println(petType.getName());
        System.out.println(pet.getClass().getName());
    }
    
}
