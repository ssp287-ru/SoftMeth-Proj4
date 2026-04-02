package project4;

/**
 * Concrete Class for New York Style Pizzas, implements PizzaFactory and assigns proper crusts for respective Pizza Types
 * @author Shivang Patel
 */
public class NYPizza implements  PizzaFactory {

    /**
     * Creates a New York Style Deluxe Pizza
     * @return New York Style Deluxe Pizza
     */
    @Override
    public Pizza createDeluxe(){
        return new Deluxe(Crust.Brooklyn);
    }

    /**
     * Creates a New York Style Meatzza Pizza
     * @return New York Style Meatzza Pizza
     */
    @Override
    public Pizza createMeatzza(){
        return new Meatzza(Crust.handTossedMeatzza);
    }

    /**
     * Creates a New York Style BBQ Chicken Pizza
     * @return  New York Style BBQ Chicken Pizza
     */
    @Override
    public Pizza createBBQChicken(){
        return new BBQChicken(Crust.Thin);
    }

    /**
     * Creates a New York Style Build Your Own Pizza
     * @return New York Style Build Your Own Pizza
     */
    @Override
    public Pizza createBuildYourOwn() {
        return new BuildYourOwn(Crust.handTossedBuildYourOwn);
    }
}
