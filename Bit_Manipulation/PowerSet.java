package Bit_Manipulation;
import java.util.*;
class PowerSet {
    public List<List<Integer>> subsets(int[] nums){
        int n = nums.length;
        int TotalSubsets = 1 << n;
       List<List<Integer>> ans = new ArrayList<>();

        for(int i=0 ; i<TotalSubsets ; i++){
            List<Integer> subset = new ArrayList<>();
            for(int j=0 ; j<n ; j++){
                if((i & (1 << j)) != 0){
                    subset.add(nums[j]);
                }
            }
                ans.add(subset);
        }
            return ans ;
    }


    public static void main(String[] args) {
        PowerSet sol = new PowerSet();
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = sol.subsets(nums);

        // Print subsets
        for (List<Integer> subset : result) {
            System.out.println(subset);
        }
    }
}