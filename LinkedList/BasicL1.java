package LinkedList;

public class BasicL1 {

    //by making function 
    public static void display(Node head){
         Node temp = head ;
         while(temp != null){
            System.out.print(temp.data+ " ");
            temp = temp.next;
         }
         System.out.println();
    }


    // by making recursion

    public static void displayr(Node head){
        if(head == null) return ;
        System.out.print(head.data+ " ");
        displayr(head.next);
        // System.out.println();
     }

     // for printing reverse order
     public static void displayreverse(Node head){
        if(head == null) return ;
        displayreverse(head.next);
        System.out.print(head.data+ " ");
     }

      public static int length(Node head){
        int count=0 ;
      while(head!= null){
        count++;
        head=head.next;
      }
      return count;
      }


    public static class Node {
      int data ;
      Node next ;  // agle bale ka adress contain kr rha h pura 
      Node(int data){ // constuctor 
          this.data = data ;
      }
    }

    public static void main(String[] args){
        Node a = new Node(5);
        // System.out.println(a.next);
        Node b = new Node(8);
        Node c = new Node(3);
        Node d = new Node(9);
        
        // now link the node to next node 
        
        a.next = b ;  // a ko link krdia b se 
        // System.out.println(a.next);   //LinkedList.BasicL1$Node@251a69d7
        // System.out.println(a.next.data);  // give data of b without using b
        b.next = c;
        c.next = d ;
        d.next = null ;

        // displaying a linkedlist 
            // Node temp = a ;
            // while(temp!= null){
            //     System.out.println(temp.data+ " ");
            //     temp= temp.next;
            // }



            // display by using function 
            display(a);
            displayr(a);
            displayreverse(a);
            
           int ans =  length(a);
            System.out.println(ans);
    }
}
