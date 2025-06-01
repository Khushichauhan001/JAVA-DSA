package Trees;


import java.util.*;

class Pair {
    Node node;
    int hd;

    Pair(Node node, int hd) {
        this.node = node;
        this.hd = hd;
    }
}
class TopView {
    // Function to return a list of nodes visible from the top view
    // from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root) {
        // code here
            
            ArrayList<Integer> ans = new ArrayList<>();
            if(root == null){
                return ans ;
            }
            Map<Integer,Integer> map = new TreeMap<>();
            Queue<Pair> q = new LinkedList<Pair>();
            
            q.add(new Pair(root , 0));
            while(!q.isEmpty()){
                Pair it = q.remove();
                int hd = it.hd ;
                Node temp = it.node;
                
                if(map.get(hd) == null) map.put(hd,temp.data);
                
                if(temp.left != null) {
                    q.add(new Pair(temp.left , hd-1));
                }
                if(temp.right != null){
                    q.add(new Pair(temp.right , hd+1));
                }
            }
            for(Map.Entry<Integer,Integer> entry : map.entrySet()){
                ans.add(entry.getValue());
            }
            return ans ;
            
    }
    public static void main(String[] args) {
        Node root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(22);
        root.left.left = new Node(5);
        root.left.right = new Node(3);
        root.right.right = new Node(25);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);

        // ✅ Call and print result
        ArrayList<Integer> result = topView(root);
        System.out.println(result);
    }
}