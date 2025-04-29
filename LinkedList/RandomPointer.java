class RandomPointer {

    static class Node {
        int val;
        Node next;
        Node random;

        Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public Node copyRandomList(Node head) {
        if (head == null) return null;

        Node curr = head;

        // Step 1: Insert copied nodes after original nodes
        while (curr != null) {
            Node newNode = new Node(curr.val);
            newNode.next = curr.next;
            curr.next = newNode;
            curr = newNode.next;
        }

        // Step 2: Assign random pointers
        curr = head;
        while (curr != null) {
            if (curr.random != null) {
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }

        // Step 3: Separate the two lists
        curr = head;
        Node dummy = new Node(0);
        Node copy = dummy;

        while (curr != null) {
            copy.next = curr.next;
            curr.next = curr.next.next;
            copy = copy.next;
            curr = curr.next;
        }

        return dummy.next;
    }

    // Helper to print list for testing
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            int randomVal = (temp.random != null) ? temp.random.val : -1;
            System.out.println("Node value: " + temp.val + ", Random points to: " + randomVal);
            temp = temp.next;
        }
    }

    // Main function to test
    public static void main(String[] args) {
        RandomPointer solution = new RandomPointer();

        // Create nodes
        Node node1 = new Node(7);
        Node node2 = new Node(13);
        Node node3 = new Node(11);
        Node node4 = new Node(10);
        Node node5 = new Node(1);

        // Connect next pointers
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        // Connect random pointers
        node1.random = null;
        node2.random = node1;
        node3.random = node5;
        node4.random = node3;
        node5.random = node1;

        System.out.println("Original list:");
        printList(node1);

        Node copiedHead = solution.copyRandomList(node1);

        System.out.println("\nCopied list:");
        printList(copiedHead);
    }
}
