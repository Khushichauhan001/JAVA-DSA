package Stack;

import java.util.Scanner;
import java.util.Stack;

public class DisplayStack {

    public static void Displayrec(Stack<Integer> st){    //pass by reference 
        // st.push(8);
        if(st.size()==0) return ;
        int top = st.pop();
        System.out.println(top);
        Displayrec(st);
        st.push(top);
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        st.push(3);
        st.push(4);
         st.push(5);
         st.push(6);
        //  System.out.println(st);
         Displayrec(st);
        //  System.out.println(st);

        // Stack<Integer> rt = new Stack<>();
        // while(st.size()>0){                      // its a function where we display stak w/o using sout ..

        //     // int x = st.pop();
        //     // rt.push(x)
            
        //     rt.push(st.pop());
        // }
        // while (rt.size()  > 0  ) {
        //     int x = rt.pop();
        //     System.out.print(x + " ");
        //     st.push(x);
        // }


        
        // second method by using array 

        // int n = st.size();
        // int[] arr = new int[n];
        // for(int i =  n-1 ; i>= 0 ; i--){

        //     // int x = st.pop();
        //     // arr[i] = x ;      OR

        //     arr[i] = st.pop();
        // }
        // for(int i = 0 ; i<n ; i++){
        //     int x = arr[i];
        //     System.out.println(x);
        //     st.push(x);
        // }


        // third method by using recursion 

    }
}
