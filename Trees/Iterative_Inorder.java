package Trees;
import java.util.*;

class Iterative_Inorder {
    // Return a list containing the inorder traversal of the given tree
    ArrayList<Integer> inOrder(Node root) {
        // Code
        ArrayList<Integer> ans = new ArrayList<>();
       Stack<Node> st = new Stack<>();
       Node curr = root;
       while(curr != null ||  !st.isEmpty()){
           while(curr != null){
               st.push(curr);
               curr = curr.left;
           }
           curr = st.pop();
           ans.add(curr.data);
           
           curr = curr.right;
       }    
       return ans ;
    }
}