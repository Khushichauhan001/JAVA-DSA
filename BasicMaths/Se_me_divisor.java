import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.Math;
public class Se_me_divisor{
    public static List< Integer > printDivisors(int n) {
        // Write your code here
        List<Integer> divisors = new ArrayList<>();
        int sqrtN = (int) Math.sqrt(n);
        for( int i=1;i<=sqrtN;i++){
            if(n%i == 0){   
               divisors.add(i); 
               if((n/i)!=i){
               divisors.add(n/i);
               }
            }
             
        }

        return divisors ;
        
    }
    public static void main(String[] args ){

        int num = 12;
        List<Integer> divisors = printDivisors(num);
        
        // Scanner s1 = new Scanner(System.in);
        // System.out.println("enter the number ");
         
        //  int n = s1.nextInt();
        System.out.println("Divisor of " +num+ "are");


        //  for(int divisor: divisors){        (can be run like this in loop)
            System.out.println(divisors+" ");
        //  }


        //  List<Integer> result = printDivisors(n);
        //  System.out.println(result);
             System.out.println();
     
    }

}