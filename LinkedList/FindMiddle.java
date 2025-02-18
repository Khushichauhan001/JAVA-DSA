package LinkedList;

import LinkedList.Intersection_of_ll.ListNode;

public class FindMiddle {

    public ListNode middleNode(ListNode head) {
        ListNode slow = head ;
        ListNode fast = head ;
        while(fast!=null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow ;
    }
}

