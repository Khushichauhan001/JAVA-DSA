//leetcode 155 
package Stack;

import java.util.Stack;
public class MinStack {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> min = new Stack<>();

    public MinStack() {
        //constructor 
    }
    
    public void push(int val) {
        if(st.size()== 0){
            st.push(val);
            min.push(val);
        }
        else {
            st.push(val);
            if(min.peek() > val ) min.push(val);
            else {
                min.push(min.peek());
            }
        }
    }
    
    public void pop() {
        st.pop(); 
        min.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}
