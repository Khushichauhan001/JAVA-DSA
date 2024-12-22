//code to find the second largest element in an array of order 2

package Array2.Easy;
public class Sec_largest {
        public static void main(String[] args) {
            // Example array and its size
            int[] a = {1, 2, 3, 4, 5};
            int n = a.length;
    
            // Call the method to get second largest and second smallest
            int[] result = getSecondOrderElements(n, a);
    
            // Print the results
            System.out.println("Second Largest: " + result[0]);
            System.out.println("Second Smallest: " + result[1]);
        }
    
        public static int[] getSecondOrderElements(int n, int[] a) {
            int se_largest = SecondLargest(n, a);
            int se_smallest = SecondSmallest(n, a);
    
            return new int[]{se_largest, se_smallest};
        }
    
        public static int SecondLargest(int n, int[] a) {
            int largest = a[0];
            int se_largest = -1; // Initial value for second largest
            
            for (int i = 1; i < n; i++) {
                if (a[i] > largest) {
                    se_largest = largest;
                    largest = a[i];
                } else if (a[i] > se_largest && a[i] < largest) {
                    se_largest = a[i];
                }
            }
            return se_largest;
        }
    
        public static int SecondSmallest(int n, int[] a) {
            int smallest = a[0];
            int se_smallest = Integer.MAX_VALUE;
    
            for (int i = 1; i < n; i++) {
                if (a[i] < smallest) {
                    se_smallest = smallest;
                    smallest = a[i];
                } else if (a[i] < se_smallest && a[i] > smallest) {
                    se_smallest = a[i];
                }
            }
            return se_smallest;
        }
    }
    






    // public class Solution {



    //     public static int[] getSecondOrderElements(int n, int[] a) {
    //        int se_largest = SecondLargest(n, a);
    //        int se_smallest = SecondSmallest(n, a);
    
    //        return new int[]{se_largest, se_smallest};
    //     }
       
    //     public static int SecondLargest(int n , int[] a){
    //         int largest = Integer.MIN_VALUE;
    //         int se_largest = Integer.MIN_VALUE;   // quki hme 0 se chota chahhie
    //         for(int i = 0 ; i<n ; i++){
    //             if(a[i] > largest ){
    //                 se_largest = largest ; 
    //                 largest  = a[i];
    //             }   
    //             else if(a[i] < largest && a[i] > se_largest){
    //             se_largest = a[i];
    //             }
    //         }
    //         return se_largest;
    //     }
    
    //     public static int SecondSmallest(int n , int[] a){
    //        int smallest =Integer.MAX_VALUE;
    //        int se_smallest = Integer.MAX_VALUE;    
    //     // qki hme 10^9 s bda number chahie 
    //        for(int i = 0 ; i<n ; i++){
    //            if(a[i] < smallest){
    //                se_smallest = smallest ; 
    //                smallest = a[i];
    //            }
    //            else if(a[i] != smallest && a[i] < se_smallest){
    //               se_smallest = a[i];
    //            }
    //        }
    //            return se_smallest;
    //     }
    
    //     //   public static void main(String[] args) {
    //     //     // Write your code here.
    //     //     int[] a = {1,2,5,4,7,6,8};
    //     //     int n = a.length;
    
    //     //      int[] result = getSecondOrderElements(n, a);
    //     //     System.out.println("Second Largest: " + result[0]);
    //     //     System.out.println("Second Smallest: " + result[1]);
    
    //     // }
       
    // }