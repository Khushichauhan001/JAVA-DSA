import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        // int n = 25498;

        Scanner s1 = new Scanner(System.in);
        int n =  s1.nextInt();

        int ans = 0;
         while(n>0)
         {
            int rem = n%10;
            n= n/10;
            ans = ans*10+rem;
         }
         System.out.println(ans);
}
        }
        
