import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        int a = s1.nextInt();
        int b = s1.nextInt();
        int c = s1.nextInt();

        //Q : find the largest of the three number 
        // // int max = a;
        // if(b> max)
        // {
        //     max = b;
        // }
        // else if (c> max)
        // {
        //     max=c;
        // }
        // System.out.println(max);


        // int max = 0;
        // if(a>b)
        // {
        //     max=a;
        // } else {
        //     max = b ;
        // }

        // if( c> max) {
        //     max = c;
        // }
        // System.out.println(max);


        // 3rd methd

        int max = Math.max(c, Math.max(a, b));
        //   System.out.println(Math.max(200,56));
        System.out.println(max);

    }
    
}
