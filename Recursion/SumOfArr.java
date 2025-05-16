package Recursion;

public class SumOfArr {
    static int sum(int[] arr, int idx){
        int n= arr.length;
        if(n==idx) return 0;

        // int smallAns = sum(arr, idx+1);
        // int ans = arr[idx];
        // return ans+smallAns;
        return arr[idx]+sum(arr, idx+1);

    }
    public static void main(String[] args) {
        int[] arr = {2,3,5,20,1};
        System.out.println(sum(arr, 0));
    }
}
