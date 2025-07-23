 package Graphs;

import java.util.ArrayList;

public class Provinces{
 private static void dfs(int node ,ArrayList<ArrayList<Integer>> adjLs , int[] vis){
        vis[node] = 1 ;
        for(Integer it : adjLs.get(node)){
            if(vis[it] == 0){
                dfs(it , adjLs , vis);
            }
        }
     }

    public int findCircleNum(int[][] isConnected) {
        // int v= isConnected.size();
        int rows = isConnected.length;
        int cols = isConnected[0].length;
        ArrayList<ArrayList<Integer>> adjLs = new ArrayList<>();

        for(int i=0 ; i<rows ; i++){
          adjLs.add(new ArrayList<>());

        }

        //conversion of matrix into list 
        for(int i=0 ;i<rows ; i++){
            for(int j=0 ; j<cols ;j++){
                if(isConnected[i][j] == 1 && i!=j){
                    adjLs.get(i).add(j);
                    adjLs.get(j).add(i);
                }
            }
        }
        int[] vis =new int[rows];
        int count = 0 ;
        for(int i=0 ; i<rows;i++){
            if(vis[i] == 0){
                count++;
                dfs(i,adjLs , vis);
            }
        }
        return count ;
    }
 }