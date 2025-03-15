// package LinkedList 

public class SinglyLL {
    public static class Node {
        int val ;
        Node next ;// null
        Node prev; // null  
        Node(int val){
            this.val = val ;
        }
    }

    public static void display(Node head){
        Node temp  = head ;
        while(temp != null){
            System.out.print(temp.val+ " ");
            temp=temp.next ;
        }
        System.out.println();
    }

    public static void display2(Node tail){
        Node temp  = tail ;
        while(temp != null){
            System.out.print(temp.val+ " ");
            temp=temp.prev ;
        }
        System.out.println();
    }


    public static void display3(Node random){
        Node temp  = random  ;
        while(temp.prev != null){
            temp=temp.prev ;
        }
       //print the list 
       while(temp != null){
        System.out.print(temp.val+ " ");
        temp=temp.next ;
      }
       System.out.println();
    }

    public static Node insert_at_head(Node head , int x){
     Node t = new Node(x);
     t.next = head ;
     head.prev = t ;
     head = t ;
     return head ;
    }
    public static void main(String[] args) {
        // 4 10 2 99 13 
        Node a = new Node(4);
        Node b = new Node(10);
        Node c = new Node(2);
        Node d = new Node(99);
        Node e = new Node(13);
       
         a.next = b;       // by default a toh connected h null se bhi or aage se kr hi dia h ab 
         b.prev = a;
         b.next = c;
         c.prev= b;
         c.next = d ;
         d.prev= c ; 
         d.next = e ;
         e.prev = d ;
          e.next = null ;

//   display(a);
  display3(c);   //bech ka random node h lknfir bhi puri list  ko print kr rha h head pr jakr ....     
  Node newnode = insert_at_head(a, 111);
  display(newnode);
    }
}
