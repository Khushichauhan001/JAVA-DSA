package Array2.Medium;

import java.util.Arrays;

public class SmallestRange2 {
      public int smallestRangeII(int[] nums, int k) {
        int n = nums.length ;
        Arrays.sort(nums);
         int result = nums[n-1] - nums[0];
        for(int i=0 ; i< n-1 ;i++){
        int max = Math.max(nums[i]+k, nums[n-1] -k );
         int min = Math.min(nums[i+1]-k, nums[0]+k);
        result = Math.min(result , max-min);
        }
        return result ;
    }

    public static void main(String[] args) {
        int[] nums={1,3,6};
        int k= 3 ;
        SmallestRange2 s1 = new SmallestRange2();
        int ans =s1.smallestRangeII(nums, k);
        System.out.println(ans);
    }
}
