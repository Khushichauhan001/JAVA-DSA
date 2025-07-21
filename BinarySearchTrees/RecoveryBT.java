 package BinarySearchTrees;

 class RecoveryBT{
    private TreeNode first ;
    private TreeNode last ;
    private TreeNode middle ;
    private TreeNode prev ;

    private void inorder(TreeNode root){
        if(root == null) return ;
        inorder(root.left);

        // middle step of inorder 

         if(prev != null && (root.val<prev.val)){    // if htis is the first violation 
            if(first == null)
            {
                first = prev ;
                middle = root;
            }
            else{                   // if it is last violation 
                last = root;
            }
         }
         prev = root ;
         inorder(root.right);
    }
    public void recoverTree(TreeNode root) {
        first = middle = last = null ;
        prev = new TreeNode(Integer.MIN_VALUE);
        inorder(root);

        if(first!= null && last != null){       // if two violtion , swap first and last 
            int temp = first.val;
            first.val = last.val;
            last.val =  temp;
        }
        else {                     // if one violation , swap first and middle 
        int t= first.val;
        first.val = middle.val;
        middle.val = t;
        }
    }
 }