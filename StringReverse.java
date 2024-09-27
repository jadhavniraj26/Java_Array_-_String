import java.util.*;

class StringReverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = sc.nextLine();
        int n = str.length();
        
        char[] reverseString = new char[str.length()];
        Stack<Character> stack = new Stack<Character>();
        
        for(int i =0; i < n; i++){
            stack.push(str.charAt(i));
        }
        int i = 0;
        while(!stack.isEmpty()){
            reverseString[i++] = stack.pop();
        }
         str = new String(reverseString);
        
        System.out.println("String after Reversing:" + str);
    }
}
