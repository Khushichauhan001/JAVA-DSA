// best case  (TC : 0(n))
package String;

import java.util.Arrays;

class Anagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false ;
        }
        int[] charCount = new int[26];

        for(int i= 0 ;i< s.length() ; i++){
            charCount[s.charAt(i) - 'a']++;
            charCount[t.charAt(i) - 'a']--;
        }

        for(int count : charCount)
         if(count != 0){
            return false ;
         }
         return true ; 
    }

 
}



// average case .... TC : 0( n logn)

// public class Anagram {
//     public boolean isAnagram(String s, String t) {
//         if(s.length() != t.length()){
//             return false ;
//         }
//         String sortLen1 = sortString(s);
//         String sortLen2 = sortString(t);
       
//         // if(sortLen1 == sortLen2){
//         //     return true ; 
//         // } 
//         return sortLen1.equals(sortLen2);
        
//     }
//     private static String sortString(String inputString){
//         char tempArray[] = inputString.toCharArray();
//         Arrays.sort(tempArray);
//         return new String(tempArray);
//     }
// }

