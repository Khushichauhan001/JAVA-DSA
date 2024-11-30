
import java.util.Scanner;

public class Temperature{
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("please enter temp in C:");
        float tempC = s1.nextFloat();

        float tempF = (tempC * 9/5) + 32;

        System.out.println(tempF);
    }
}
