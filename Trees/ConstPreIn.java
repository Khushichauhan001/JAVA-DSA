package Trees;

import java.util.HashMap;
import java.util.Map;

// Construct Binary Tree from Preorder and Inorder Traversal
public class ConstPreIn {
     public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer,Integer> h1 = new HashMap<>();

        for(int i=0 ; i<inorder.length ;i++){
            h1.put(inorder[i], i);
        }

        TreeNode root = buildT(preorder , 0 , preorder.length -1 , inorder , 0 ,inorder.length -1 , h1);
        return root ;
    }

    private TreeNode buildT(int[] preorder , int pstart , int pend , int[] inorder , int istart , int iend , Map<Integer,Integer> h1){

        if(preorder.length == 0  && inorder.length == 0) return null ;
        if(pstart>pend || istart > iend) return null ;

        TreeNode root =  new TreeNode(preorder[pstart]);
        int  inRoot = h1.get(root.val);
        int numsLeft = inRoot - istart ;

        root.left = buildT(preorder ,pstart+1, pstart+numsLeft , inorder , istart , inRoot-1 , h1);
        root.right = buildT(preorder , pstart+numsLeft+1 , pend , inorder , inRoot+1, iend , h1);

        return root ;
    }
}
