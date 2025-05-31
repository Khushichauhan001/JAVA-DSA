package Trees;

class Diameter {
    public static class TreeNode {
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

    static int maxDiameter = 0;

    public static int findHeight(TreeNode root) {
        if (root == null) return 0;

        int lh = findHeight(root.left);
        int rh = findHeight(root.right);

        maxDiameter = Math.max(maxDiameter, lh + rh); // update diameter

        return 1 + Math.max(lh, rh);
    }

    public static int diameterOfBinary(TreeNode root) {
        maxDiameter = 0; // reset before computing
        findHeight(root);
        return maxDiameter;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(5);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        root.right.left.left = new TreeNode(9);

        int diameter = diameterOfBinary(root);
        System.out.println("Diameter of the binary tree: " + diameter);
    }
}







//  optimal sol

// class Solution {
//     public int diameterOfBinaryTree(TreeNode root) {
//          int[] diameter = new int[1];
//          height(root , diameter);
//           return diameter[0];
//     }
//     private int height(TreeNode root , int[] diameter){
//         if(root == null){
//             return 0;
//         }
//         int lh = height(root.left , diameter);
//         int rh = height(root.right , diameter);

//         diameter[0] = Math.max(diameter[0] , lh+rh);
//         return 1+Math.max(lh , rh );
//     }
// }