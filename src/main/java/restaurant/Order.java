package restaurant;

import restaurant.kitchen.Dish;
import java.util.List;

/**
 * <h2>Order!</h2>
 * Defines list of dishes ordered and the instance to the tablet where the order was made
 *
 * @author Akuna Joshua
 * @version 1.0.0
 * @since 2023-09-21
 */

public class Order {
    // and instance of the table from where the order was made
    private final Tablet tablet;
    // a list of dishes ordered by the customer
    protected List<Dish> dishes;

    /**
     * the construct:or for the order class
     * @param tablet: an instance of the tablet from where the customer placed the order
     */
    public Order(Tablet tablet){
        this.tablet = tablet;
    }
}