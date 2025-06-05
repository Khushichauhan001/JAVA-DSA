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
// public class RootToPath {  // it just tell u ki path h ya nai

//     static List<Integer> rootToPath(TreeNode node, int target) {
//         List<Integer> path = new ArrayList<>();
//         findPath(node, target, path);
//         return path;
//     }
//     static boolean findPath(TreeNode node, int target, List<Integer> path) {
//         if (node == null) {
//             return false;
//         }

//         // Add the current node to the path
//         path.add(node.data);

//         // Check if the current node is the target
//         if (node.data == target) {
//             return true;
//         }

//         // Recur for left and right subtrees
//         if (findPath(node.left, target, path) || findPath(node.right, target, path)) {
//             return true;
//         }

//         // If not found in either subtree, remove the current node from the path
//         path.remove(path.size() - 1);
//         return false;
//     }
        
//     public static void main(String[] args) {
//         TreeNode root = new TreeNode(20);
//         root.left = new TreeNode(8);
//         root.right = new TreeNode(22);
//         root.left.left = new TreeNode(5);
//         root.left.right = new TreeNode(3);
//         root.right.right = new TreeNode(25);
//         root.left.right.left = new TreeNode(10);
//         root.left.right.right = new TreeNode(14);

//         // ✅ Call and print result
//         List<Integer> result = rootToPath(root, 10);
//         System.out.println(result);
//     }
// }



//gfg bala   // root to leaf tk ka path print krana h 
class RootToPath {
    public static ArrayList<ArrayList<Integer>> Paths(Node root) {
        ArrayList<ArrayList<Integer>> fAns = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        findPath(root, ans,fAns);
        return fAns ;
        // code here
        
    }
    static void findPath(Node root  , ArrayList<Integer> ans , ArrayList<ArrayList<Integer>> fAns){
        // ArrayList<Integer> ans= new ArrayList<>();
        if(root == null){
            return;
        }
        
        ans.add(root.data);
        if(root.left == null && root.right == null){
            fAns.add(new ArrayList<>(ans));
        }
        else {
        findPath(root.left, ans, fAns);
        findPath(root.right, ans, fAns);
        }
        ans.remove(ans.size()-1);
       
        
    
    }
    public static void main(String[] args) {
        Node root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(22);
        root.left.left = new Node(5);
        root.left.right = new Node(3);
        root.right.right = new Node(25);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);

        ArrayList<ArrayList<Integer>> res = Paths(root);
        System.out.println(res);

    }
}