import java.util.LinkedList;
public class InsertStart {
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
     void display(){
        Node temp = head;
       while(temp!= null){
           System.out.print(temp.data + " ");
           temp = temp.next ;
       }
       System.out.println();
     }
    }

    public static void main(String[] args) {
        
        Node a = new Node(5);
        // System.out.println(a.next);
        Node b = new Node(8);
        Node c = new Node(3);
        Node d = new Node(9);

        a.next = b ;
        b.next = c;
        c.next = d ;
        d.next = null ;

        
    }
}
