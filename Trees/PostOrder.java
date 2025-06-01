package Trees;

import java.util.*;


//using 2 stack 
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
class PostOrder {
    ArrayList<Integer> postOrder(Node node) {
        // code here
             Stack<Node> st1 = new Stack<>();
     Stack<Node> st2 = new Stack<>();
     ArrayList<Integer> ans = new ArrayList<>();

     if(node ==null) return ans ;

     st1.push(node);
     while(!st1.isEmpty()){
        node = st1.pop();
        st2.add(node);
        if(node.left != null) st1.push(node.left);
        if(node.right != null) st1.push(node.right);

     }
       while(!st2.isEmpty()){
        ans.add(st2.pop().data);
       }


        return ans ;
    }
}


//using one stack

