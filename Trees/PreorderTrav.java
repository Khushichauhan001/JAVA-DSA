package Trees;

import java.util.ArrayList;
import java.util.List;

 class TreeNode{
    int data ;
    TreeNode left ;
    TreeNode right ;
    TreeNode(){};
    TreeNode(int data){
        this.data = data ;
    }
    TreeNode(int data ,TreeNode left){
        this.data = data ;
        this.left = left;
    }
    TreeNode (int data , TreeNode left ,TreeNode right){
        this.data = data ;
        this.left = left;
        this.right = right ;
    }

}
public class PreorderTrav {

    //PRE ORDER TRAVERSAL
    
    static void preOrder(TreeNode root, List<Integer> l1){
        if(root == null){
            return ;
        }
        l1.add(root.data);
        preOrder(root.left, l1);
        preOrder(root.right, l1);
    }

    static List<Integer> preorderTra(TreeNode root){
        List<Integer> l1 = new ArrayList<>();

        preOrder(root, l1);

        return l1 ;
    }




      // INORDER TRAVERSAL

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> l1 = new ArrayList<>();
        inorder(root, l1);
        return l1 ;
     }
     static void inorder(TreeNode root , List<Integer> l1){
         if(root == null){
             return ;
         }
 
         inorder(root.left, l1);
         l1.add(root.data);
         inorder(root.right , l1);
 
     }


  
      // POST ORDER TRAVERSAL

     public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> l1 = new ArrayList<>();
        postOrder(root , l1);
        return l1 ;
    }

    static void postOrder(TreeNode root , List<Integer> l1){
        if(root == null){
            return ;
        }

        postOrder(root.left , l1);
        postOrder(root.right , l1);
        l1.add(root.data);
    }




    public static void main(String[] args) {
        TreeNode root =new TreeNode(1);
         root.left = new TreeNode();
         root.right = new TreeNode(2);
        //  root.left.right = new TreeNode(4);
        //  root.left.left =  new TreeNode(5);
        root.right.left = new TreeNode(3);

         List<Integer> result  = preorderTra(root);
  
         System.out.println("PreOrder Traversal: ");
         for(int val: result){
            System.out.println(val + " ");
         }
         System.out.println();
    }
}
