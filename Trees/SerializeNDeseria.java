package Trees;

import java.util.*;

public class SerializeNDeseria {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root == null) return "";
         Queue<TreeNode> q1 = new LinkedList<>();
         StringBuilder res = new StringBuilder();
           q1.add(root);
           while(!q1.isEmpty()){
            TreeNode node = q1.poll();
            if(node == null){
                res.append("n ");
                continue ;
            }
            res.append(node.val).append(" ");
            q1.add(node.left);
            q1.add(node.right);
            
           }
           return res.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data == "") return null ;
        Queue<TreeNode> q2 = new LinkedList<>();
        String[] s1 = data.split(" ");
        TreeNode root = new TreeNode(Integer.parseInt(s1[0]));
        q2.add(root);
        for(int i=1 ; i< s1.length ;i++){
            TreeNode parent = q2.poll();
            if(!s1[i].equals("n")){
                TreeNode left = new TreeNode(Integer.parseInt(s1[i]));
                parent.left = left ;
                q2.add(left);
            }
            i++;
            if(i<s1.length && !s1[i].equals("n")){
                TreeNode right = new TreeNode(Integer.parseInt(s1[i]));
                parent.right = right ;
                q2.add(right);
            }
        }
        return root ;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));