// brute force method 
// package Bit_Manipulation;

// import java.time.format.SignStyle;
// import java.util.*;

// public class SinglenumberII {
//     public int SingleNo2(int[] nums) {
//         Map<Integer, Integer> mpp = new HashMap<>();
        
//         for (int num : nums) {
//             mpp.put(num, mpp.getOrDefault(num, 0) + 1);
//         }

//         for (Map.Entry<Integer, Integer> entry : mpp.entrySet()) {
//             if (entry.getValue() == 1) {
//                 return entry.getKey();
//             }
//         }

//         return -1; // or throw an exception if appropriate
//     }

//     public static void main(String[] args) {
//         int[] nums = {4,4,4,3,2,2,2};
//         // System.out.println(SingleNo2(nums));
//          SinglenumberII s1 = new SinglenumberII();
//          System.out.println(s1.SingleNo2(nums));
//     }
// }




// better approach tc: 0(n*32) in all cases
 // sc: 0(1)

//  package Bit_Manipulation;

// import java.time.format.SignStyle;
// import java.util.*;

// public class SinglenumberII {
//     public int SingleNo2(int[] nums) {
//        int ans = 0 ;
//        int n = nums.length;
//        for(int bitIndex = 0 ; bitIndex<32 ; bitIndex++){
//          int  count = 0 ;
//           for(int i=0 ;i< n ;i++){
//             if((nums[i] & (1 << bitIndex)) !=0){
//                count++;
//             }
//         }
//             if(count % 3 == 1 ){
//                 ans =ans | (1<<bitIndex);
//             }
//         }
//         return ans ;
//     }

//     public static void main(String[] args) {
//         int nums[] = {2,2,3,2,3,3,4};
//         SinglenumberII s1 = new SinglenumberII();
//         System.out.println(s1.SingleNo2(nums));
//     }
// }



// best method  tc: nlogn + n/3     sc: 0(1)
package Bit_Manipulation;

import java.time.format.SignStyle;
import java.util.*;

public class SinglenumberII {
    public int SingleNo2(int[] nums) {
      int n = nums.length;
    //   int sorted = nums.sort();
    Arrays.sort(nums);
      for(int i=1 ; i<n; i= i+3){
        if(nums[i] != nums[i-1]){

            return nums[i-1];
        }
    }
    
        return nums[n-1];
    }

    public static void main(String[] args) {
        int nums[] = {2,2,3,2,3,3,4};
        SinglenumberII s1 = new SinglenumberII();
        System.out.println(s1.SingleNo2(nums));
    }
}
