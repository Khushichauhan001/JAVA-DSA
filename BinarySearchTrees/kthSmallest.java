package BinarySearchTrees;

import java.util.ArrayList;
import java.util.List;


//brute force   tc:0(n)    sc: 0(n)
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

public class kthSmallest {
    public static int kthSmall(TreeNode root, int k) {
       List<Integer> arr = new ArrayList<>();
       inorder(root , arr);
      return arr.get(k-1);
    }
    private static void inorder(TreeNode root , List<Integer> arr){
      if(root == null){
            return ;
        }
        inorder(root.left ,arr);
       arr.add(root.val);
        inorder(root.right , arr);
    }

    // public static void main(String[] args) {
        
    // }
}








//better  tc:0(h+k)   sc:0(h) 
class Solution {
    private int count = 0;
    private int result = -1;

    public int kthSmallest(TreeNode root, int k) {
        inorder(root, k);
        return result;
    }

    private void inorder(TreeNode node, int k) {
        if (node == null) return;

        inorder(node.left, k);

        count++;
        if (count == k) {
            result = node.val;
            return;
        }

        inorder(node.right, k);
    }
}




//optimal


