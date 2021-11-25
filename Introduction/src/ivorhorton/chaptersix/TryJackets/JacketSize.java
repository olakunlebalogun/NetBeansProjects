package ivorhorton.chaptersix.TryJackets;

import ivorhorton.chaptersix.*;


public enum JacketSize {
    small(36), medium(40), large(42), extra_large(46), extra_extra_large(48);

    // Constructor
    // note that you do not declare an enum constructor as public, if you do, it does not compile
    JacketSize(int chestSize) {
        this.chestSize = chestSize;
    }
// Method to return the chest size for the current jacket size

    public int chestSize() {
        return chestSize;
    }
    
     @Override
    public String toString() {
        switch (this) {
            case small:
                return "S";
            case medium:
                return "M";
            case large:
                return "L";
            case extra_large:
                return "XL";
            default:
                return "XXL";
        }
    }
    private int chestSize; // Field to record chest size

}
