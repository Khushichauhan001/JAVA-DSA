// Java program to delete all occurrences of a given key 
// in a linked list
class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
}

// Given the head of a list, delete all occurrences of a 
// given key and return the new head of the list
public class DeleteAllOccOfAGivenLL {

    static Node deleteOccurrences(Node head, int key) {
        
        // Initialize pointers to traverse the linked list
        Node curr = head, prev = null;

        // Traverse the list to delete all occurrences
        while (curr != null) {

            // If current node's data is equal to key
            if (curr.data == key) {

                // If node to be deleted is head node
                if (prev == null) {
                    head = curr.next;
                } 
              
                else {
                    prev.next = curr.next;
                }

                // Move to the next node
                curr = curr.next;

            } 
          
             else {
               
                // Move pointers one position ahead
                prev = curr;
                curr = curr.next;
            }
        }

        return head;
    }

    // This function prints the contents of the linked list 
    // starting from the head
    static void printList(Node curr) {
        while (curr != null) {
            System.out.print(" " + curr.data);
            curr = curr.next;
        }
    }

    public static void main(String[] args) {

        // Create a hard-coded linked list:
        // 2 -> 2 -> 1 -> 8 -> 2 -> NULL
        Node head = new Node(2);
        head.next = new Node(2);
        head.next.next = new Node(1);
        head.next.next.next = new Node(8);
        head.next.next.next.next = new Node(2);

        int key = 2;

        head = deleteOccurrences(head, key);
        printList(head);
    }
}

// tc:0(N)
// sc 0(1)