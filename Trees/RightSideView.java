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

public class RightSideView {
    static List<Integer> right(TreeNode node ){
        List<Integer> ans = new ArrayList<>();
        rightView(node, 0 , ans);
        return ans ;
    }
     static void rightView(TreeNode node , int level, List<Integer> ans){
    //    List<Integer> ans = new ArrayList<>();
        if(node == null){
            return ;
        }
 
        if(level == ans.size()){
            ans.add(node.data);
        }
        rightView(node.right, level+1, ans);
        rightView(node.left, level+1, ans);
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
        List<Integer> result = right(root);
        System.out.println(result);
     }
}
