package LinkedList;

import LinkedList.Intersection_of_ll.ListNode;

public class DeleteMiddle {
    public ListNode deleteMiddle(ListNode head) {
         ListNode slow = head;
        ListNode fast = head ;

        if(head.next == null){   // single node 
            return null ;
          }
       
        while(fast.next.next != null && fast.next.next.next!=null ){
            slow= slow.next ;
            fast =  fast.next.next ;
        }
          
         slow.next = slow.next.next ;
          return head ;
    }
}
