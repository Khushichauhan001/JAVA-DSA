// Java program to find a pair with given sum target.
import java.util.ArrayList;

class Node {
    int data;
    Node next, prev;

    Node(int value) {
        data = value;
        next = prev = null;
    }
}

class findPairsWithGivenSum{

    // Function to find pairs in the doubly linked list
    // whose sum equals the given value target
    static ArrayList<ArrayList<Integer> >
    findPairsWithGivenSum(int target, Node head) {
        ArrayList<ArrayList<Integer> > res
            = new ArrayList<>();

        // Set two pointers, first to the beginning of DLL
        // and second to the end of DLL.
        Node first = head;
        Node second = head;

        // Move second to the end of the DLL
        while (second.next != null)
            second = second.next;

        // Iterate through the list using two pointers to
        // find pairs
        while (first != second && second.next != first) {

            // If the sum of the two nodes is equal to
            // target, add the pair
            if ((first.data + second.data) == target) {
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(first.data);
                pair.add(second.data);
                res.add(pair);

                // Move first in forward direction
                first = first.next;

                // Move second in backward direction
                second = second.prev;
            }
            else {
                if ((first.data + second.data) < target)
                    first = first.next;
                else
                    second = second.prev;
            }
        }

        return res;
    }

    public static void main(String[] args) {

        // Create a doubly linked list: 1 <-> 2 <-> 4 <-> 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.prev = head;
        head.next.next = new Node(4);
        head.next.next.prev = head.next;
        head.next.next.next = new Node(5);
        head.next.next.next.prev = head.next.next;

        int target = 7;
        ArrayList<ArrayList<Integer> > pairs
            = findPairsWithGivenSum(target, head);

        if (pairs.isEmpty()) {
            System.out.println("No pairs found.");
        }
        else {
            for (ArrayList<Integer> pair : pairs) {
                System.out.println(pair.get(0)
                                   + " " + pair.get(1));
            }
        }
    }
}