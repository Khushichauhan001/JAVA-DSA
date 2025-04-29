package Array2.Medium;

// import java.util.ArrayList;

// public class   Buy_sell_01 {
//     public static int maximumProfit(ArrayList<Integer> prices) {
//         // Initialize variables
//         int maximumProfit = 0;
//         int minPrice = Integer.MAX_VALUE;

//         // Iterate through the prices
//         for (int i = 0; i < prices.size(); i++) {
//             // Update the minimum price if a lower price is found
//             if (prices.get(i) < minPrice) {
//                 minPrice = prices.get(i);
//             }
//             // Calculate profit and update maximum profit if necessary
//             else {
//                 maximumProfit = Math.max(maximumProfit, prices.get(i) - minPrice);
//             }
//         }

//         return maximumProfit;
//     }
// }



public class   Buy_sell_01 {
        public static int maximumProfit(int[] arr){
            int maxPro = 0;
            for(int i=0 ; i<arr.length;i++){
                for(int j=i+1 ; j<arr.length ; j++){
                    if(arr[j] > arr[i]){
                        maxPro = Math.max(maxPro, arr[j] - arr[i]);
                    }
                }
            }
            return maxPro ;
        }
        public static void main(String[] args) {
            int[] arr = {7 , 1 ,5,3,6,4};
            int maxPro = maximumProfit(arr);
            System.out.println(maxPro);
        }
}


//optimal 


// import java.util.*;
// public class Main {
//     public static void main(String[] args) {
//         int arr[] = {7,1,5,3,6,4};
//         int maxPro = maxProfit(arr);
//         System.out.println("Max profit is: " + maxPro);
//     }

//     static int maxProfit(int[] arr) {
//         int maxPro = 0;
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i + 1; j < arr.length; j++) {
//                 if (arr[j] > arr[i]) {
//                     maxPro = Math.max(arr[j] - arr[i], maxPro);
//                 }
//             }
//         }
//         return maxPro;
//     }
// }
