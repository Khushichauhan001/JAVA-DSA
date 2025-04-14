package Stack;

import java.util.Stack;

public class StockSpanPrblm {
    public static void main(String[] args) {
        int[] arr = { 100, 80 , 60 , 70 , 60 , 75 , 85};
        int n = arr.length;
          int[] res = new int[n];
          Stack<Integer> st = new Stack<>();
        for(int i=0; i< n ;i++){
        //   res[i] = 1;
        while(!st.isEmpty() && arr[st.peek()] <= arr[i]){
            st.pop();
        }
        if(st.isEmpty()){
            res[i] = i+1 ;   // index hi dalega bas  1 
        }
        else {
            res[i] = i-st.peek();
        }
        st.push(i);
        }
         for(int val: res){
            System.out.print(val + " ");
         }
    }
}
