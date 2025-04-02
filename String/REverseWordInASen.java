package String;
import java.util.*;

import Array2.Medium.printLeaderBrute;

public class REverseWordInASen {
    public static void main(String[] args) {
        String str = "I am a student";
        String ans = "";
        StringBuilder sb = new StringBuilder("");
        for(int i = 0 ; i<str.length();i++){
            char ch = str.charAt(i);
            if(ch!= ' '){
                sb.append(ch);
            }
            else {    // ch = " "
                sb.reverse();
                ans+= sb ;
                ans += " ";
                // sb.delete(0,sb.length());
               sb = new StringBuilder();   /// to refresh the stringbuilder after entering the data into ans 

            }
        }
        //2:33:35
        // sb.append(" ");
        sb.reverse();
         ans += sb ;
        System.out.println(ans);
    }
}
