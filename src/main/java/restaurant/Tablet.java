package restaurant;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * <h2>Tablet!</h2>
 * This class is responsible for all of the functionalities and properties for table.
 *
 * @author Akuna Joshua
 * @version 1.0.0
 * @since 2023-09-21
 */
public class Tablet {
    private Order order;
    private final int id;
    private final Logger logger;

    /**
     * constructor initializing the id of a new tablet instance
     * @param id constant tablet instance id
     */
    public Tablet(int id){
        this.id = id;
        logger = Logger.getLogger(Tablet.class.getName());
    }

    /**
     * This method creates an Order instance consisting of the dishes order by the customer.
     * It will utilize a simple text console to interact with the customer
     */
    public void makeOrder(){
        try {
            order = new Order(this);
        } catch (IOException e) {
            ConsoleHelper.writeMessage("The console is unavailable");
            logger.setLevel(Level.SEVERE);
        }
    }

    /**
     * Returns a string representation for the current instance
     * @return a string
     */
    @Override
    public String toString() {
        String prompt;
        prompt = order.dishes.isEmpty() ? "Nothing ordered" : order.toString();
        return String.format("%s from Tablet id = %d", prompt, id);
    }

    /**
     * a getter for the instance id
     * @return id the current tablet instance id
     */
    public int getId() {
        return id;
    }
}
