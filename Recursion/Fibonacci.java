package Recursion;

import java.util.Scanner;

public class Fibonacci {
    static int fibo(int n){
        //base case 
        if(n == 0 || n== 1) return n;

        // // subproblem 
        // int prev= fibo(n-1);
        // int PrevPrev =fibo(n-2);
        
        // // self work
        //  return prev+PrevPrev;


        return fibo(n-1)+fibo(n-2);
        

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0 ;i<=n;i++){
            System.out.print(fibo(i));
        }
    }
}
