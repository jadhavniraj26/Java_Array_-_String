import java.util.ArrayList;
import java.util.Scanner;

public class BookStore {

    // Method to find and display pairs with the given difference
    public static void findAndDisplayPairs(int[] prices, int difference) {
        int count = 0;
        ArrayList<String> pairs = new ArrayList<>();
        
        // Iterate through all possible pairs of book prices
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                // Check if the absolute difference between two prices equals the given difference
                if (Math.abs(prices[i] - prices[j]) == difference) {
                    count++;
                    pairs.add("(" + prices[i] + ", " + prices[j] + ")");
                }
            }
        }

        // Output the number of pairs and the pairs themselves
        System.out.println("Number of pairs with difference " + difference + ": " + count);
        if (count > 0) {
            System.out.println("The pairs are:");
            for (String pair : pairs) {
                System.out.println(pair);
            }
        } else {
            System.out.println("No pairs found with the given difference.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input in the format: "price1 price2 ..., difference"
        System.out.print("Enter book prices followed by the target difference (format: 'price1 price2 ..., difference'): ");
        String input = scanner.nextLine();

        // Splitting the input string based on the comma
        String[] parts = input.split(",");
        String[] priceStrings = parts[0].trim().split(" "); // Extract the book prices
        int difference = Integer.parseInt(parts[1].trim()); // Extract the difference value

        // Converting the array of price strings into an integer array
        int[] prices = new int[priceStrings.length];
        for (int i = 0; i < priceStrings.length; i++) {
            prices[i] = Integer.parseInt(priceStrings[i]);
        }

        // Find and display pairs with the given difference
        findAndDisplayPairs(prices, difference);
    }
}
