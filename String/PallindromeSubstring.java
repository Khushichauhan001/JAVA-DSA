package String;
import java.util.*;

public class PallindromeSubstring {
    public static boolean isPalindrome(String s){
        int i = 0 ;
        int j = s.length()-1;
        while(i<j ){
            if(s.charAt(i) != s.charAt(j))  return false ;
            i++;
            j--;
        }
        return true ;
    }
    public static void main(String[] args) {
        String str = "abbd";
        int count = 0 ;
        for(int i=0 ; i<str.length() ;i++){
            for(int j = i+1 ; j<=str.length();j++){
                // System.out.print(str.substring(i,j)+ " ");
                if(isPalindrome(str.substring(i,j)) == true ){
                    System.out.print(str.substring(i,j)+ " ");
                    count ++;
                }
            }
        }
        System.out.println("\n the no. of paaindromic sunstrings is" +count );

    }
}
