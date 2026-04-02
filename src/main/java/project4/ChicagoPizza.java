package project4;

/**
 * Concrete Class for Chicago-Style Pizzas, implements PizzaFactory and assigns proper crusts for respective Pizza Types
 * @author Shivang Patel
 */
public class ChicagoPizza implements  PizzaFactory {

    /**
     * Creates a Chicago-Style Deluxe Pizza
     * @return new Chicago-Style Deluxe Pizza
     */
    @Override
    public Pizza createDeluxe(){
        return new Deluxe(Crust.deepDish);
    }

    /**
     * Creates a Chicago-Style Meatzza Pizza
     * @return new Chicago-Style Meatzza Pizza
     */
    @Override
    public Pizza createMeatzza(){
        return new Meatzza(Crust.Stuffed);
    }

    /**
     * Creates a Chicago-Style BBQ Chicken Pizza
     * @return new Chicago-Style BBQ Chicken Pizza
     */
    @Override
    public Pizza createBBQChicken(){
        return new BBQChicken(Crust.panBBQChicken);
    }

    /**
     * Creates a Chicago-Style Build Your Own Pizza
     * @return new Chicago-Style Build Your Own Pizza
     */
    @Override
    public Pizza createBuildYourOwn() {
        return new BuildYourOwn(Crust.panBuildYourOwn);
    }
}
