import java.util.Scanner;
public class CountNums {
    public static void main(String[] args) {
        // int n=456755;
        Scanner s1 = new Scanner(System.in);
        int n =  s1.nextInt();

        int count = 0;
        while(n>0)
        {
            int rem = n%10;
            if(rem == 5)
            {
                count++;            
            }
            n = n/10;
        }
       System.err.println(count);
        
    }
}
