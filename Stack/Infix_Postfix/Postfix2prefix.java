package Stack.Infix_Postfix;

import java.util.Stack;

public class Postfix2prefix {
    public static void main(String[] args) {
        String str = "953+4*6/-";
        Stack<String> st = new Stack<>();
        for(int i=0 ; i<str.length();i++){
            Character ch = str.charAt(i);
            int ascii = (int)ch ;
            if(ascii >= 48 && ascii <=58){
                int x = ascii - 48 ;
                String s = " " + x ;
                st.push(s);
            }
            else if( ch == '+' || ch == '-' || ch == '*' || ch== '/'){
                String v2 = st.pop();
                String v1 = st.pop();
                String op = " "+ ch ;
                String t = op+v1+v2;
                st.push(t);
            }

        }
        System.out.println(st);


    }
}
