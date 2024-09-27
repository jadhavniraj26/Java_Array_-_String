import java.util.*;

class StringASCII {

  public static void value(String str, int n) {
      for(int i=0; i < n ; i++){
          char c = str.charAt(i);
          int ascii = c;
          System.out.println("The ASCII value of " + c + " is: " + ascii);
      }
  }
  public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String :");
        String str = sc.nextLine();
        int length = str.length();
        
        value(str, length);
  }
}
