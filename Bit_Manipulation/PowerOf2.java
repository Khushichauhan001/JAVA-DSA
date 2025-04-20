package Bit_Manipulation;

public class PowerOf2 {
    public boolean isPowerOfTwo(int n) {
        if(n<= 0) return false  ;
        if((n & n-1) == 0){
            return true ;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        // int n = 16 ;
        int n=13;
        PowerOf2 p1 = new PowerOf2();
        System.out.println(p1.isPowerOfTwo(n));

    }
}
