import java.util.*;  

public class ArraySearch {
    
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
        Arrays.sort(array);

        // Displaying the array after input and sorting is complete
        System.out.println("The Entered Array:");
        System.out.println(Arrays.toString(array));  

        // Asking for the element to search in the array
        System.out.println("Enter the element you want to search:");
        int num = sc.nextInt();
        
        // Initializing variables for binary search
        int low = 0;  
        int high = n - 1; 
        int ans = -1; 
        
        // Implementing binary search
        while(low <= high) {
            int mid = (low + high) / 2;  // Finding the middle index

            // If the middle element is greater than the target, search the left half
            if(array[mid] > num) {
                high = mid - 1;
            }
            // If the middle element is smaller than the target, search the right half
            else if (array[mid] < num) {
                low = mid + 1;
            }
            // If the middle element matches the target, store the index and break the loop
            else {
                ans = mid;
                break;
            }
        }
        // If ans is -1, the element was not found, otherwise print the element and its index
        if (ans != -1) {
            System.out.println("The element " + array[ans] + " is present at " + ans + " index");
        } else {
            System.out.println("The element " + num + " is not present in the array.");
        }
    }
}
