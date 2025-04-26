// Frequency of the Most Frequent Element(leetcode 1838)


package Array2.Medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FRequency {
        public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);

        long sum = 0 ; 
        int i=0  ;
        int maxFre = 0 ;

        for(int j = 0 ; j< nums.length ; j++){
            sum = sum+nums[j];

            while((long)nums[j]* (j-i+1) > sum+ k){
                sum = sum -nums[i];               //"Window badhao jab tak k ke andar ho, warna left se ghatate raho!"
                i++;
            }
            maxFre =  Math.max(maxFre ,j-i+1);      
        }
        return maxFre ;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,4};
        int k = 5 ;
        FRequency f1 = new FRequency();
        System.out.println(f1.maxFrequency(nums, k));
    }
}


//Condition ka simple matlab:

// Kya hum k operations ke andar saare elements ko nums[right] ke barabar bana sakte hain?
// Agar nahi, to window chhoti karo (left ko aage badhao).

// Jab tak window me saare elements ko equal karne ka cost sum + k ke andar nahi aata, tab tak window ko chhota karte raho.



// package Array2.Medium;   // it calculatesmax fre but ques is different ....leetcode 1838

// import java.util.HashMap;
// import java.util.Map;

// public class FRequency {
//         public int maxFrequency(int[] nums, int k) {
//         Map<Integer , Integer> mp = new HashMap<>();
//         int n  = nums.length ;
//         int count = 0 ;
//         for(int i=0 ; i<n ; i++){
//            if(!mp.containsKey(nums[i])){
//             mp.put(nums[i] ,0);
//         }
//         mp.put(nums[i] , mp.getOrDefault(nums[i],0) +1);

//         }
//         int maxFre = 0 , minFre = n ;
//         int maxEle = 0 , minEle = 0 ;

//          for(Map.Entry<Integer, Integer> entry : mp.entrySet() ){
//              count = entry.getValue();
//             int element = entry.getKey();

//             if(count > maxFre){
//                 maxFre = count ;
//                 maxEle = element ;
//             }
//             if(count < minFre){
//                 minFre = count ;
//                 minEle = element ;
//             }
//          }
//          return maxFre ;
//           }
// }

