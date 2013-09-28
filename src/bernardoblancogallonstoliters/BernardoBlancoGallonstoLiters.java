/*
 This program converts gallons to liters
 */
package bernardoblancogallonstoliters;

/**
 *
 * @author BernardoBlanco
 */
public class BernardoBlancoGallonstoLiters {
    public static void main(String[] args) {
        double gallons; //holds the number of gallons
        double liters; //holds conversion to liters
        
        gallons = 10; //start with 10 gallons
        liters = gallons * 3.7854; //convert to liters
        
          System.out.println(gallons + " gallons is " + liters + " liters."); 
    }
}
