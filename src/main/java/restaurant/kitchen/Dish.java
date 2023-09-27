package restaurant.kitchen;

/**
 * <h2>Dish</h2>
 * Defines and list available dishes
 *
 * @author Akuna Joshua
 * @version 1.0.0
 * @since 2023-09-21
 */
public enum Dish {
    FISH,
    STEAK,
    SOUP,
    JUICE,
    WATER;

    /**
     * Returns a String listing all the available dishes
     * @return a string listing all the available dishes.
     */
    public static String allDishesToString(){
        return String.format(
                "%s, %s, %s, %s, %s.",
                FISH,
                STEAK,
                SOUP,
                JUICE,
                WATER
        );
    }
}
