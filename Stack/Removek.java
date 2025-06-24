package Stack;

import java.util.*;
public class Removek {
    public static String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();
        for(int i=0 ; i< num.length() ; i++){
            char c =num.charAt(i);
            while(!st.isEmpty() && k>0 && st.peek()>c){
                st.pop();
                k=k-1;
            }
            st.push(c);
        }

        // If k digits still left to remove, remove from end
        while(k>0 && !st.isEmpty()){
            st.pop();
            k=k-1;
        }

          // Build the number from stack   if no numb pop fr stack like [123456] so firstly pop last k elements then reverse the list ;
      StringBuilder sb = new StringBuilder();
      while(!st.isEmpty()){
        sb.append(st.pop());
      }
      sb.reverse();

      // Remove leading zeros
      while(sb.length()>0 && sb.charAt(0) == '0'){
        sb.deleteCharAt(0);
      }

      return sb.length() == 0 ? "0" : sb.toString();

    }
    public static void main(String[] args) {
        String num = "2484321";
        int k = 3 ;
        System.out.println(removeKdigits(num, k));
    }
}
