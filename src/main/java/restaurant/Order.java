package restaurant;

import restaurant.kitchen.Dish;
import java.util.List;

/**
 * Order - defines the customers order containing a list of dishes
 */

public class Order {
    private final Tablet tablet;
    protected List<Dish> dishes;

    public Order(Tablet tablet){
        this.tablet = tablet;
    }
}
