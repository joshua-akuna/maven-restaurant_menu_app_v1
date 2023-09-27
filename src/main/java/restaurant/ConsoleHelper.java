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
 *
 * @author Akuna Joshua
 * @version 1.0.0
 * @since 2023-09-21
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
     * <p></p>
     * The method asks the customer to select a dish from a list of dishes displayed and adds it to the list.
     * Display a list of all the dishes and ask the customer to enter a string (the name of the dish)
     * The customer enters 'exit' to indicate the order is complete
     * If the entered dish is not on the menu, display a message stating that there is no such dish and continue taking order.
     * Rethrows IO exceptions.
     *
     * @return dishes: a list of dishes ordered by the customer
     * @throws IOException errors handling user inputs
     */
    public static List<Dish> getAllDishesForOrder() throws IOException {
        List<Dish> dishes = new ArrayList<>();
        boolean found;
        String prompt;
        ConsoleHelper.writeMessage("======================= NEW ORDER =========================");
        // displays a list of the menu to the customer
        ConsoleHelper.writeMessage(Dish.allDishesToString());
        ConsoleHelper.writeMessage("Please enter a dish" +
                " and press enter or enter exit to complete order.");
        System.out.format("Enter new dish here or exit => ");
        String newDish = readString();
        while (!newDish.trim().equalsIgnoreCase("exit")){
            found = false;
            for (Dish dish : Dish.values()){
                if (dish.name().equalsIgnoreCase(newDish)) {
                    found = true;
                    break;
                }
            }
            if (found) {
                dishes.add(Dish.valueOf(newDish.toUpperCase()));
            }
            else {
                prompt = newDish.trim().isBlank() ? "No dish selected" :
                        String.format("%s is not available", newDish);
                ConsoleHelper.writeMessage(String.format(
                        "%s , select a dish from the menu displayed.", prompt));
                ConsoleHelper.writeMessage(Dish.allDishesToString());
            }
            System.out.format("Enter a dish here or exit => ");
            newDish = readString();
        }
        ConsoleHelper.writeMessage("======================= ORDER COMPLETE =========================");
        return dishes;
    }
}