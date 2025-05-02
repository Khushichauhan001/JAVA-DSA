//leetcode 229 Majority element which occur more than n/3 times 
package Array2.Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MajorityeleNby3{
    public static List<Integer> majorityEle(int[] nums){
         List<Integer> ans = new ArrayList<>();
        int n= nums.length;
        HashMap<Integer,Integer> h1 = new HashMap<>();
        int  mini = (int)((n/3)+1);
        for(int i=0 ; i<n ; i++ ){
          h1.put(nums[i], h1.getOrDefault(nums[i], 0)+ 1);

        if(h1.get(nums[i]) == mini){
            ans.add(nums[i]);
        }
        }
        return ans ;
    }
    public static void main(String[] args) {
        int[] nums= { 2,3,4,3,2,3,2,3,2,3,2,4,3,2,5};
        System.out.println(majorityEle(nums));
    }
}



// optimal (using moore voting)
// class Solution {
//     public List<Integer> majorityElement(int[] nums) {
//      int n = nums.length; 
//         int cnt1 = 0, cnt2 = 0; 
//         int el1 = Integer.MIN_VALUE; 
//         int el2 = Integer.MIN_VALUE;

//         for (int i = 0; i < n; i++) {
//             if (cnt1 == 0 && el2 != nums[i]) {
//                 cnt1 = 1;
//                 el1 = nums[i];
//             } else if (cnt2 == 0 && el1 != nums[i]) {
//                 cnt2 = 1;
//                 el2 = nums[i];
//             } else if (nums[i] == el1) cnt1++;
//             else if (nums[i] == el2) cnt2++;
//             else {
//                 cnt1--; cnt2--;
//             }
//         }

//         List<Integer> ls = new ArrayList<>(); 

//         cnt1 = 0; cnt2 = 0;
//         for (int i = 0; i < n; i++) {
//             if (nums[i] == el1) cnt1++;
//             if (nums[i] == el2) cnt2++;
//         }

//         int mini = (int)(n / 3) + 1;
//         if (cnt1 >= mini) ls.add(el1);
//         if (cnt2 >= mini) ls.add(el2);

//         return ls;
// }
// }