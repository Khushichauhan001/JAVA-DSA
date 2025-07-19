package BinarySearchTrees;

class Node{
    int data ;
    Node left , right ;

    Node(){};
    Node(int value){
        data = value ;
        left = right = null ;
    }
}
public class Ceil {
    static int findCeil(Node root, int key) {
        // code here
        int ceil = -1 ;
        while(root != null){
            if(root.data == key){
                return root.data ;
            }
            if(root.data > key ){
                ceil = root.data ;
                root = root.left ;
            }
            else {
             root = root.right ;
            }
        }
        return ceil ;
    }
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(4);
        root.right = new Node(12);
        root.left.left = new Node(2);
        root.left.right = new Node(6);
        root.right.left = new Node(10);
        root.right.right = new Node(14);

        for (int i = 0; i < 16; i++) {
            System.out.println(i + " " + findCeil(root, i));
        }
    }
}
