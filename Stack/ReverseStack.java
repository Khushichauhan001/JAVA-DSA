package Stack;

import java.util.Scanner;
import java.util.Stack;

public class ReverseStack {
    // public static int PushAtBottom(int x){
    //     Stack<Integer> st = new Stack<>();
    //     st.push(3);
    //     st.push(4);
    //      st.push(5);
    //      st.push(6);
    //      System.out.println(st);

    //     Stack<Integer> gt = new Stack<>();
    //     while(st.size() > 0){
           
    //         gt.push(st.pop());
    //     }

    //     st.push(2);
    //     while(gt.size()>0){

    //         st.push(gt.pop());
    //     }
    //     System.out.println(st);
    // }

    public static void PushAtBottom(Stack<Integer> st , int x ){    // recursively 
        if(st.size() == 0 ) {
            st.push(x);
            return ;
        }
       int top = st.pop();
       PushAtBottom(st , x);
       st.push(top);
    }

    public static void Reverse(Stack<Integer> st){
        if(st.size() == 1) return ;
        int top = st.pop();
        Reverse(st);
        PushAtBottom(st, top);

     }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);



         // 1:31:24  
    }
}
