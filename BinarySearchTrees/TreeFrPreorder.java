package BinarySearchTrees;

public class TreeFrPreorder {
        public TreeNode bstFromPreorder(int[] preorder) {
                return btsFromPreorder(preorder, Integer.MAX_VALUE , new int[]{0});
        }
        public TreeNode btsFromPreorder(int[] preorder, int bound , int[] i){
            if(i[0] == preorder.length || preorder[i[0]] > bound) return null ;
            TreeNode root = new TreeNode(preorder[i[0]++]);
            root.left = btsFromPreorder(preorder, root.val , i);
            root.right = btsFromPreorder(preorder, bound , i);
            return root ;
        }
}
