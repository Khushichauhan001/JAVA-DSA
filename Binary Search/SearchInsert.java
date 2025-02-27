public class SearchInsert {
    
    public int searchInsert(int[] nums, int target) {
        int n= nums.length;
        int ans=0;
        int low = 0 , high = n-1 ;
        while(low <= high){
            int  mid = (low+high)/2;
            if(nums[mid] == target){
               return mid ;
            }
            else if(nums[mid]< target){
                 ans = mid ;
                low = mid+1;
                //  return ans+1;
            }
            else {
                high = mid-1 ;
            }
        }
        return low;
    }
}