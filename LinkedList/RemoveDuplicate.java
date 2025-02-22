// leetcode 83
public class RemoveDuplicate {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { 
         this.val = val; 
       }
        ListNode(int val, ListNode next) { 
         this.val = val; 
         this.next = next;
        }
    }


    public ListNode deleteDuplicates(ListNode head){
        ListNode temp = head ;
        while(temp != null && temp.next != null){
            if(temp.next.val == temp.val){
                temp.next = temp.next.next ;
            }
            else {
                temp = temp.next ;
            }
            if(temp.next == null) return head ;
        }
        return head ;
    }
}

