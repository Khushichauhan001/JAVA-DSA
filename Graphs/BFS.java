package Graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
     public  static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        int V = adj.size();
        int s=0 ;
        ArrayList<Integer> res = new ArrayList<>();
        Queue<Integer> q1 = new LinkedList<>();
        boolean[] vis = new boolean[V];
        
        vis[s] = true ;
        q1.add(s);
        
        while(!q1.isEmpty()){
            int curr = q1.poll();
            res.add(curr);
            
           for(int it : adj.get(curr)){
               if(!vis[it]){
                   vis[it] = true ;
                   q1.add(it);
               }
           }
        }
         return res ;
        
    }
    public static void main(String[] args) {
        
        // create the adjacency list
        // { {2, 3, 1}, {0}, {0, 4}, {0}, {2} }
       
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        adj.add(new ArrayList<>(Arrays.asList(1, 2)));
        adj.add(new ArrayList<>(Arrays.asList(0, 2, 3)));       
        adj.add(new ArrayList<>(Arrays.asList(0, 4)));       
        adj.add(new ArrayList<>(Arrays.asList(1,4)));          
        adj.add(new ArrayList<>(Arrays.asList(2,3)));          
        
        
        ArrayList<Integer> ans = bfs(adj);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
    
}
