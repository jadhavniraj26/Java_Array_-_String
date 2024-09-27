import java.util.*;

class StringRemoveSpace {
    static int removeSpaces(char[] str) {
        int count = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i] != ' ') {
                str[count] = str[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = sc.nextLine();

        // Fix: Use toCharArray() with correct capitalization
        char[] str1 = str.toCharArray();
        
        // Remove spaces from the string
        int count = removeSpaces(str1);

        // Output the string after removing spaces
        System.out.println("String after removing the spaces:");
        System.out.print(String.valueOf(str1).subSequence(0, count));
    }
}
