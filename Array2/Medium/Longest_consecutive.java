// better solution 


// package Array2.Medium;

// import java.util.ArrayList;
// import java.util.Arrays;

// public class Longest_consecutive{
//     public static int longestConsecutiveElement(int[] a){
//         int n = a.length;
//         if(n==0) return 0;
   

//            Arrays.sort(a);
//            int lastSmaller = Integer.MIN_VALUE;
//            int count = 0 ;
//            int longest = 1 ;

//            for(int i=0;i<n ;i++){
//               if(a[i] - 1 == lastSmaller){
//                 count = count+1 ;
//                 lastSmaller = a[i];

//               }
//               else if(a[i] != lastSmaller){
//                 count = 1;
//                 lastSmaller = a[i];
//               }
//               longest = Math.max(longest, count);
//            }
//              return longest ;
//     } 

//     public static void main(String[] args) {
//         int[] a = {100 , 200 , 1 , 2 ,3 ,5,4};
//         int n = a.length ; 
//         int ans = longestConsecutiveElement(a);
//         System.out.println(ans);
//     }

// }


// optimise solution ...  

package Array2.Medium;
import java.util.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Longest_consecutive{
    public static int longestConsecutiveElement(int[] a){
        int n = a.length ; 
        
        if(n==0){
            return 0; 
        }

        int longest = 1 ;
        Set<Integer> set = new HashSet<>();
        int count = 0 ;

        // PUT ALL THE ELEMENTS INTO THE SET 

        for(int i=0 ; i< n;i++){
            set.add(a[i]);
        }

        for(int it : set){
            if(!set.contains(it -1 )){
                  count = 1 ;
                    int x = it;

                 while(set.contains(x+1)) {
                    x = x+1 ;
                    count = count +1 ;
                 }  
                 longest = Math.max(longest, count);

            }
        }
        return longest ; 
      }
      public static void main(String[] args) {
        int[] a = { 100 , 200 , 1 , 2 , 3 , 5 ,4};
        int n= a.length ; 
        int ans = longestConsecutiveElement(a);
        System.out.println(ans);
      }
}