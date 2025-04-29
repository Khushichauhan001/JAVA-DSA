
// reverse the linked list using recursion    ... Space com : O(n)
public class ReverseList {
    public static class Node {
        int val ;
        Node next ;
        Node(int val){
            this.val = val;
        }
    }

    public static void display(Node head ){
        if(head == null) return ;
        System.out.print(head.val+ " ");
        display(head.next);
    }

    public static void displayr(Node head){
        if(head == null) return ;   // base case
        display(head.next);         // call
        System.out.print(head.val+ " ");   // work 
        System.out.println();
    }

    public static Node reverse(Node head){
        if(head.next == null){
            return head ;
        }
       Node newHead = reverse(head.next); //mtlb m reverse kr rha hu head ke aage ki sari chize
        head.next.next = head;//work (interchnging conection )
        head.next = null;
        return newHead ;
    }
    public static void main(String[] args) {
        Node a = new Node(3);
        // System.out.println(a.next);
        Node b = new Node(5);
        Node c = new Node(1);
        Node d = new Node(2);
        
        // now link the node to next node 
        
        a.next = b ; 
        b.next = c;
        c.next = d ;
        d.next = null ;

        display(a);
        // displayr(a);
         a = reverse(a);
        display(a);
    }
}





// reverse ll without using recurion (but using pointers)... Space Complexity O(1)
// leetcode 206
// class Solution {
//     public ListNode reverseList(ListNode head) {
//        ListNode curr = head ;
//        ListNode prev = null ;
//        ListNode Next = null ;
    
//        while(curr!= null){
//             Next = curr.next ;
//             curr.next = prev ;
//             prev = curr ;
//             curr = Next;
//        }
//        return prev ;
//     }
// }


// public class ReverseList {
//     public static class Node {
//         int val;
//         Node next;
//         Node(int val) {
//             this.val = val;
//         }
//     }

//     public static void display(Node head) {
//         Node temp = head;
//         while (temp != null) {
//             System.out.print(temp.val + " ");
//             temp = temp.next;
//         }
//         System.out.println();
//     }

//     public static Node reverse(Node head) {
//         Node prev = null;
//         Node curr = head;
//         Node next = null;
        
//         while (curr != null) {
//             next = curr.next;  // save next node
//             curr.next = prev;  // reverse the link
//             prev = curr;       // move prev one step ahead
//             curr = next;       // move curr one step ahead
//         }
        
//         return prev; // prev will be new head
//     }

//     public static void main(String[] args) {
//         Node a = new Node(3);
//         Node b = new Node(5);
//         Node c = new Node(1);
//         Node d = new Node(2);

//         // linking the nodes
//         a.next = b;
//         b.next = c;
//         c.next = d;
//         d.next = null;

//         System.out.println("Original List:");
//         display(a);

//         Node newHead = reverse(a);
//         System.out.println("Reversed List:");
//         display(newHead);
//     }
// }

