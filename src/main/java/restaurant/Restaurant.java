package restaurant;

/**
 * <h2>Restaurant!</h2>
 * Defines the virtual Restaurant
 *
 * @author Akuna Joshua
 * @version 1.0.0
 * @since 2023-09-21
 */
public class Restaurant {
    Tablet tablet1;

    /**
     * Initializes a tablet
     */
    public Restaurant(){
        tablet1 = new Tablet(1);
    }

    /**
     * gets a customers order
     */
    public void getOrder(){
        tablet1.makeOrder();
        System.out.println(tablet1);
    }
}
