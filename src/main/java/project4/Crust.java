package project4;

/**
 * Enum class for Crusts, includes additional properties: Pizza Style & Pizza Type
 * @author Shivang Patel
 */
public enum Crust {
    deepDish("Chicago-Style Crust", "Deluxe"),
    panBBQChicken("Chicago-Style Crust", "BBQ Chicken"),
    Stuffed("Chicago-Style Crust", "Meatzza"),
    panBuildYourOwn("Chicago-Style Crust", "Build your own"),
    Brooklyn("New York Style Crust", "Deluxe"),
    Thin("New York Style Crust", "BBQ Chicken"),
    handTossedMeatzza("New York Style Crust", "Meatzza"),
    handTossedBuildYourOwn("New York Style Crust", "Build your own");

    private final String pizzaStyle;
    private final String pizzaType;

    /**
     * Constructor Method
     * @param pizzaStyle Style of Pizza (New York Style Crust or Chicago-Style Crust)
     * @param pizzaType Type of Pizza (Deluxe, BBQ Chicken, Meatzza, or Build Your Own)
     */
    Crust(String pizzaStyle, String pizzaType) {
        this.pizzaStyle = pizzaStyle;
        this.pizzaType = pizzaType;
    }

    /**
     * Accessor Method
     * @return Pizza Style
     */
    public String getPizzaStyle() {
        return pizzaStyle;
    }

    /**
     * Accessor Method
     * @return Pizza Type
     */
    public String getPizzaType() {
        return pizzaType;
    }

    /**
     * Overrides toString(), returns a formatted string of the Crust name.
     * @return Crust Name
     */
    @Override
    public String toString() {
        return switch (name()) {
            case ("deepDish") -> "Deep Dish";
            case ("panBBQChicken"), ("panBuildYourOwn") -> "Pan";
            case ("Stuffed") -> "Stuffed";
            case ("Brooklyn") -> "Brooklyn";
            case ("Thin") -> "Thin";
            default -> "Hand-Tossed";
        };
    }
}
