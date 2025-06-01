// package String;
import java.util.*;

public class Builder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("hello");
        // StringBuilder str1 = new StringBuilder(100);  // here 100 is the capacity and here if we donot give any value so its initial by default value is 16
        str.append("world");    // helloworld
        System.out.println(str);

        str.setCharAt(0, 'k');
        System.out.println(str);

        str.insert(2, "y");
        System.out.println(str);

        str.deleteCharAt(0);
        System.out.println(str);

        // str.delete(0, 2);
        // System.out.println(str); 

        str.reverse();
        System.out.println(str);
    }
}
