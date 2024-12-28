// see in the a2z sheet ... this is the optimal solution 
package Array2.Easy;


public class Len_subarray {
    public int lenOfLongestSubarr(int[] arr, int k) {
        // code here
        int n = arr.length;
        int left = 0 ;
        // int right = 0 ;
        long  sum = 0;
        int maxLen = 0;
        
        
        for(int right = 0; right < n; right++) {
            sum += arr[right];

            while( left <= right && sum > k ){
                sum -= arr[left];
                left++;
            }
            
            if(sum == k){
                maxLen = Math.max(maxLen , right - left + 1);
            }
        }
        
        return maxLen;
    }
}
