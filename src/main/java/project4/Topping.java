package project4;

/**
 * Enum Class for Pizza Toppings
 * @author Shivang Patel
 */
public enum Topping {
    SAUSAGE,
    PEPPERONI,
    greenPEPPER,
    ONION,
    MUSHROOM,
    bbqCHICKEN,
    PROVOLONE,
    CHEDDAR,
    BEEF,
    HAM,
    buffaloChicken,
    PINEAPPLE,
    JALAPENOS
    ; // 13 unique toppings

    /**
     * Constructor Method
     */
    Topping() {
    }

    /**
     * toString() Override Method
     * @return Formatted Name of Topping
     */
    @Override
    public String toString() {
        return switch(name()){
            case("greenPepper") -> "Green Pepper";
            case("bbqCHICKEN") -> "BBQ Chicken";
            default -> name().toLowerCase();
        };
    }
}
