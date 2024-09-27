import java.util.*;

class StringSum {
    
    static int findSum(String str) {
        String tempSum = ""; // Initialize as an empty string
        int sum = 0;
        
        for (int i = 0; i < str.length(); i++) {
            char s = str.charAt(i);
            
            if (Character.isDigit(s)) {
                tempSum += s; // Append the digit to tempSum
            } else {
                if (!tempSum.isEmpty()) {
                    sum += Integer.parseInt(tempSum); // Parse tempSum to integer and add to sum
                }
                tempSum = ""; // Reset tempSum to an empty string
            }
        }
        
        // Add the last number found (if any)
        if (!tempSum.isEmpty()) {
            sum += Integer.parseInt(tempSum);
        }
        
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = sc.nextLine();
        
        System.out.println("Sum of numbers in the string:");
        System.out.println(findSum(str));
    }
}
