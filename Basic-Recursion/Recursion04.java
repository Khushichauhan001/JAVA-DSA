// print GFG 5 times 

public class Recursion04 {

    public void f(int i,int n){
       if(i>=n) return ;
       System.out.print(n-i+ " ");
    //    i++;
       f(i+1,n);
    }
    public static void main(String[] args) {
        
        Recursion04 r4 = new Recursion04();
        // int n ;/
        r4.f(0, 4);
        System.out.println();

    }
}


// second method (by backtracking)


// class Solution {

//     void printGfg(int n){
        
//         if(n == 0 ) return ;
        
//         printGfg(n-1);
//         System.out.print("GFG"+ " ");
//     }
// }