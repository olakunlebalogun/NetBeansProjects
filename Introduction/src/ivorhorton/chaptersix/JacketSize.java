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
public enum JacketSize {
    small(36), medium(40), large(42), extra_large(46), extra_extra_large(48);

    // Constructor
    JacketSize(int chestSize) {
        this.chestSize = chestSize;
    }
// Method to return the chest size for the current jacket size

    public int chestSize() {
        return chestSize;
    }
    private int chestSize; // Field to record chest size

}
