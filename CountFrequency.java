import java.util.*;

public class CountFrequency {
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
        
        Map<Integer, Integer> frequencyMap = countFrequency(array);
        
        System.out.println("Frequency of each element:");
        for (Map.Entry<Integer, Integer> entry: frequencyMap.entrySet()){
            System.out.println("Element " + entry.getKey() + " occurs " + entry.getValue() + "times.");
        }
    }
    
    static Map<Integer, Integer> countFrequency(int[] arr){
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            if (frequencyMap.containsKey(arr[i])){
                frequencyMap.put(arr[i], frequencyMap.get(arr[i]) + i);
            }else{
                frequencyMap.put(arr[i], 1);
            }
        }
        return frequencyMap;
    }
}
