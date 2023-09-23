package restaurant.kitchen;

public enum Dish {
    Fish,
    Steak,
    Soup,
    Juice,
    Water;

    // returns a list of the available dishes
    public static String allDishesToString(){
        return String.format(
                "%s, %s, %s, %s, %s.",
                Fish,
                Steak,
                Soup,
                Juice,
                Water
        );
    }
}
