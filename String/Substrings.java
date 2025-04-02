package String;
import java.util.*;

public class Substrings {
    public static void main(String[] args) {
        String str = "abcd";    // 0 to 3 index
        for(int i=0 ; i<=3 ;i++){
            for(int j = i+1 ; j<=4;j++){
                System.out.print(str.substring(i,j)+ " ");
            }
        }
    }
}