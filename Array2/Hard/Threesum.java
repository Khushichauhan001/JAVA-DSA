package Array2.Hard;
import java.util.*;
//better using hashing 

class Threesum {
    public List<List<Integer>> threeSum(int[] nums) {
        int n= nums.length ;
        Set<List<Integer>> st = new HashSet<>();
         
         for(int i=0; i< n ; i++){
            Set<Integer> h1 = new HashSet<>();
            for(int j=i+1 ;j< n ;j++){
                int third = -(nums[i]+nums[j]);

                if(h1.contains(third)){
                    List<Integer> temp = Arrays.asList(nums[i], nums[j] , third);
                    Collections.sort(temp);
                    st.add(temp);
                }
                h1.add(nums[j]);
            }
         }
         List<List<Integer>> ans = new ArrayList<>(st);
         return ans;
    }

    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        Threesum t1 = new Threesum();
        System.out.println(t1.threeSum(nums));
    }
}




//optimal sol 
// import java.util.*;

// public class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
//         List<List<Integer>> ans = new ArrayList<>();
//         Arrays.sort(nums);
//         int n = nums.length;

//         for (int i = 0; i < n; i++) {
//             if (i != 0 && nums[i] == nums[i - 1]) continue;

//             int j = i + 1;
//             int k = n - 1;
//             while (j < k) {
//                 int sum = nums[i] + nums[j] + nums[k];
//                 if (sum < 0) {
//                     j++;
//                 } else if (sum > 0) {
//                     k--;
//                 } else {
//                     ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
//                     j++;
//                     k--;
//                     while (j < k && nums[j] == nums[j - 1]) j++;
//                     while (j < k && nums[k] == nums[k + 1]) k--;
//                 }
//             }
//         }

//         return ans;
//     }
// }
