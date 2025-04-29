public class OddEven_opt {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
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
        if (head == null || head.next == null) {
            return head; // No need to rearrange
        }

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even; // Save the head of even list

        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenHead; // connect odd list to even list
        return head;
    }

    public static void main(String[] args) {
        OddEven_opt a1 = new OddEven_opt();

        // Creating a linked list: 1 -> 9 -> 8 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(9);
        head.next.next = new ListNode(8);
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
