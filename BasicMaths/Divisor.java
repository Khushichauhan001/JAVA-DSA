import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Divisor{
    public static List< Integer > printDivisors(int n) {
        // Write your code here
        List<Integer> divisors = new ArrayList<>();
        for( int i=1;i<=n;i++){
            if(n%i == 0){
               divisors.add(i); 
            }
             
        }
        return divisors ;
    }
    public static void main(String[] args ){
        
        
        Scanner s1 = new Scanner(System.in);
        System.out.println("enter the number ");
         
         int n = s1.nextInt();

         List<Integer> result = printDivisors(n);
         System.out.println(result);

     
    }
}