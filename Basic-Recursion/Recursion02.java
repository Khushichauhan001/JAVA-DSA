// another method in Rec06.java
public class Recursion02 {

    public void f(int i,int n){
       if(i>n) return ;
       System.out.print(i+ " ");
    //    i++;
       f(i+1,n);
    }
    public static void main(String[] args) {
        
        Recursion02 r2 = new Recursion02();
        // int n ;/
        r2.f(1, 5);
        System.out.println();

    }
}

// geeksforgeeks solved all test case pass 

// class Solution {
//     int i = 1 ;
//     public void printNos( int n) {
//         // Your code here
//         if(i>n) return;
//        System.out.print(i + " ");
//          i++;
//         printNos(n); 
//     }
// }
