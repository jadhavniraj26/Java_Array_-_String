import java.util.*;

public class Second_Small_Big_Value {
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
        int[] sortedArray = sort(array);
        System.out.println(Arrays.toString(sortedArray)); // Use Arrays.toString() to print the array
        
        // Find and display the second smallest value
        int secondSmallest = findSecondSmallestValue(sortedArray);
        System.out.println("The second smallest value in the array is: " + secondSmallest);
        
        // Find and display the second biggest value
        int secondBiggest = findSecondBiggestValue(sortedArray);
        System.out.println("The second biggest value in the array is: " + secondBiggest);
    }

    // Method to sort the array and return the sorted array
    static int[] sort(int[] arr) {
        Arrays.sort(arr);
        return arr; // Return the sorted array
    }

    // Method to find the second smallest value
    static int findSecondSmallestValue(int[] arr) {
        if (arr.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements.");
        }
        return arr[1]; // Return the second smallest element
    }
    
    // Method to find the second biggest value
    static int findSecondBiggestValue(int[] arr) {
        if (arr.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements.");
        }
        return arr[arr.length - 2]; // Return the second biggest element
    }
}
