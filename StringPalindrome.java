// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class StringPalindrome {
    static private boolean isPalindrome(String s){
        int left = 0, right = s.length()-1;
        while(left < right){
            char l = s.charAt(left), r = s.charAt(right);
            if(!Character.isLetterOrDigit(l)){
                left++;
            }else if(!Character.isLetterOrDigit(r)){
                right--;
            }else if(Character.toLowerCase(l)!=Character.toLowerCase(r)){
                return false;
            }else{
                left++;
                right--;
            }
        }
        return true;
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String to find if it's Palindrome or not :");
        String str = sc.nextLine();
        
        boolean ans = isPalindrome(str);
        
        if (ans == true){
            System.out.println("Is a Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
    }
}
