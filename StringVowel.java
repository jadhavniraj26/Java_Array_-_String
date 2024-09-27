// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class StringVowel {
    public static void solve(String str, int length){
        int vowels = 0, consonants =0, whitespaces = 0;
        str = str.toLowerCase();
        for(int i = 0; i < length; i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowels++;
            }else if(ch >= 'a' && ch <= 'z'){
                consonants++;
            }else if(ch==' '){
                whitespaces++;         
            }
        }
        System.out.println("Vowels:" + vowels);
        System.out.println("Consonants:" + consonants);
        System.out.println("White Spaces:" + whitespaces);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String :");
        String str = sc.nextLine();
        int length = str.length();
        solve(str, length);
        
    }
}
