import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        // float num = s1.nextFloat();
        // System.out.println(num);

        // type casting
        int num = (int)(65.78f);
        System.out.println(num);


        // automatic type promotion in expressions
        // int a = 257;
        // byte b = (byte)(a);   // 257%256 = 1 give remainder bcz here maximum limit was 256 and above that rem wil come 
        // System.out.println(b);


        // byte a = 40 ;
        // byte b = 50;
        // byte c = 100;
        // int d = (a*b) / c;
        // System.out.println(d);

         
        int number = 'A';
        System.out.println(number); // gives ascai value of A i.e. 65
        // java can also print unicode values like kisi bhi language m likh do wo support krega hindi , china etc 




        // byte b = 50;
        // b = b * 2;  gives error /


        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f *b) + (i / c) - (d - s);  // output is float + int - double = double (entire result based on biggest one )
        System.out.println((f *b) + " " + (i / c) + " " + (d - s));
        System.out.println(result);
        
    }
}
