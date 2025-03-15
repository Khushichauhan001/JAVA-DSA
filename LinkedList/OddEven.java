package LinkedList;
// leetcode 328 
public class OddEven {
        

    public static class ListNode {
        int val ;
        ListNode next ;
        ListNode(int val){
            this.val = val;
        }
    }

   // display function 
    public static void display(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    

        public ListNode oddEvenList(ListNode head) {
            ListNode odd = new ListNode(0);
            ListNode even = new ListNode(0);
             
             ListNode tempo = odd;
             ListNode tempe = even;
             ListNode temp = head ;
    
            while(temp!= null){
                tempo.next = temp;
                temp= temp.next ;
                tempo = tempo.next ;
    
                tempe.next = temp;
                if(temp == null) break ;
                temp = temp.next;
                tempe= tempe.next ;
            }
            odd = odd.next ;
            even = even.next ;
            tempo.next = even ;
            return odd ;
        }

        public static void main(String[] args) {
            OddEven a1 = new OddEven();
    
            // Creating a linked list: 1 -> 2 -> 3 -> 4 -> 5
            ListNode head = new ListNode(1);
            head.next = new ListNode(2);
            head.next.next = new ListNode(3);
            head.next.next.next = new ListNode(4);
            head.next.next.next.next = new ListNode(5);
    
            System.out.println("Original Linked List:");
            display(head);
    
            // Apply odd-even transformation
            head = a1.oddEvenList(head);
    
            System.out.println("Modified Linked List:");
            display(head);
        }
            

}
