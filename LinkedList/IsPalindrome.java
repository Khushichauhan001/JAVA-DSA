
// leetcode 234
public class IsPalindrome {

    // for solving error only 
    public static class ListNode {
        int val ;
        ListNode next ;
        ListNode(int val){
            this.val = val;
        }
    }


        public ListNode reverse(ListNode head){
            ListNode curr = head ;
            ListNode prev = null;
            ListNode Next = null;
            while(curr!= null){
                Next = curr.next ;
                curr.next =  prev ;
                prev = curr ;
                curr = Next;
            }
            return prev ;
        }

        

        public boolean isPalindromeee(ListNode head) {
             ListNode slow = head ;
             ListNode fast = head ;
             while(fast.next != null  && fast.next.next != null){
                slow = slow.next ;
                fast = fast.next.next ;
             }
             ListNode temp = reverse(slow.next);
             slow.next = temp ;
             ListNode p1 = head ;
             ListNode p2 = slow.next ;
             while(p2 != null){
                if(p1.val != p2.val) return false;
                p1 = p1.next ;
                p2 = p2.next ;
             }
             return true;
        }

        public static void main(String[] args) {
            IsPalindrome obj = new IsPalindrome();
    
            // Create linked list: 1 -> 2 -> 3 -> 2 -> 1
            ListNode head = new ListNode(1);
            head.next = new ListNode(2);
            head.next.next = new ListNode(3);
            head.next.next.next = new ListNode(2);
            head.next.next.next.next = new ListNode(1);
    
            // Check if it's palindrome
            boolean result = obj.isPalindromeee(head);
            System.out.println("Is Palindrome: " + result);
        }
    
}



//in doubly ll
// public class PalindromeDLL {

//     // Node of Doubly Linked List
//     static class Node {
//         int data;
//         Node next, prev;

//         Node(int data) {
//             this.data = data;
//         }
//     }

//     // Function to check if DLL is palindrome
//     public static boolean isPalindrome(Node head) {
//         if (head == null || head.next == null) return true;

//         // Step 1: Find tail
//         Node tail = head;
//         while (tail.next != null) {
//             tail = tail.next;
//         }

//         // Step 2: Two pointer approach
//         Node left = head;
//         Node right = tail;

//         while (left != right && right.next != left) {
//             if (left.data != right.data) return false;
//             left = left.next;
//             right = right.prev;
//         }

//         return true;
//     }

//     // Function to create and test DLL
//     public static void main(String[] args) {
//         // Create nodes
//         Node a = new Node(1);
//         Node b = new Node(2);
//         Node c = new Node(3);
//         Node d = new Node(2);
//         Node e = new Node(1);

//         // Connect them
//         a.next = b; b.prev = a;
//         b.next = c; c.prev = b;
//         c.next = d; d.prev = c;
//         d.next = e; e.prev = d;

//         System.out.println("Is Palindrome: " + isPalindrome(a));
//     }
// }
