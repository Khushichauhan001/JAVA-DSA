// package BasicMaths;

import java.util.Scanner;
import java.lang.Math;
public class ArmstrongNum {
	
static boolean isArmstrong(int n){
        int temp , t_digit = 0 , rem =0 , sum = 0 ;
        temp = n ;
        while(temp > 0){
            temp = temp /10;
            t_digit++;
        }
        temp = n ;
        while(temp > 0){
            rem = temp % 10;
            sum += (int)(Math.pow(rem, t_digit));
            temp = temp/10;

        }
        return n == sum ;
    }


	public static void main(String[] args) {
		// Write your code here
        //  int num;
        // Scanner s1 = new Scanner(System.in);
        // System.out.println("enter the  limit");
        // num = s1.nextInt();
        // System.out.println("Armstrong number upto "+num+" are : ");
        // for(int i=0;i<=num;i++)
        //      if(isArmstrong(i))
        //      System.out.print(i+" ,");
        // System.out.println();
		boolean result = isArmstrong(371);
		System.out.println(result);

		boolean result1 = isArmstrong(18);
		System.out.println(result1);
	}
}
