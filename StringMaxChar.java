import java.util.*;

class StringMaxChar {
    
    static char maxOccuringChar(String str){
        char ans = 'a';
        int maxfreq = 0, n = str.length();
        int count[] = new int[256];
        for(int i = 0;i < n; i++){
            count[str.charAt(i)]++;
            if(count[str.charAt(i)] > maxfreq){
                maxfreq = count[str.charAt(i)];
                ans = str.charAt(i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = sc.nextLine();
        
        System.out.println("The character appearring maximum time in the given string:" + maxOccuringChar(str));
    }
}
