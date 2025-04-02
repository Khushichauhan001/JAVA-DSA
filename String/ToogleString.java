// but take more time not good to do so 
package String;
import java.util.*;
public class ToogleString {
    public static void main(String[] args) {
        String str = "PHysiCs";
        System.out.println(str);
        // StringBuilder sb = new StringBuilder(str);
        for(int i=0 ; i<str.length();i++){
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
            // str.setCharAt(i,dh);
            str = str.substring(0, i) + dh + str.substring(i+1);
        }
        else {
            ascii -= 32 ;
            char dh = (char) ascii;
            // str.setCharAt(i, dh);
            str = str.substring(0, i) + dh + str.substring(i+1);
        }
        }
        System.out.println(str);
    }
}
