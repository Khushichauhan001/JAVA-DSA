package Trees;

// import java.util.List;

class BalancedBinary {
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

    public static boolean isBalanced(TreeNode root) {
        return check(root) !=  -1 ;
       }


    static int check(TreeNode root){
        if(root == null){
             return 0 ;
        }

        int lh = check(root.left);
        if(lh == -1) return -1 ;
        int rh = check(root.right);
        if(rh == -1) return -1 ;

        if(Math.abs(lh-rh) > 1) return -1 ;

        return 1+ Math.max(lh , rh);
    }

// 
    public static void main(String[] args) {
        BalancedBinary b1 = new BalancedBinary();
        TreeNode root =b1.new TreeNode(1);
         root.left = b1.new TreeNode();
         root.right = b1.new TreeNode(2);
         root.left.left =  b1.new TreeNode(5);
        root.right.left = b1.new TreeNode(3);
        root.right.left.left=b1.new TreeNode(9);

        System.out.println(isBalanced(root));

        //  List<Integer> result  = preorderTra(root);
  
        //  System.out.println("PreOrder Traversal: ");
        //  for(int val: result){
        //     System.out.println(val + " ");
        //  }
        //  System.out.println();
    }
}