import java.util.Scanner;
import java.util.*;

public class Char_hashing {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        String s ;
        s = s1.next();
        

     // pre compute
     int[] hash = new int[256];
     for(int i = 0 ; i<s.length();i++){
        hash[s.charAt(i)]++;
     }

     // to fetcch
     int q ;
     q = s1.nextInt();
     while(q-- > 0){
        char c;
        c = s1.next().charAt(0);

        System.out.println(hash[c]);
     }
    }
}
