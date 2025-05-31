package Trees;

import java.util.ArrayList;
import java.util.Stack;
import java.util.*;

public class PreInPostTrav {
    public void preInpost(TreeNode root){
        Stack<Pair> st = new Stack<Pair>();
        st.push(new Pair(root , 1 ));
        List<Integer> pre = new ArrayList<>();
        List<Integer> in = new ArrayList<>();
        List<Integer> post = new ArrayList<>();

        if(root == null) return ;

        while(!st.isEmpty()){
            Pair it = st.pop();

            // this is a part of pre 
            //increment 
            //push left side of the tree
           if(it.num == 1){
            pre.add(it.node.val);
            it.num++;
            st.push(it);

            if(it.node.left != null){
                st.push(new Pair(it.node.left , 1));
            }
           }

           //this is in part 
           //incre 2 to 3 
           //push right side

           else if(it.num == 2){
            in.add(it.node.val);
            it.num++;
            st.push(it);

            if(it.node.right != null){
                st.push(new Pair(it.node.right ,1 ));
            }
           }
           else {
            post.add(it.node.val);
           }

        }
        
 
    }
}
