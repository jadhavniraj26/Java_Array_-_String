// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;

public class ArrayMedian  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double med ;

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
        
        if(n % 2 == 0){
            int ind1 = (n/2)-1;
            int ind2 = n/2;
            med = (double)(array[ind1] +  array[ind2])/2;
            System.out.println("Median the given Array :" + med);
        }else {
            int ind = n/2 ;
            med = array[ind];
            System.out.println("Median the given Array :" + med);
        }
    }
}
