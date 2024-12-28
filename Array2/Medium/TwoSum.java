// brute force (type 1 where we have to return only yes and no )
// package Array2.Medium;
// public class TwoSum {
//         public static String twooSum(int n , int[] arr , int target){
//             for(int i=0 ; i< n ;i++){
//                 for(int j=i+1; j<n ;j++){
//                     if(arr[i] + arr[j] == target ) return "Yes";

//                 }
//             }
//             return "No";
//         }

//         public static void main(String[] args) {
//             int n = 5;
//             int[] arr = {2,4,3,6,5};
//             int target = 11 ;
//             String ans = twooSum(n, arr, target);
//             System.out.println(ans);
//         }
// }




// also brute approach but here we have to return our answer in array form  
// package Array2.Medium;
// public class TwoSum {
//         public static int[] twooSum(int n , int[] arr , int target){
//             int[] ans = new int[2];
//             ans[0] = ans[1] = -1;
//             for(int i=0 ; i< n ;i++){
//                 for(int j=i+1; j<n ;j++){
//                     if(arr[i] + arr[j] == target ) 
//                 {
//                   ans[0] = i;
//                   ans[1] = j;
//                   return ans;
//                 }
//             }
//             }
//             return ans;
//         }

//         public static void main(String[] args) {
//             int n = 5;
//             int[] arr = {2,4,3,6,5};
//             int target = 11 ;
//             int[] ans = twooSum(n, arr, target);
//             System.out.println(ans[0] + " , " + ans [1]);
//             // System.out.println(ans);  // give error 
//         }
// }






// BETTER SOLUTION USING HASHING 

// public class Solution {
//     public static String read(int n, int []book, int target){
//         // Write your code here.
//         HashMap<Integer , Integer >  mpp = new HashMap<>();
//         for(int i=0;i< n ;i++){
//         int num = book[i];
//         int moreNeed = target - num;
//         if(mpp.containsKey(moreNeed)){
//             return "YES";
//         }
//         mpp.put(book[i], i);
//     }
//      return "NO";
// }
// }



// opimal solution 
package Array2.Medium;
import java.util.Arrays;
public class TwoSum {
    public static String twooSum(int n , int[] arr , int target){
        Arrays.sort(arr);
        int left = 0 ;  
        int right = n-1 ;
        while(left < right){
            int sum= arr[left] + arr[right];
            if(sum == target){
                return "YES";
            }
            else if(sum < target ) left++;
            else right--;
        }
        return "NO";

    }
    public static void main(String[] args) {
        int n = 5 ;
        int[] arr = { 2,6,5,8,11};
        int target = 14 ;
        String ans = twooSum(n, arr, target);
         System.out.println(ans);
    }
}