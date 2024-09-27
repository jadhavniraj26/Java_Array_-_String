import java.util.*;

class StringReversefunction {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = sc.nextLine();
        
        StringBuilder str1 = new StringBuilder(str);
        str1.reverse();
        str = str1.toString();
        
        System.out.println("String after Reversing:" + str);
    }
}
