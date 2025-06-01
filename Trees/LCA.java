package Trees;


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

public class LCA {
     
    public static TreeNode findLCA(TreeNode root, int n1, int n2) {
        if (root == null) {
            return null;
        }

        // If either n1 or n2 matches with root's data, return root
        if (root.data == n1 || root.data == n2) {
            return root;
        }

        // Recur for left and right subtrees
        TreeNode left = findLCA(root.left, n1, n2);
        TreeNode right = findLCA(root.right, n1, n2);

        if(left == null){
            return right ;
        }

        else if(right == null){
            return left ;
        }
        else {
            return root ;
        }
     
    }
    
    public static void main(String[] args) {
        TreeNode root = new TreeNode();
        root.left = new TreeNode(5);
    root.right = new TreeNode(1);
    root.left.left = new TreeNode(6);
    root.left.right = new TreeNode(2);
    root.right.left = new TreeNode(0);
    root.right.right = new TreeNode(8);
    root.left.right.left = new TreeNode(7);
    root.left.right.right = new TreeNode(4);

    System.out.println("Lowest Common Ancestor of 7 and 4: " + findLCA(root, 7, 4).data);
    }
}
