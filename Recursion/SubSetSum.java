package Recursion;

public class SubSetSum {

    static void printSumofSubset(int[] arr , int idx ,int sum){
        //base case 
        int n = arr.length;
        // sum = 0;
        if(idx>=n){
            System.out.println(sum);
            return;
        }
        int curr = arr[idx];
        // if included
        int newSum = sum+curr;
        printSumofSubset(arr, idx+1, newSum);

        //if not included
        printSumofSubset(arr, idx+1, sum);
    }

    public static void main(String[] args) {
        int[] arr ={2,4,5};
        printSumofSubset(arr, 0, 0);
    }
}
