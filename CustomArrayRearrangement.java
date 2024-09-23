import java.util.*;

public class CustomArrayRearrangement  {
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
        
        Arrays.sort(array);
        
        //rearrange the array such that the first half is in increaing order and second in decreasing order
        int[] rearrangedArray = rearrangeArray(array, n);
        
        System.out.println("Rearranged Array (First half is increasing, Second half decreasing): ");
        System.out.println(Arrays.toString(rearrangedArray));
    }
    
    static int[] rearrangeArray(int[] arr, int n){
        int[] result = new int[n];
        int half = n/2;
        
        //copy the first half in ascending order (already sorted)
        for(int i = 0; i < half; i++){
            result[i] = arr[i];
        }
        // copy the second half in descending order
        for(int i = 0; i < n - half; i++){
            result[half + i] = arr[n - 1 - i];
        }
        return result;
    }
    
}
