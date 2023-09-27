package restaurant;

import restaurant.kitchen.Dish;
import java.io.IOException;
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
    //order id
    private static int id = 0;
    private final int orderId;
    // and instance of the table from where the order was made
    private final Tablet tablet;
    // a list of dishes ordered by the customer
    protected List<Dish> dishes;

    /**
     * the constructor initializes an order and increments the value of the order id
     * @param tablet: an instance of the tablet from where the customer placed the order
     */
    public Order(Tablet tablet) throws IOException {
        this.tablet = tablet;
        dishes = ConsoleHelper.getAllDishesForOrder();
        orderId = id++;
    }

    @Override
    public String toString() {
        StringBuilder dishList = new StringBuilder();
        for (int i = 0; i < dishes.size(); i++){
            if (i > 0) dishList.append(", ");
            dishList.append(dishes.get(i).toString());
        }
        return String.format("Order %d: [%s]", this.orderId, dishList);
    }

    /**
     * A getter for the tablet instance id
     * @return returns the tablet id for this order
     */
    public int getTabletId() {
        return tablet.getId();
    }
}