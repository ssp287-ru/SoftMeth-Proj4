package project4;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Concrete Class for Meatzza Pizza
 * @author Shivang Patel
 */
public class Meatzza extends Pizza{
    private final ArrayList<Topping> toppings = new ArrayList<Topping>(Arrays.asList(
            Topping.SAUSAGE, Topping.PEPPERONI, Topping.BEEF, Topping.HAM));
    private final double smallPrice = 19.99;
    private final double mediumPrice = 21.99;
    private final double largePrice = 23.99;
    private Size size;
    private Crust crust;

    public Meatzza(Crust crust){
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
