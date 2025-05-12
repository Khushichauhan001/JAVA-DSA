package Recursion;

import java.util.Scanner;

public class Factorial {

    static int findFact(int n){
        if(n== 1){     // or if(n==0) return 1 ;
            // System.out.println();
            return 1;
        }
        //    int fact = findFact(n-1);
        //    int ans = n*fact;
        //    return ans;   can be write also
        return n*findFact(n-1);
           
        
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();   
        // findFact(n);
        System.out.println(findFact(n));
    }
}
