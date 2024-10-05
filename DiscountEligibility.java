import java.util.Scanner;

public class DiscountEligibility {
    
    // Method to calculate the sum of digits of a number
    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10; // Add the last digit
            number /= 10; // Remove the last digit
        }
        return sum;
    }

    // Method to check if the sum of digits is divisible by 3
    public static boolean isEligibleForDiscount(int discountPoints) {
        int sum = sumOfDigits(discountPoints);
        return sum % 3 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the discount points: ");
        int discountPoints = scanner.nextInt();

        boolean eligible = isEligibleForDiscount(discountPoints);
        System.out.println("Is the customer eligible for discount? " + eligible);
    }
}
