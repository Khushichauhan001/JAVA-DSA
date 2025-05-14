package Recursion;

public class CountDigits {
     static int countDig(int n){
        if(n>=0 && n<=9) return 1;

        int smallAns = countDig(n/10);
        // int last = 1;
        return smallAns+1; 
    }
    public static void main(String[] args) {
        System.out.println(countDig(12343476));
    }
}
