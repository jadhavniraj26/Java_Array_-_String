import java.util.*;

public class ArrayInsert {

    // Method to insert an element at a specified position
    static int[] insertElement(int[] arr, int n, int element, int position) {
        int[] newArr = new int[n + 1];

        // Copy elements before the insertion position
        for (int i = 0; i < position; i++) {
            newArr[i] = arr[i];
        }

        // Insert the new element
        newArr[position] = element;

        // Copy the remaining elements after the insertion position
        for (int i = position; i < n; i++) {
            newArr[i + 1] = arr[i];
        }

        return newArr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Asking for the initial array size
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
        System.out.println(Arrays.toString(array));

        // Asking for the number of elements to insert
        System.out.println("Enter the Number of elements you want to insert:");
        int num = sc.nextInt();

        // Loop to insert multiple elements
        for (int i = 0; i < num; i++) {
            System.out.println("Enter the Element you want to enter:");
            int element = sc.nextInt();

            System.out.println("Enter the Position (0 to " + n + ") where you want to insert the element:");
            int position = sc.nextInt();

            if (position < 0 || position > n) {
                System.out.println("Invalid Position!");
            } else {
                // Insert the element and update the array
                array = insertElement(array, n, element, position);

                // Increment array size after each insertion
                n++;

                // Display the updated array after each insertion
                System.out.println("Array after Insertion:");
                System.out.println(Arrays.toString(array));
            }
        }
    }
}
