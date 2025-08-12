package BinarySearchTrees;

import java.util.ArrayList;

class Node {
    int data;
    Node left, right;
    Node(int x) {
        data = x;
        left = right = null;
    }
}

public class FindPreSucc {
     public ArrayList<Node> findPreSuc(Node root, int key) {
        // code here
        Node curr = root ;
        Node pre = null ;
        Node succ = null ;
        
        while(curr != null){
            if(curr.data < key){
                pre = curr ;
                curr = curr.right ;
            }
            else {
                curr = curr.left ;
            }
        }
        
        curr = root ;
        while(curr != null){
            if(curr.data > key){
                succ = curr ;
                curr = curr.left ;
            }
            else {
                curr = curr.right ;
            }
        }
        ArrayList<Node> result= new ArrayList<>();
            result.add(pre);
            result.add(succ);
            return result ;
        
    }
}
