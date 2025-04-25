package SlidingWindow;

public class MaxSubarrayWithSumk {
    public int maximumSumSubarray(int[] arr, int k) {
        // Code here
        int max = Integer.MIN_VALUE ;
        int sum= 0 ;
        int i = 0 ; 
        int j = 0;
        int n = arr.length ;
        while(j <n ){
            sum = sum + arr[j];
            if(j-i+1 < k){
            j++ ;
             }
            else if(j-i+1 == k){
              max = Math.max(max , sum);
              sum = sum - arr[i];
              i++;
              j++;
             }
        }
        return max ;
        
    }
    public static void main(String[] args) {
        int[] arr = {100,200,300,400};
        int k = 3 ;
        MaxSubarrayWithSumk m1 = new MaxSubarrayWithSumk();
        System.out.println(m1.maximumSumSubarray(arr, k));
    }
}
