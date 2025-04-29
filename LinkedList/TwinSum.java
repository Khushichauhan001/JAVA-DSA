// package LinkedList;
// leetcode 2130
public class TwinSum {

    public static class ListNode {
        int val ;
        ListNode next ;
        ListNode(int val){
            this.val = val;
        }
    }

     public ListNode reverse(ListNode head ){
            ListNode curr = head ;
            ListNode prev = null ;
            ListNode Next  =null ;
            while(curr != null){
                Next = curr.next ;
                curr.next = prev ;
                prev = curr ;
                curr = Next ;
            }
            return prev ;
        }
        public int pairSum(ListNode head) {
            ListNode slow = head ;
            ListNode fast = head;
            while( fast.next!=null && fast.next.next!= null){
                slow = slow.next;
                fast = fast.next.next ;
    
            }
            slow.next = reverse(slow.next);
            int maxSum = 0 ;
            ListNode head1 = head ;
            ListNode head2 = slow.next ;
            while(head2 != null){
                 maxSum = Math.max(maxSum, head1.val + head2.val);
                    head1 = head1.next ;
                    head2 = head2.next ;
                }
            
                return maxSum ;
            
        }

        public static void main(String[] args) {
            TwinSum t1 = new TwinSum();
            ListNode head = new ListNode(1);
            head.next = new ListNode(10);
            head.next.next = new ListNode(13);
            head.next.next.next = new ListNode(2);
            // head.next.next.next.next =new ListNode(7); 

            int  result = t1.pairSum(head);
            System.out.println(result);
        }
    
}
