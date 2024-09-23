import java.util.*;

public class Increase_Decrease_sort {
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
        
        // Sort the array in increasing order
        Arrays.sort(array);
        System.out.println("Array in the Increasing Order: ");
        System.out.println(Arrays.toString(array));
        
        //Sort in descending order
        int[] descendingArray = reverseArray(array);
        System.out.println("Array in Decreasing Order: ");
        System.out.println(Arrays.toString(descendingArray));
    }
    
    //Method to reverse the array (to get decreasing order)
    static int[] reverseArray(int[] arr){
        int n = arr.length;
        int[] reversed = new int[n];
        for(int i = 0; i < n; i++){
            reversed[i] = arr[n - 1 - i]; //Copy elements in reverse order
        }
        return reversed;
    }
}
