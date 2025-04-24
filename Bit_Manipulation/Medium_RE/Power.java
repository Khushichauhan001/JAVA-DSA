package Bit_Manipulation.Medium_RE;

public class Power {
    public static double myPow(double x, int n) {
        long m = n;
       double ans = 1 ;
       if(m<0){
                x = 1/x;
                m = -m;
        }
        while(m>0){
            if(m%2 == 1){
                ans = ans * x;
                m= m-1  ;
            }
            else{
                m = m/2;
                x = x*x ;
            }
          }
        
    return ans ;
}
    public static void main(String[] args) {
        double x=2.00000;
        int n = -2 ;
        System.out.println(myPow(x, n));
    }
}
