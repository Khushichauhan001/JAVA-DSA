package Stack;

import java.util.Scanner;
import java.util.Stack;

public class RemoveFrBottom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        Stack<Integer> gt = new Stack<>();
        while(st.size() > 1){
            gt.push(st.pop());
        }
        st.pop();
         while(gt.size()>0){
            st.push(gt.pop());
         }
         System.out.print(st);


    }
}
