package Trees;
import java.util.*;
class TreeNode{
    TreeNode node ;
    int data ;
    int level;
    TreeNode left ;
    TreeNode right;

    TreeNode(){};
    TreeNode(int data) { 
        this.data = data; 
    }
    TreeNode(int data, int level) { 
        this.data = data;
        this.level = level; 
    }
        TreeNode(int data, TreeNode left, TreeNode right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
}
public class RootToPath {

    static List<Integer> rootToPath(TreeNode node, int target) {
        List<Integer> path = new ArrayList<>();
        findPath(node, target, path);
        return path;
    }
    static boolean findPath(TreeNode node, int target, List<Integer> path) {
        if (node == null) {
            return false;
        }

        // Add the current node to the path
        path.add(node.data);

        // Check if the current node is the target
        if (node.data == target) {
            return true;
        }

        // Recur for left and right subtrees
        if (findPath(node.left, target, path) || findPath(node.right, target, path)) {
            return true;
        }

        // If not found in either subtree, remove the current node from the path
        path.remove(path.size() - 1);
        return false;
    }
        
    public static void main(String[] args) {
        TreeNode root = new TreeNode(20);
        root.left = new TreeNode(8);
        root.right = new TreeNode(22);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(3);
        root.right.right = new TreeNode(25);
        root.left.right.left = new TreeNode(10);
        root.left.right.right = new TreeNode(14);

        // ✅ Call and print result
        List<Integer> result = rootToPath(root, 10);
        System.out.println(result);
    }
}
