package Stack;

import java.util.Stack;
public class ArrayImplement {

        public static class Stack{
         int[] arr = new int[4];
         private int idx = 0 ;     ///vvvvimp 
         void push(int x){
            if(isFull()){
                System.out.println("Stack is full");
                return;
            }
            arr[idx] = x;
            idx++;
         }

         int peek(){
            if(idx == 0) {
                System.out.println("Stack is empty");
                return -1 ;
            }else {

                return arr[idx-1];
            }
         }
         int pop(){
            if(idx == 0){
            System.out.println("stack is empty");
            return -1 ;
         }
         else {
            int top = arr[idx-1];
            arr[idx-1] = 0 ;
            idx --;
            return top;
         }
        }

         void display(){
            for(int i=0 ;i<=idx-1; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
         }

         int size(){
         
            return idx ;
         }

         boolean isEmpty(){
            if(idx == 0){
                return true ;
            }
            else {
                return false;
            }
         }

         boolean isFull(){
            if(idx == arr.length){
                return true ;
            }
            else {
                return false;
            }
         }
          
         int capacity(){
            return arr.length;
         }
    }
    public static void main(String[] args) {
        
        Stack st = new Stack();
        st.push(4);
        st.push(3);
        st.push(5);     //435
        st.display();
        System.out.println(st.size());// 3
        st.pop();
        st.display();  //43
        System.out.println(st.size()); // 2
        st.push(1);
        st.push(9);
        System.out.println(st.isFull());
        System.out.println(st.capacity());
    }

}
