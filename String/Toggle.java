package String;
import java.util.*;

public class Toggle {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    StringBuilder str = new StringBuilder(sc.nextLine());
    System.out.println(str);

    //toggle
    // PHysiCs   -> phYSIcS
    for(int i = 0;i<str.length(); i++){
        // P -> p 
        // checkup-> alpha - small,capital ?
        boolean flag = true ;   // true -> capital

        char ch = str.charAt(i);
        if(ch == ' ')  continue ;
        int ascii = (int)ch;   // typecast
        if(ascii >= 90) flag = false ;     // small
        if(flag == true ){
            ascii += 32 ;
            char dh = (char)ascii;
            str.setCharAt(i,dh);
        }
        else {
            ascii -= 32 ;
            char dh = (char) ascii;
            str.setCharAt(i, dh);
        }
     }
     System.out.println(str);
   }    
}
