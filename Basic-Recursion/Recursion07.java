// sum of n natural number using recursion 
public class Recursion07 {
     int sum( int n) {
      if ( n==0) return 0;
     return n + sum(n-1);
       
    
    }
    public static void  main(String[] args) {
        Recursion07 r7 = new Recursion07();
        int n = 6;
        int result = r7.sum(n);
        System.out.println("the result is"+ result);
    }
}
