// self
package Stack.Infix_Postfix;

import java.util.Stack;

public class Prefix_to_Postfix {
    public static void main(String[] args) {
        String str = "-9/*+5346";
        int n= str.length();
        Stack<String> st = new Stack<>();

        for(int i= n-1 ; i>=0 ; i--){
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if(ascii>=48 && ascii<=57){
                // String s = " " + ch ;
                int x = ascii - 48;
                String s = " " + x;
                st.push(s);
            }
            else if (ch == '+' || ch == '-' || ch== '*' || ch=='/'){
             String v1 = st.pop();
             String v2 = st.pop();
             String op =  " " + ch ;
             String t = v1+v2+op ;
             st.push(t);
            }
        }
        System.out.println(st);

        
    }
}
