import java.util.*;

public class SmallestValue {
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
        System.out.println(Arrays.toString(array)); // Use Arrays.toString() to print the array
        
        // Find and display the smallest value
        int smallest = findSmallestValue(array);
        System.out.println("The smallest value in the array is: " + smallest);
    }

    // Method to find the smallest value by sorting the array
    static int findSmallestValue(int arr[]) {
        Arrays.sort(arr); // Sorts the array in ascending order
        return arr[0];    // The smallest element will be the first element
    }
}
