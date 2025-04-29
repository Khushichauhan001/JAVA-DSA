package Array2.Hard;



//optimal 1     
import java.util.*;

public class MaxProductSubarr {
    public static int maxProductSubArray(int[] arr) {
        int n = arr.length; //size of array.

        int pre = 1, suff = 1;
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (pre == 0) pre = 1;
            if (suff == 0) suff = 1;
            pre *= arr[i];
            suff *= arr[n - i - 1];
            ans = Math.max(ans, Math.max(pre, suff));
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, -3, 0, -4, -5};
        int answer = maxProductSubArray(arr);
        System.out.println("The maximum product subarray is: " + answer);
    }
}


//better

// import java.util.*;
// public class Main
// {
// 	static int maxProductSubArray(int arr[]) {
// 	    int result = arr[0];
// 	    for(int i=0;i<arr.length-1;i++) {
// 	        int p = arr[i];
// 	        for(int j=i+1;j<arr.length;j++) {
// 	            result = Math.max(result,p);
// 	            p *= arr[j];
// 	        }
// 	        result = Math.max(result,p);
// 	    }
// 	   return result;     
// 	}
// 	public static void main(String[] args) {
// 		int nums[] = {1,2,-3,0,-4,-5};
// 		int answer = maxProductSubArray(nums);
// 		System.out.print("The maximum product subarray is: "+answer);
// 	}
// }
