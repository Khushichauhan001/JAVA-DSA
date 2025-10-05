package Graphs;
import  java.util.*;


class Node {
    int first;
    int second;
    public Node(int first, int second) {
        this.first = first;
        this.second = second; 
    }
}
public class CycleInUndirected {
    public static boolean CheckForcycle(ArrayList<ArrayList<Integer>> adj , int s , boolean[] vis , int[] parent){
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(s,-1));
        vis[s] = true ;

        while(!q.isEmpty()){
            int node = q.peek().first ;
            int par = q.peek().second;
            q.remove();

            for(Integer it: adj.get(node)){
                if(vis[it] == false){
                    q.add(new Node(it , node));
                    vis[it] = true ;
                }
                else if(it != par) {
                    return true ;
                }
            }
        }
        return false ;
    }

    public static boolean IsCycle(int V , ArrayList<ArrayList<Integer>> adj){
     boolean[] vis = new boolean[V];
     Arrays.fill(vis , false);
     int[] parent = new int[V];
     Arrays.fill(parent , -1);
     for(int i=0 ;i<V ;i++){   //14:00 (sare nodes ko dekhega .. unconnected ko bhi )
        if(vis[i] == false){
            if(CheckForcycle(adj, i, vis, parent)){
                return true ;
            }
        }
     }
     return false ;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0 ;i<4 ;i++){
            adj.add(new ArrayList<>());
  
        }
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(2).add(3);
        adj.get(3).add(2);

        boolean ans = IsCycle(4, adj);
        if(ans){
            System.out.println("1");
        }else {
            System.out.println("0");
        }
    }
}
