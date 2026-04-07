package project4;

import static org.junit.Assert.*;

public class BuildYourOwnTest {
    private final double smallPrice = 10.99;
    private final double mediumPrice = 12.99;
    private final double largePrice = 14.99;
    private final double toppingPrice = 1.69;
    private final int maxToppings = 5;

    @org.junit.Test
    public void smallSizeTests() { // tests small pizza price for 0-5 toppings
        BuildYourOwn testPizza = new BuildYourOwn(Crust.panBuildYourOwn);
        testPizza.setSize(Size.Small);
        for (int numToppings = 0; numToppings <= maxToppings; numToppings++){
            double price = smallPrice + numToppings * toppingPrice;
            if (numToppings > testPizza.getNumToppings()){
                testPizza.addTopping(Topping.PINEAPPLE);
            }
            assertEquals(price, testPizza.price(), 0.0);
        }
    }

    @org.junit.Test
    public void mediumSizeTests() { // tests medium pizza price for 0-5 toppings
        BuildYourOwn testPizza = new BuildYourOwn(Crust.panBuildYourOwn);
        testPizza.setSize(Size.Medium);
        for (int numToppings = 0; numToppings <= maxToppings; numToppings++){
            double price = mediumPrice + numToppings * toppingPrice;
            if (numToppings > testPizza.getNumToppings()){
                testPizza.addTopping(Topping.PINEAPPLE);
            }
            assertEquals(price, testPizza.price(), 0.0);
        }
    }

    @org.junit.Test
    public void largeSizeTests() { // tests large pizza price for 0-5 toppings
        BuildYourOwn testPizza = new BuildYourOwn(Crust.panBuildYourOwn);
        testPizza.setSize(Size.Large);
        for (int numToppings = 0; numToppings <= maxToppings; numToppings++){
            double price = largePrice + numToppings * toppingPrice;
            if (numToppings > testPizza.getNumToppings()){
                testPizza.addTopping(Topping.PINEAPPLE);
            }
            assertEquals(price, testPizza.price(), 0.0);
        }
    }

    @org.junit.Test
    public void extraTests() {
        BuildYourOwn testPizza1 = new BuildYourOwn(Crust.panBuildYourOwn);
        BuildYourOwn testPizza2 = new BuildYourOwn(Crust.panBuildYourOwn);
        testPizza1.setSize(Size.Medium);
        testPizza2.setSize(Size.Medium);
        Topping[] toppingsToAdd = {Topping.PINEAPPLE, Topping.greenPEPPER, Topping.PROVOLONE};
        testPizza1.addToppings(toppingsToAdd);
        toppingsToAdd = new Topping[]{Topping.HAM, Topping.PEPPERONI, Topping.CHEDDAR};
        testPizza2.addToppings(toppingsToAdd);
        assertEquals(testPizza1.price(), testPizza2.price(), 0.0); // ensures different toppings don't influence price
        testPizza1.setSize(Size.Large);
        testPizza1.removeTopping(Topping.PINEAPPLE); testPizza1.removeTopping(Topping.greenPEPPER); testPizza1.removeTopping(Topping.PROVOLONE);
        testPizza1.addToppings(toppingsToAdd);
        assertNotEquals(testPizza1.price(), testPizza2.price(), 0.0); // ensures matching toppings but different sizes influences price
    }
}