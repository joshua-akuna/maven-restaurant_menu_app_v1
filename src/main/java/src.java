import restaurant.ConsoleHelper;
import restaurant.kitchen.Dish;
import java.io.IOException;
import java.util.List;

/**
 * <h2>restaurant menu app!<h2/>
 * This app is an electronic menu that automates the activities in a restaurant
 * <p></p>
 * We'll state the task like this: the restaurant manager wants the following:
 * 1. Each table has a tablet that can be used to place orders
 * 2. While an order is being prepared, the tablet show ads.
 * 3. At the end of the business day, various statistics can be reviewed:
 *  a) cook utilization
 *  b) total revenue from orders
 *  c) total revenue from ad impressions
 * <p></p>
 * For this version, we'll develop a simple kernel (without a GUI) which allows customers to place orders. A GUI would be developed in later versions. Thus, this app is limited to a console interface.
 * <p></p>
 * In addition, some of the data would be hardcoded but the app would be commected to a db in later versions.
 * <p></p>
 * The features implemented for this version includes
 * <h3>First:</h3>
 * - Customers orders will be sent to the cook automatically.
 * - The cook will prepare the an order for a while and then mark it as prepared.
 * - Then the waiter will carry it away
 * <h3>Second:</h3>
 * - Desired commercials will be selected from a list of paid ads.
 * - These commercials would be displayed while the order is prepared.
 * - Maximize ads revenue
 * <h3>Third:</h3>
 * - Calculate the statistics
 * - Display the statistics to the manager
 *
 * NOTE: THIS APP WAS BUILT BASED ON A TASKS ON CODE-GYM
 *
 * @author Akuna Joshua
 * @version 1.0.0
 */
public class src {
    public static void main(String[] args) throws IOException {
        List<Dish> dishes = ConsoleHelper.getAllDishesForOrder();

        for (Dish dish : dishes)
            ConsoleHelper.writeMessage(dish.toString());
    }
}
