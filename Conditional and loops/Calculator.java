
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
    Scanner s1 = new Scanner(System.in);
  // Take input from user till user does not press X o x
  int ans=0;
  while (true)
  {
    //take the operator as input
    System.out.println("enter the operator: ");
    char op = s1.next().trim().charAt(0);
    if( op == '+' || op  == '-' || op == '*' || op == '/' || op == '%'){
         // input two numbers
         System.out.println("enter two numbers: ");
         int n1 = s1.nextInt();
         int n2 = s1.nextInt();
         // check
         if(op == '+'){
           ans = n1 + n2;
        }
        if(op == '-'){
            ans = n1 - n2;
         }
         if(op == '*'){
            ans = n1 * n2;
         }
         if(op == '/'){
            if(n2 !=0){
                ans = n1 / n2;
            }
          }
         if(op == '%'){
            ans = n1%n2;
         }
     } else if(op =='x' || op == 'X')
     {
        break;
     } else {
        System.out.println("invalid operation ");
     }
     System.out.println(ans);
  }
  
    
}
}

