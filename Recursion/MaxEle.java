package Recursion;

public class MaxEle {
    static int max(int[] arr ,int idx){
      if(idx == arr.length-1) return arr[idx] ;
       
        // int smallAns = max(arr, idx+1);
        // int self = arr[idx];
        return Math.max(max(arr, idx+1), arr[idx]);

    }
   public static void main(String[] args) {
    int[] arr = {12 ,2,24 ,5,4,6};
    System.out.println(max(arr, 0));
   } 
}
