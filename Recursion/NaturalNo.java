// package Recursion;

// import java.util.Scanner;

// public class NaturalNo {

//       static void printIncreasing(int n){
//         if(n==1){
//             System.out.println(n);
//             return ;
//         }

//         printIncreasing(n-1);    //1 ..2...3.. ...n-1
//         System.out.println(n);
//       }
//         public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         printIncreasing(n);

//     }
// }



// natural number from n to 1 
package Recursion;

import java.util.Scanner;

public class NaturalNo {

      static void printDecreasing(int n){
        if(n==1){
            System.out.println(n);
            return ;
        }

        System.out.println(n);
        printDecreasing(n-1);    //1 ..2...3.. ...n-1
      }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printDecreasing(n);

    }
}
