package project4;

import java.util.ArrayList;

/**
 * Concrete class for BuildYourOwn Pizza, includes prices and topping array
 * @author Shivang Patel
 */
public class BuildYourOwn extends Pizza{
    private ArrayList<Topping> toppings;
    private final double smallPrice = 10.99;
    private final double mediumPrice = 12.99;
    private final double largePrice = 14.99;
    private Size size;
    private Crust crust;
    private int numToppings;
    private double toppingPrice = 1.69;

    /**
     * Constructor Method
     * @param crust Pizza Crust, dependent on style
     */
    public BuildYourOwn(Crust crust){
        this.crust = crust;
        this.numToppings = 0;
        this.toppings = new ArrayList<Topping>();
    }

    /**
     * Calcuates the price of the pizza in current state
     * @return Proper price of pizza with current size and number of toppings
     */
    @Override
    public double price() {
        if (this.size.equals(Size.Small)){
            return smallPrice + numToppings * toppingPrice;
        }
        else if (this.size.equals(Size.Medium)){
            return  mediumPrice + numToppings * toppingPrice;
        }
        return largePrice + numToppings * toppingPrice;
    }

    /**
     * Accessor Method
     * @return Topping ArrayList
     */
    public ArrayList<Topping> getToppings() {
        return toppings;
    }

    /**
     * Accessor Method
     * @return numToppings
     */
    public int getNumToppings() {
        return numToppings;
    }

    /**
     * Adds a topping to the pizza
     * @param topping Topping to add
     * @return True if successfully added topping, false otherwise
     */
    public boolean addTopping(Topping topping){
        if (numToppings == 5){
            return false;
        }
        toppings.add(topping);
        numToppings++;
        return true;
    }

    /**
     * Removes a topping from the pizza
     * @param topping Topping to remove
     * @return True if successfully removed topping, false otherwise
     */
    public boolean removeTopping(Topping topping){
        if (numToppings == 0 || !toppings.contains(topping)){
            return false;
        }
        toppings.remove(topping);
        numToppings--;
        return true;
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
