package Recursion;
public class SumOfDigits{
    public static int SOD(int n){
        if(n>=0 && n<=9) return n ;
       int smallAns = SOD(n/10);
       int lastdigit = n%10;
       return smallAns+lastdigit;
    }
    public static void main(String[] args) {
        System.out.println(SOD(45543));
    }
}