package LinkedList;

import LinkedList.Implementation.linkedlist;

public class NthNodeFrEnd {
    public static Node nthNode(Node head , int n){
        int size = 0;
        Node temp = head;
        while(temp!= null){
            size++;
            temp = temp.next;
        }
        int m = size - n + 1 ;
        //mth node fr end   mtlb agr 5th node chahie toh 4 br loop chlaynge hum 
        temp = head ; // qki temp hmara null tkk chla gya tha 
        for(int i=0 ; i< m-1 ; i++){
          temp = temp.next;
        }  
        return temp ;
 }

 // second method (isme hum ek hi traversal se kr skte h )
    public static Node nthNode2(Node head , int n){
     Node slow = head ;
     Node fast = head ;
     for(int i=1 ; i<= n;i++){
        fast = fast.next ;
     }
     while(fast!= null){
        slow = slow.next ;
        fast = fast.next ;
     }
     return slow ;

     }

     public static Node deleteNthFrEnd(Node head , int n ){
        Node slow = head ;
        Node fast = head ;
        for(int i=1 ; i<= n ; i++){
          fast = fast.next;
        }
        if(fast == null){   // it will become the cond ohat ki size = n and aapko 0th ind vali value delete krni h 
            head = head.next;
            return head ;
        }
        while (fast.next!= null) {
            slow = slow.next ;
            fast = fast.next ;
        }
        slow.next= slow.next.next ;
        return head ;
     }

     public static void display(Node head){
          Node temp = head ;
          while(temp!= null){
            System.out.print(temp.data+ " ");
            temp = temp.next ;
          }
          System.out.println();
     }

    public static class Node{
        int data ;
        Node next ;
        Node(int data){
            this.data = data ;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(8);
        Node c = new Node(3);
        Node d = new Node(9);
        Node e = new Node(6);
        
        // now link the node to next node 
        
        a.next = b ;  // a ko link krdia b se 
        b.next = c;
        c.next = d ;
        d.next = e ;
        e.next= null ;
  
        // 5 8 3 9 6 
        // Node ans = nthNode2(a , 2);  
        // System.out.println(ans.data);

        display(a);
        a = deleteNthFrEnd(a, 5);
        display(a);

         
    }
}
