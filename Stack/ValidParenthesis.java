package Stack;

import java.util.Stack;

public class ValidParenthesis {

    public static boolean isValid(String s){
        Stack<Character> st = new Stack<>();
        for (char ch : s.toCharArray()) {
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            }
            else{
                if(st.isEmpty()) return false ;

                char top = st.pop();
                if((top == '(' && ch != ')' )|| 
                   ( top =='{' && ch != '}') || 
                    (top == '[' && ch!= ']')) {
                        return false ;
                    }
            }
        }
        return st.isEmpty() ;
    }
    public static void main(String[] args) {
        String str = "[{()}]";
        boolean ans = isValid(str);
        System.out.println(ans);
    }
}
