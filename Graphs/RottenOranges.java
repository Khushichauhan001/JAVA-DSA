package Graphs;

import java.util.LinkedList;
import java.util.Queue;
   
class Pair{
    int row ;
    int col ;
    int tm ;
    Pair(int _row , int _col, int _tm){
        this.row = _row;
        this.col= _col;
        this.tm= _tm;
    }
}
public class RottenOranges {
     public int orangesRotting(int[][] grid) {
        int n = grid.length ;
        int m = grid[0].length;
         Queue<Pair> q1 = new LinkedList<>();
         int[][] vis = new int[n][m];
        //  int count = 0 ;
         for(int i=0 ; i< n ;i++){
            for(int j=0 ; j< m ;j++){
                if(grid[i][j] == 2){
                    q1.add(new Pair(i,j,0));
                    vis[i][j] = 2 ;
                }
                else {
                    vis[i][j] = 0;
                }

            }
         }

         int tm =0 ;
         int[] drow = {-1,0,1,0};
         int[] dcol = {0,1,0,-1};
         while(!q1.isEmpty()){
            int r = q1.peek().row ;
            int c = q1.peek().col;
            int t = q1.peek().tm ;
            tm = Math.max(tm , t);
            q1.remove ();

            for(int i=0 ; i<4 ;i++){
                int nrow = r+drow[i];
                int ncol = c+dcol[i];
                
                if(nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && vis[nrow][ncol] == 0  && grid[nrow][ncol] == 1){
                    q1.add(new Pair(nrow, ncol , t+1));
                    vis[nrow][ncol] = 2 ;
                
                }
            }

         }
         for(int i=0 ; i< n ;i++){
            for(int j=0 ; j<m ;j++){
                if(vis[i][j] != 2 && grid[i][j] == 1){
                    return -1 ;
                }
            }
         }
         return tm ;
    }
    public static void main(String[] args) {
        RottenOranges solution = new RottenOranges();

        int[][] grid = {
            {2, 1, 1},
            {1, 1, 0},
            {0, 1, 1}
        };

        int result = solution.orangesRotting(grid);
        System.out.println("Minimum minutes to rot all oranges: " + result);
    }
}
