package ivorhorton.chapterfive;

public class TryInitialization {
     static int[] values = new int[10];
    
    // Initialization block
   static 
    {
        System.out.println("Running initialization block.");
        for ( int i =0 ; i < values.length ; ++i){
            values[i] = (int)(100.0 * Math.random()); // know the effect of this random here
        }
    }
    // List values in the array for an object
     static void listValues(){
        System.out.println();
        for (int value : values){
            System.out.println(" " + value);
        } 
        System.out.println();
    }
    public static void main(String[] args) {
        TryInitialization example = new TryInitialization();
        System.out.println("\nFirst object:");
        example.listValues();
        
        example = new TryInitialization();
        System.out.println("\nSecond object:");
        example.listValues();
        
        System.out.println("\nNo Object:");
        TryInitialization.listValues();
    }
}
