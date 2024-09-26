import java.util.*;  

public class SubArray {
    
    static boolean isSubset(int arr1[], int m, int arr2[], int n){
        if(m>n){
            return false;
        }
        HashMap<Integer, Boolean> mp = new HashMap<Integer, Boolean>();
        for(int i = 0; i < n; i++){
            mp.put(arr2[i], true);
        }
        for(int j = 0; j < m; j++){
            if(mp.containsKey(arr1[j])==false){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Asking for the initial array size
        System.out.println("Enter the Size of 1st Array: ");
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
        System.out.println("The Entered 1st Array:");
        System.out.println(Arrays.toString(array));  
        
        // Asking for the initial array size
        System.out.println("Enter the Size of 2nd Array: ");
        int m = sc.nextInt(); 
        int[] array2 = new int[m];  

        // Taking input for array elements
        System.out.println("Enter " + m + " elements:");
        for (int i = 0; i < m; i++) {
            System.out.println("Enter Element " + i + " :");
            array2[i] = sc.nextInt();
        }
        Arrays.sort(array2);

        // Displaying the array after input and sorting is complete
        System.out.println("The Entered 2nd Array:");
        System.out.println(Arrays.toString(array2));
        
        boolean ans = isSubset(array, n , array2, m);
        
        if(ans== true){
            System.out.println("Array1[] is a subset of Array2.");
        }else{
            System.out.println("Array1[] is not a subset of Array2.");
        }
        
    }
}
