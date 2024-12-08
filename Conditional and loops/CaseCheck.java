import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        char ch = s1.next().trim().charAt(0);
         if(ch>= 'a' && ch <='z')
         {
            System.out.println("lowercase");
         }
         else 
         {
            System.out.println("UpperCase");
         }
       

    }
}
