package String ;
import java.util.Scanner;

public class CountAlpha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          System.out.println("Enter a line or sentence:");
         String line = sc.nextLine();
         int vowels =0 , consonants = 0 , digits = 0 , whiteSpaces = 0;

         line =line.toLowerCase();

         for(int i=0 ;i<line.length();i++){
            char ch = line.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
               if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowels++;
              }
              else {
                consonants++;
              }
            }
            else if( ch >='0' && ch <= '9'){
                digits++;
            }
            else if( ch == ' '){
                whiteSpaces++;
            }
         }
          System.out.println("\n--- Character Count ---");
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("White Spaces: " + whiteSpaces);

        sc.close();
    }

}
