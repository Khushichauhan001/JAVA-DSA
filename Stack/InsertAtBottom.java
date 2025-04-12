package Stack;

import java.util.Scanner;
import java.util.Stack;

public class InsertAtBottom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        st.push(3);
        st.push(4);
         st.push(5);
         st.push(6);
         System.out.println(st);

         Stack<Integer> gt = new Stack<>();
         while(st.size() > 0){
            
             gt.push(st.pop());
         }

         st.push(2);
         while(gt.size()>0){

             st.push(gt.pop());
         }
         System.out.println(st);
    }
}
// tc: 0(2n)