
package Stack;
import java.util.Stack;

public class BasicsOfStack{
    public static void main(String[] args) {
        Stack<Integer>  st = new Stack<>();
        System.out.println(st.isEmpty());
        System.out.println("size is " + st.size());
        System.out.println();
        st.push(1);
        System.out.println(st.isEmpty());
        st.push(2);
        st.push(3);
        st.push(4);
    }
}
