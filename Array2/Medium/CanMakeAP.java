package Array2.Medium;


// brute force approach
import java.util.Arrays;

public class CanMakeAP {
     public boolean canMakeArithmeticProgression(int[] arr) {
        // int n = arr.length ;
        boolean ans = helper(arr);
        return ans ;
    }
    public boolean helper(int[] arr){
        int n = arr.length ;
        // int diff =0 ;
        Arrays.sort(arr);
        int diff = arr[1]-arr[0];
        for(int i=2 ;i< n ;i++){
         int di = arr[i] - arr[i-1];
           if(di != diff){
             return false ;
           }
        }
        return true ;
        
    }
}




// /better approach tc: 0(n) sc: 0(n)

// class Solution {
//     public boolean canMakeArithmeticProgression(int[] arr) {
//         int n = arr.length ;
//         if(n<=2) return true  ;
        
//         int min = Integer.MAX_VALUE ;
//         int max = Integer.MIN_VALUE ;
//         for(int num : arr){
//             min = Math.min(min , num);
//             max = Math.max(max , num);
//         }

//         if((max - min) % (n-1) != 0) return false ;
//         int diff = (max-min) / (n-1);

//         if(diff == 0){
//             for(int num: arr){
//                 if(num != min){
//                     return false;
//                 }
//                 else {
//                     return true ;
//                 }
//             }
//         }

//         HashSet<Integer> seen = new HashSet<>();
//         for(int num: arr){
//             if((num-min) % diff !=0) return false ;
//             int idx = (num - min) / diff ;
//             if(seen.contains(idx)) return false ;
//             seen.add(idx);
//         }

//         return seen.size() == n;
//     }
// }





//  best optimal tc: 0(n) sc: 0(1)

// class Solution {
//     public boolean canMakeArithmeticProgression(int[] arr) {
//         int n = arr.length;
//         if (n <= 2) return true;

//         long min = Long.MAX_VALUE, max = Long.MIN_VALUE;
//         for (int v : arr) {
//             if (v < min) min = v;
//             if (v > max) max = v;
//         }

//         long range = max - min;
//         if (range % (n - 1) != 0) return false;
//         long diff = range / (n - 1);

//         if (diff == 0) {
//             for (int v : arr) if (v != min) return false;
//             return true;
//         }

//         int i = 0;
//         while (i < n) {
//             long offset = arr[i] - min;
//             if (offset % diff != 0) return false;
//             int idx = (int)(offset / diff);
//             if (idx < 0 || idx >= n) return false;

//             if (arr[i] == arr[idx]) {
//                 if (i != idx) return false; // duplicate element in wrong place
//                 i++;
//             } else {
//                 // swap arr[i] into its correct place
//                 int temp = arr[i];
//                 arr[i] = arr[idx];
//                 arr[idx] = temp;
//             }
//         }
//         return true;
//     }
// }
