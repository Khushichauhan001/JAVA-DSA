// package Array2.Medium;

// public class Longest_subarray {
//         public static int longestSubarray(int[] arr, int k) {
//             // code here
//             int max = 0 ;
//             for(int i=0 ; i< arr.length ; i++){
//                 int sum = 0 ;
//                 for(int j=i ; j< arr.length ; j++){
//                     sum =sum+arr[j];
//                 if(sum == k){
//                      max = Math.max(max , j-i+1);
//                 }
//                 }
//             }
//             return max ;
//         }
//         public static void main(String[] args) {
//             int[] arr = { 10 , 5 ,2,7,1,-10};
//             int k= 15 ;
//             System.out.println(longestSubarray(arr, k));
//         }
//     }



//optimal approach  by using hashing 

package Array2.Medium;

import java.util.HashMap;
import java.util.Map;

public class Longest_subarray {
        public static int longestSubarray(int[] arr, int k) {
            // code here
        Map<Integer ,Integer> mp=new HashMap<>();
        int maxLen =0;
        int prefixSum = 0 ;
        for(int i=0 ; i< arr.length ; i++){
            prefixSum= prefixSum + arr[i];
            
            if(prefixSum == k){
                maxLen = i+1;
            }
            
            else if(mp.containsKey(prefixSum - k )){
                maxLen = Math.max(maxLen ,i-mp.get(prefixSum - k ));
            }
            
        if(!mp.containsKey(prefixSum)){
            mp.put(prefixSum , i );
        }
        }
        return maxLen;
        
    }
}


