package Array2.Medium;

//kadaneś algorithm 
public class Max_subarray {
    public static long maxSubarraySum(int[] arr, int n) {
        long maxiEle = Long.MIN_VALUE;
        long sum = 0 ;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
             
            // maxiEle = Math.max(maxiEle , sum);
            if (sum > maxiEle) {
                maxiEle = sum;
            }

            if(sum < 0){
                sum = 0;
            }
        }

         // To consider the sum of the empty subarray
        // uncomment the following check:

        //if (maxi < 0) maxi = 0;

        
        return maxiEle ;
    }
    public static void main(String[] args) {
        int[] arr = {-2 , 1 ,-3, 4 , -1 , 2 , 1 , 5 , 4};
        int n= arr.length ; 
        long maxSum = maxSubarraySum(arr, n);
        System.out.println("the max subarray is " +maxSum);
    }
}
