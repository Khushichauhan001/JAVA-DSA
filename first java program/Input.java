// sum of two number

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        // System.out.print("please enter some input:");
        // int rollno = s1.nextInt();
        // System.out.println("your roll no is " + rollno);

        int num1 = s1.nextInt();
        int num2 = s1.nextInt();

         int sum = num1 + num2 ;
        System.out.println("sum is " + sum);

    }
}
