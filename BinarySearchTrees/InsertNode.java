package BinarySearchTrees;

class TreeNode {
       int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
     }
public class InsertNode {
    public static TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null)
            return new TreeNode(val);
        
        if (val < root.val)
            root.left = insertIntoBST(root.left, val);
        else
            root.right = insertIntoBST(root.right, val);
        
        return root;
    }

    public static void printInOrder(TreeNode root) {
        if (root == null) return;
    
        printInOrder(root.left);
        System.out.print(root.val + " ");
        printInOrder(root.right);
    }
    
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(14);
        root.right.right = new TreeNode(8);
        int val = 5 ;

        // System.out.println(insertIntoBST(root, val));
        // for (int i = 0; i < 16; i++) {
        //     System.out.println(insertIntoBST(root, val));
        // }

        insertIntoBST(root, val);
        printInOrder(root);


    }
}
