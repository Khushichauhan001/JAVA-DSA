import java.util.Scanner;

public class Loops {
    public static void main(String[] args){
    // {
        // Scanner s1= new Scanner(system.in);
        // QUES:- Print numbers from 1 to 5 ;
        // for( int i=1;i<=5;i++) 
        // {
        //     System.out.println(i);
        
        // }

        //Q:    Print number from 1 to n 
        Scanner s1= new Scanner(System.in);
        
        System.out.println("enter the number");
        int n = s1.nextInt();
        // for(int i =1 ; i<=n ;i++)
        // {
        //     System.out.println(i);
        // }

       // while loop

       int num=1;
       while(num<=5)
       {

        System.out.println(num);
        num++;
       }


       // do while 
    //    do{
     //          body
    //    } while (condition);

     n=1;
    do{
        System.out.println("hello");
    }  while (n!= 1);



    }
}
