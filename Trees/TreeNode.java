package Trees;
public class TreeNode {
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
   class Solution {
       public boolean isBalanced(TreeNode root) {
           if(root == null){
              return false ;
           }
                lh = isBalanced(root.left);
                 rh = isBalanced(root.right);
   
                 return max(lh , rh) +1 ;
       }
   }