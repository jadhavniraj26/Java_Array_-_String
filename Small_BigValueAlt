import java.util.*;

public class Small_BigValueAlt {
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
        
        int biggest = findbiggestValue(array);
        System.out.println("The biggest value in the array is: " + biggest);
    }
    
    static int findSmallestValue(int arr[]){
        int smallest = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < smallest){
                smallest = arr[i];
            }
        }
        return smallest;
    }
    
     static int findbiggestValue(int arr[]){
        int biggest = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > biggest){
                biggest = arr[i];
            }
        }
        return biggest;
    }
}
