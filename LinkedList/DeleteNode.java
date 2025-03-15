// leetcode 237(medium level)
// no head is given in prblm just the node which is going to delete is given 

public class DeleteNode {
    public class ListNode {
             int val;
             ListNode next;
             ListNode(int x) { val = x; }
         }
    public void deleteNode(ListNode node) {
        node.val = node.next.val ;
        node.next = node.next.next ;
        return  ;
    }
}
