//Brute force 
class MaxDiff{
public static int maxDiff(int[] arr) {
    int n = arr.length;

    int ans = -1;
    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
            
            // If arr[j] > arr[i]
            if (arr[j] > arr[i]) {
                ans = Math.max(ans, arr[j] - arr[i]);
            }
        }
    }
    
    return ans;
}

public static void main(String[] args) {
    int[] arr = {2, 3, 10, 6, 4, 8, 1};
    System.out.println(maxDiff(arr));
} 
}



//optimal 
// class Solution {
//     public int maximumDifference(int[] nums) {
//         int n= nums.length;
//         int ans = -1;
//         int min = nums[0];
//         for(int i=0 ; i<n ; i++){
//             if(nums[i]<=min){
//                 min = nums[i];
//             }
//             else{
//                ans= Math.max(ans, nums[i]-min); 
//             }
//         }
//         return ans ;

//     }
// }