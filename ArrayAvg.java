// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;

public class ArrayAvg  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;

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
        
        for (int i = 0; i < n; i++){
            sum += (double)array[i];
        }
        double avg = sum/n;
        System.out.println("The Sum of the elements of the arrays : "+sum);
        System.out.println("The Average of the elements of the arrays : "+avg);

    }
}
