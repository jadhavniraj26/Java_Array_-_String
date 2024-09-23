import java.util.*;

public class Reverse_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Asking for array size
        System.out.println("Enter the Size of Array: ");
        int n = sc.nextInt();
        int[] array = new int[n];

        // Taking input for array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Element " + i + " :");
            array[i] = sc.nextInt();
        }
        
        // Displaying the array after input is complete
        System.out.println("The Entered Array:");
        System.out.println(Arrays.toString(array)); // Display the array elements
        
        // Reverse the array and store the result
        int[] reversedArray = reverseArray(array, n);
        
        // Display the reversed array
        System.out.println("The Reversed Array is:");
        System.out.println(Arrays.toString(reversedArray)); // Display the reversed array
    }
    
    // Method to reverse the array and return the reversed array
    static int[] reverseArray(int[] arr, int n) {
        int[] ans = new int[n];  // Create a new array to store the reversed array
        for (int i = n - 1; i >= 0; i--) {
            ans[n - i - 1] = arr[i]; // Reverse the elements and store them in the new array
        }
        return ans; // Return the reversed array
    }
}
