package project4;

import java.util.ArrayList;

/**
 * Concrete Class for Orders, includes Order Number and ArrayList of Pizzas in Order
 * @author Shivang Patel
 */
public class Order {
    private int number; // order number
    private ArrayList<Pizza> pizzas;

    /**
     * Constructor Method
     * @param number Order Number
     */
    public Order(int number) {
        this.number = number;
        this.pizzas = new ArrayList<Pizza>();
    }

    /**
     * Adder Method
     * @param pizza Unique Pizza to Add
     */
    public void addPizza(Pizza pizza) {
        pizzas.add(pizza);
    }

    /**
     * Remover Method
     * @param pizza Pizza to Remove
     */
    public void removePizza(Pizza pizza) {
        pizzas.remove(pizza);
    }

    /**
     * Remover Method
     * @param index Index of which pizza to remove
     */
    public void removePizza(int index) {
        pizzas.remove(index);
    }

    /**
     * Accessor Method
     * @return Order Number
     */
    public int getNumber() {
        return number;
    }

    /**
     * Accessor Method
     * @return Current ArrayList of Pizzas
     */
    public ArrayList<Pizza> getPizzas(){
        return pizzas;
    }

}
