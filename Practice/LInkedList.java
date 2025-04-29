package Practice;
import java.util.Objects;

public class LInkedList {
    public static class Node{
        int data ;
        Node next ;
        Node(int data ){
            this.data = data ;
            this.next = null ;
        }
    }

        public static void display(Node head){
            Node temp = head;
            if(temp!= null){
                System.out.print(temp.data);

                display(head.next);
            }
           
        }
    

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(6);
        Node c = new Node(8);
        Node d = new Node(2);
        
        a.next = b ;
        b.next = c;
        c.next =d ;
        d.next = null ;

        display(a);

    }
}