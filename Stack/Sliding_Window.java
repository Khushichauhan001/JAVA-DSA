//leetcode 239   (brute force )
// package Stack;    // brute force and it gives time limit exceeds error ... 

// public class Sliding_Window {
//     public int[] maxSlidingWindow(int[] nums, int k) {
//         int n = nums.length;
//         int[] ans = new int[n-k+1];
//         int z=0 ;
//         for(int i=0 ; i<n-k+1;i++){
//             int max = Integer.MIN_VALUE;
//            for(int j=i;j<i+k ; j++){  // run always k times
//              max = Math.max(max ,nums[j]);
//            }
//            ans[z++] = max ;
           
//         }
//         return ans ;
//          //TC: 0(k+(n-k+1))  -> 0(k+n)

//     }
// }




// better approach 
// package Stack;
// import java.util.*;
// public class Sliding_Window {
//     public int[] maxSlidingWindow(int[] nums, int k) {
//     int n = nums.length;
//     int[] ans = new int[n-k+1];
//     int z=0 ;
//    Stack<Integer> st = new Stack<>();
//    int[] nge = new int[n];
//    st.push(n-1);
//    nge[n-1] = n;
//   for(int i=n-2 ; i>=0 ;i--){
//     while(st.size()>0 && nums[i] > nums[st.peek()]){
//         st.pop();
//     }
//        if(st.size() == 0) nge[i] = n;
//         else nge[i] = st.peek();
//         st.push(i);
//     }
//     for( int i=0 ; i<n-k+1 ; i++){
//         int j=i ;
//         int max = nums[j];
//         while(j<i+k){
//             max = nums[j];
//             j = nge[j];
//         }
//         ans[z++] =max ;
//     }
//     return ans ;
// }
// }






// best approach 
package Stack;
 import java.util.*;
public class Sliding_Window {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n-k+1];
        int z=0 ;
       Stack<Integer> st = new Stack<>();
       int[] nge = new int[n];
       st.push(n-1);
       nge[n-1] = n;
      for(int i=n-2 ; i>=0 ;i--){
        while(st.size()>0 && nums[i] > nums[st.peek()]){
            st.pop();
        }
           if(st.size() == 0) nge[i] = n;
            else nge[i] = st.peek();
            st.push(i);
        }
        int j=0 ; 
        for( int i=0 ; i<n-k+1 ; i++){
            if(j>=k+i) j=i ;
            int max = nums[j];
            while(j<i+k){
                max = nums[j];
                j = nge[j];
            }
            ans[z++] =max ;
        }
        return ans ;
      
    }
}



