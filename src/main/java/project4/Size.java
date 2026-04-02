package project4;

/**
 * Enum Class for Pizza Size
 * @author Shivang Patel
 */
public enum Size {
    Small, Medium, Large;
    // Costs are calculated by price() functions.

    /**
     * Constructor Method
     */
    Size(){}

    /**
     * toString() Override Method
     * @return Small, Medium, or Large depending on Pizza Size
     */
    @Override
    public String toString(){
        return name();
    }

    /**
     * Equals method for Size
     * @param size Other Size item to compare to
     * @return True if Size.name() values are equal, false otherwise
     */
    public boolean equals(Size size){
        return this.name().equals(size.name());
    }

}
