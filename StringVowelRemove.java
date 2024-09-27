// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class StringVowelRemove {
    public static String RemoveVowels(String str){
        for(int i =0; i < str.length(); i++){
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U') {
        str = str.substring(0, i) + str.substring(i + 1);
        System.out.println(str);
        i--;
            }
        }
        return str;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String :");
        String str = sc.nextLine();
        int length = str.length();
        System.out.println("String after removing the vowels \n"+RemoveVowels(str));
        
    }
}
