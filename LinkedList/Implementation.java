

import java.util.LinkedList;

public class Implementation {
    public static  class Node{  // ye toh node class bnani hi pdegi 
        int data ;
        Node next ;
        Node(int data){
            this.data = data ;
            this.next = null ;
        }
    }
    public static class linkedlist{   // we need three things : head , null , tail
        Node head = null;
         Node tail = null ;
          void insertAtEnd(int val){
            Node temp = new Node(val); // phle node bnao new ...then check ki empty list toh ni h 
            if(head == null ){
              head = temp ;
            }
            else {
                tail.next =  temp ;
            }
            tail = temp ;
           
        }

        void insertAtStart(int val){
            Node temp = new Node(val);
            if(head == null){
                head = temp ;
                tail = temp ;
               
            }
            else {
                temp.next = head ;
                head = temp;
            }
           
        }

        void insertAt(int ind , int val){
            Node t = new Node(val);
            Node temp = head ;

            if(ind == size()){
                insertAtEnd(val);
                return ;
            }
            else if(ind == 0 ){
                insertAtStart(val);
                return ; 
            }
            else if(ind < 0 || ind > size()){
              System.out.println("wrong index");
              return ;
            }
           
            for(int i=0 ; i< ind-1 ; i++){   // vv imp (traverse less than 1 index)
               temp = temp.next ;
            }
            if(head == null){
                head = tail = t ;
            }
            else {
                t.next = temp.next ;
                temp.next = t;

            }
        }

        void deleteAt(int ind){
            if(ind == 0) {           
                head= head.next;
                // size--;
                return ;
            }
            Node temp = head;
            for(int i=0 ; i< ind -1 ; i++){
                temp = temp.next ;
            }
            temp.next = temp.next.next;
            tail= temp;
            return ;
            // size -- ;
        }


        int getAt(int ind){
            Node temp = head ;
            for(int i=0 ; i<= ind-1 ; i++){
                temp = temp.next;
            }
            return temp.data;

        }

        void display(){
             Node temp = head;
            while(temp!= null){
                System.out.print(temp.data + " ");
                temp = temp.next ;
            }
            System.out.println();
          }

          int size(){    // o(n)
            Node temp = head;
            int count = 0 ;
            while(temp!= null){
               count++;
                temp = temp.next ;
            }
            return count ;
          }

    }

    public static void main(String[] args) {
        linkedlist l1 = new linkedlist();
        l1.insertAtEnd(3);   // 3
        l1.insertAtEnd(4);   // 3  4 
        l1.insertAtEnd(5);
        l1.insertAtEnd(9); // 3 4 5 9 
        l1.display();

        System.out.println(l1.size());

        l1.insertAtStart(8);  // 8 3 4 5 9
        l1.display();

        // l1.insertAt(2, 7);   // 8 3 7 4 5 9 
        // l1.display();

        l1.insertAt(5, 16);
        l1.display();   // it will insert at end // 8 3 4 5 9 16

        // but isme tail end tk kbhi pahuch hi ni paygi 
        System.out.println(l1.tail.data);  //  9 .. until it run insertAtEnd func see line 47 if cond

        l1.insertAt(0, 20); 
        l1.display();    // 20 8 3 4 5 9 16 (ye aana chahie ) lkn (8 20 3 4 5 9 16 ) aarha h 
                         // until we apply if con 


        // i want ki get krne p value mil jaye 
        
        System.out.println(l1.getAt(3));  //4

        l1.deleteAt(3);
        l1.display();

       


    }

}
