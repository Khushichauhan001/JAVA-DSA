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