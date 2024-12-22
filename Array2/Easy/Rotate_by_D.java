// i am using the reversable approach to solve this ...

package Array2.Easy;

public class Rotate_by_D {
    public static void Reverse(int[]  arr, int start , int end) {
        while(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp ; 
            start++;
            end--;
        }
      }

      public static void Rotate_to_right(int[] arr , int n , int k ){
        // reverse the last k element 
        Reverse(arr, n-k, n-1);
        // reverse the first n-k elements 
        Reverse(arr, 0 , n-1-k);
        // reverse the whole array 
        Reverse(arr, 0, n-1);
      }

      public static void Rotate_to_left(int[] arr , int n , int k ){
        // reverse the first k element 
        Reverse(arr, 0, k-1);
        // reverse the last n-k elements 
        Reverse(arr, k , n-1);
        // reverse the whole array 
        Reverse(arr, 0, n-1);
      }


      public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int n = 7; 
        int k = 2; 
        // Rotate_to_right(arr, n, k);
        // System.out.println("After rotating the elements in right , array is :");
        // for(int i = 0 ; i<n ; i++){
        //     System.out.print(arr[i]+ " ");
           
        // }
        // System.out.println();

        Rotate_to_left(arr, n, k);
        System.out.println("After rotating the elements  in left, array is :");
        for(int i = 0 ; i<n ; i++){
            System.out.print(arr[i]+ " ");
           
        }
        System.out.println();
      }
}
