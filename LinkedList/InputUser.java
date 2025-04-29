import java.util.*;

public class InputUser {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // Method to print the linked list
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements in linked list: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Linked list is empty.");
            return;
        }

        System.out.print("Enter value 1: ");
        int val = sc.nextInt();
        ListNode head = new ListNode(val);
        ListNode current = head;

        for (int i = 2; i <= n; i++) {
            System.out.print("Enter value " + i + ": ");
            val = sc.nextInt();
            current.next = new ListNode(val);
            current = current.next;
        }

        System.out.println("\nLinked list created:");
        printList(head);
    }
}