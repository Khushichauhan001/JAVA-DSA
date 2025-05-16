package Recursion;

import java.util.Scanner;

public class SumAlternateSign {
    static int sumAlter(int n){
        if(n==0)  return 0 ;
        int smallAns = sumAlter(n-1);
        if(n%2==0){  // if even 
            return smallAns-n;
        }
        else {
            return smallAns+n;
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sumAlter(n));
    }
}
