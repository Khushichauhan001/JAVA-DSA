package Trees;
import java.util.*;

class Node {
    char data;
    Node left, right;

    Node(char data) {
        this.data = data;
        left = right = null;
    }
}

public class BSTPreorder {
    
    // Function to insert a node into the BST
    static Node insert(Node root, char data) {
        if (root == null) {
            return new Node(data);
        }
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }
        return root;
    }

    // Function to perform preorder traversal
    static void preorder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter number of elements (N): ");
        int N = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.println("Enter elements separated by spaces (like A B C D):");
        String[] elements = sc.nextLine().split(" ");

        Node root = null;

        // Build the BST
        for (int i = 0; i < N; i++) {
            char data = elements[i].charAt(0);
            root = insert(root, data);
        }

        // Print preorder traversal
        System.out.println("\nPreorder Traversal of BST:");
        preorder(root);

        sc.close();
    }
}

