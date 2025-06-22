import java.util.*;

// brute force 
//TC: O(n2)
//sc: 0(1)
class Leader {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
      ArrayList<Integer> ans  = new ArrayList<>();
      int n= arr.length ;
      for(int i=0 ;i< n ;i++){
          int j;
          for( j=i+1 ; j< n ;j++){
              if(arr[i]< arr[j]){
                  break ;
              }
          }
          if(j == n){
               ans.add(arr[i]);
          }
      }
      return ans ;
    }
    public static void main(String[] args) {
        int[] arr = {17,6,18,2,1};
        System.out.println(leaders(arr));
    }
}



//optimal sol   
// tc: o(n)
//sc: o(1)

// import java.util.ArrayList;
// import java.util.Collections;

// class GfG {

//     // Function to find the leaders in an array
//     static ArrayList<Integer> leaders(int[] arr) {
//         ArrayList<Integer> result = new ArrayList<>();
//         int n = arr.length;

//         // Start with the rightmost element
//         int maxRight = arr[n - 1];

//         // Rightmost element is always a leader
//         result.add(maxRight);

//         // Traverse the array from right to left
//         for (int i = n - 2; i >= 0; i--) {
//             if (arr[i] >= maxRight) {
//                 maxRight = arr[i];
//                 result.add(maxRight);
//             }
//         }

//         // Reverse the result list to maintain
//         // original order
//         Collections.reverse(result);

//         return result;
//     }

//     public static void main(String[] args) {
//         int[] arr = { 16, 17, 4, 3, 5, 2 };
//         ArrayList<Integer> result = leaders(arr);
//         for (int res : result) {
//             System.out.print(res + " ");
//         }
//         System.out.println();
//     }
// }