package Trees;

                         
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = null;
        right = null;
    }
}

class ZigZagTraversal {
    public List<List<Integer>> ZigZagLevelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
            return result;
        }
        Queue<Node> nodesQueue = new LinkedList<>();
        nodesQueue.add(root);

        boolean leftToRight = true;

        while (!nodesQueue.isEmpty()) {
            int size = nodesQueue.size();

        
            List<Integer> row = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                Node node = nodesQueue.poll();
                int index = leftToRight ? i : (size - 1 - i);

                row.add(index, node.data);

                if (node.left != null) {
                    nodesQueue.add(node.left);
                }
                if (node.right != null) {
                    nodesQueue.add(node.right);
                }
            }

            leftToRight = !leftToRight;

            result.add(row);
        }

        return result;
    }
}

// Helper function to print the result
class Main {
    static void printResult(List<List<Integer>> result) {
        for (List<Integer> row : result) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Creating a sample binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        ZigZagTraversal solution = new ZigZagTraversal();

        List<List<Integer>> result = solution.ZigZagLevelOrder(root);

        printResult(result);
    }
}
          