package Recursion;

public class PrintArray {   // 5 4 2 3
    static void print(int[] arr , int idx ){
        int n=arr.length;
        if(idx == n) return ;
        System.out.print(arr[idx]);
         print(arr, idx+1);
        return ;
    }
   
    public static void main(String[] args) {
        int[] arr = {5,4,2,3};
        print(arr, 0);
    }
}