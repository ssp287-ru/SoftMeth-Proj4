package project4;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Concrete Class for a Deluxe Pizza, includes final ArrayList for toppings, final prices for all sizes, and Crust/Size
 * @author Shivang Patel
 */
public class Deluxe extends Pizza{
    private final ArrayList<Topping> toppings = new ArrayList<Topping>(Arrays.asList(
            Topping.SAUSAGE, Topping.PEPPERONI, Topping.greenPEPPER, Topping.ONION, Topping.MUSHROOM));
    private final double smallPrice = 18.99;
    private final double mediumPrice = 20.99;
    private final double largePrice = 22.99;
    private Size size;
    private Crust crust;

    /**
     * Constructor Method
     * @param crust Pizza Crust
     */
    public Deluxe(Crust crust){
        this.crust = crust;
    }


    /**
     * Price Calculator Method
     * @return Price of pizza depending on size
     */
    @Override
    public double price() {
        if (this.size.equals(Size.Small)){
            return smallPrice;
        }
        else if (this.size.equals(Size.Medium)){
            return mediumPrice;
        }
        else{
            return largePrice;
        }
    }

    /**
     * Accessor Method
     * @return Topping ArrayList
     */
    public ArrayList<Topping> getToppings() {
        return toppings;
    }

    /**
     * Setter Method
     * @param size Pizza Size
     */
    public void setSize(Size size){
        this.size = size;
    }

    /**
     * Accessor Method
     * @return Pizza Size
     */
    public Size getSize() {return this.size;}

    /**
     * Accessor Method
     * @return Pizza Crust
     */
    public Crust getCrust() {return this.crust;}
}
