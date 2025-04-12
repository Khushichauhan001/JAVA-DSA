package Stack;

import java.util.Stack;

public class LLimplementation {
    public static class Node {   // user defined datatype
     int val ;
     Node next ;
     Node(int val){
        this.val= val;
     }
    }
    
    public static class LLStack{     // userdefined data structure 
        private Node head = null;
        private int size = 0 ;

        void push(int x){
            Node temp = new Node(x);
            temp.next = head ;
            head = temp ;
            size++;
            return;
        }

        int pop(){
            if(head == null){
                System.out.println("stack empty");
                return -1;
            }
            int x = head.val ;   // iski value bch ake rkho to display 
        head = head.next ;
        return x ;
        }

        int peek(){
        if(head == null){
                System.out.println("stack empty");
                return -1;
            }
              
            return head.val;
        }

        void displayrecursion(Node h){
            if(h == null) return ;
            displayrecursion(h.next);
            System.out.print(h.val+ " ");
        }


        void display(){
           displayrecursion(head);
           System.out.println();
        }


        void displayRev(){
            Node temp =  head ;
            while(temp!= null){
                System.out.print(temp.val+ " ");
                temp =temp.next ;
            }
            System.out.println();
        }

        int size(){   // getter 
          return size ;
        }

        boolean isEmpty(){
            if(head == null) return true ;
            else return false ;
        }
    }

    public static void main(String[] args) {
        LLStack st = new LLStack();
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
    }
}
