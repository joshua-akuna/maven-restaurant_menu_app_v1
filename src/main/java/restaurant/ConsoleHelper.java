package restaurant;

import restaurant.kitchen.Dish;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * <h2>ConsoleHelper!</h2>
 * This class defines a simple text console which the customer interacts with.
 */
public class ConsoleHelper {
    private static final BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

    /**
     * displays a string on the console
     * @param message a string to be display on the console
     */
    public static void writeMessage(String message){
        // displays message on the console
        System.out.println(message);
    }

    /**
     * The method is used for processing user inputs
     * @return a string containing the user inputs
     * @throws IOException errors handling user inputs
     */
    public static String readString() throws IOException {
        // read strings from the console
        return br.readLine();
    }

    /**
     * Takes user input for each dish order, processes the input and if valid adds the dish to a list.
     * @return dishes: a list of dishes ordered by the customer
     * @throws IOException errors handling user inputs
     */
    public static List<Dish> getAllDishesForOrder() throws IOException {
        List<Dish> dishes = new ArrayList<>();
        boolean found;
        // displays a list of the menu to the customer
        ConsoleHelper.writeMessage(Dish.allDishesToString());
        ConsoleHelper.writeMessage("Please type a menu" +
                " item then enter to add it to the order or enter exit to " +
                " complete the order.");
        System.out.format("=> ");
        String newDish = readString();
        while (!newDish.trim().equalsIgnoreCase("exit")){
            found = false;
            for (Dish dish : Dish.values()){
                if (dish.name().equalsIgnoreCase(newDish)) {
                    found = true;
                    break;
                }
            }
            if (found)
                dishes.add(Dish.valueOf(newDish.toUpperCase()));
            else
                ConsoleHelper.writeMessage(String.format(
                        "%s not found in Menu\nEnter a valid Menu dish.", newDish));
            System.out.format("=> ");
            newDish = readString();
        }
        return dishes;
    }
}
