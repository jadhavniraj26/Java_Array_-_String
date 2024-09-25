
import java.util.*;

public class ArrayDuplicate  {
         static void duplicate(int arr[], int n){
            HashMap<Integer, Integer> mp = new HashMap<>();
            
            for(int i = 0; i < n; i++){
                if(!mp.containsKey(arr[i])){
                    System.out.print(arr[i] + " ");
                    mp.put(arr[i],1);
                }
            }
        }
        
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

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
        duplicate(array,n);
    }
}
