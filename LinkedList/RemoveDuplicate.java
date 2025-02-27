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
    public static void main(String[] args) {
        RemoveDuplicate obj = new RemoveDuplicate();
        
        // Creating a sorted linked list: 1 -> 1 -> 2 -> 3 -> 3
        ListNode head = obj.new ListNode(1);
        head.next = obj.new ListNode(1);
        head.next.next = obj.new ListNode(1);
        head.next.next.next = obj.new ListNode(3);
        head.next.next.next.next = obj.new ListNode(4);
        head.next.next.next.next.next = obj.new ListNode(4);
        head.next.next.next.next.next.next = obj.new ListNode(5);

        ListNode newHead = obj.deleteDuplicates(head);

        // Printing the modified list
        while (newHead != null) {
            System.out.print(newHead.val + " ");
            newHead = newHead.next;
        }
    }
}

