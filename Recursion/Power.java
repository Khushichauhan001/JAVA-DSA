// package Recursion;

// public class Power {
//     static int pow(int p , int q){
//         if(q==0) return 1;
//         return pow(p, q-1)*p;
//     }
//     public static void main(String[] args) {
//         System.out.println(pow(2,4));
//     }
// }


package Recursion;

public class Power {
    static int pow(int p , int q){
        if(q==0) return 1;
        int smallAns = pow(p, q/2);
        if(q%2==0){
            // return pow(p, q/2)*pow(p,q/2);
            // int smallAns = pow(p, q/2);
            return smallAns*smallAns;
        }
        else {
            // return pow(p, q/2)*pow(p, q/2)*p;
            // int smallAns = pow(p, q/2);
            return smallAns*smallAns*p;
        }
    }
    public static void main(String[] args) {
        System.out.println(pow(2,4));
    }
}
