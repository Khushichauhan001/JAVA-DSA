package String;
import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        String str = "abcdcba";

        // method 1 
        // StringBuilder gtr = new StringBuilder(str);
        // gtr.reverse();
        // String s = gtr + " ";   //hack to convert stringbuider into string 
        // if(str.equals(s)){
        //     System.out.println("Palindrome");
        // }
        // else {
        //     System.out.println("Not palindrome ");
        // }



        // method 2 

        int i = 0 ;
        int j = str.length()-1;
        boolean flag = true ;         
        while(i<j){
            if(str.charAt(i) != str.charAt(j)){
                // System.out.println("Not Palindrome ");
                flag = false ;
                break ;
            }
            i++;
            j--;
        }
        if(flag == true ) System.out.println( "Palindrome");
        else System.out.println("not palindrome");
    }
}


//optimized
// class Solution {
//     boolean isPalindrome(String s) {
//         int left = 0;
//         int right = s.length() - 1;
        
//         while (left < right) {
//             if (s.charAt(left) != s.charAt(right)) {
//                 return false;  // If characters don't match
//             }
//             left++;
//             right--;
//         }
        
//         return true;  // If all characters matched
//     }
// }

