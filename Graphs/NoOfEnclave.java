package Graphs;

import java.util.Scanner;

public class NoOfEnclave {
    public static int numEnclaves(int[][] grid) {
        int n = grid.length ;
        int m = grid[0].length ;
        int x =fill(grid, n,m);
        return x ;
    }


   public static void dfs(int row , int col , int[][] vis , int[][] grid , int[] delrow , int[] delcol){
     vis[row][col] = 1 ;
     int n = grid.length ;
     int m = grid[0].length ;

      for(int i=0 ;i<4 ;i++){
     int nrow = row+delrow[i] ;
     int ncol = col+ delcol[i] ;

     if(nrow>=0 && nrow<n  && ncol >=0 && ncol < m && vis[nrow][ncol] == 0 && grid[nrow][ncol] == 1 ){
        dfs(nrow , ncol , vis , grid , delrow , delcol);
     }

       }
      }


    static int fill(int[][] grid , int n , int m){
        int[][] vis = new int[n][m];

        int[] delrow ={ -1 ,0,  +1 ,0};
        int[] delcol = {0, +1 , 0 , -1};
        int count = 0;

        for(int j=0; j<m ; j++){
            //first row
            if(vis[0][j]== 0 && grid[0][j] == 1){
                dfs(0 ,j, vis , grid , delrow , delcol);
            }

            // last row
            if(vis[n-1][j] == 0 && grid[n-1][j] == 1){
                dfs(n-1, j, vis, grid,delrow,delcol);
            }
            
        }

        for(int i=0 ;i<n;i++){
            //first col
            if(vis[i][0] == 0 && grid[i][0] == 1){
                dfs(i , 0 , vis , grid , delrow , delcol);
            }

            //last col
            if(vis[i][m-1] == 0 && grid[i][m-1] == 1){
                dfs(i, m-1 , vis , grid , delrow , delcol);
            }
        }

        for(int i=0 ;i<n ;i++){
            for(int j=0 ;j<m ;j++){
                if(vis[i][j] == 0 && grid[i][j] == 1){
                  count = count+1 ;
                }
            }
        }
        return count ;
    }

    // public static void main(String[] args) {
    //     int[][] grid = {{0,0,0,0},{1,0,1,0},{0,1,1,0},{0,0,0,0}};
    //     int ans = numEnclaves(grid);
    //     System.out.println(ans);
    // }
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // take dimensions
        System.out.print("Enter rows (n): ");
        int n = sc.nextInt();
        System.out.print("Enter cols (m): ");
        int m = sc.nextInt();

        int[][] grid = new int[n][m];

        System.out.println("Enter the grid values (0 or 1): ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        int ans = numEnclaves(grid);
        System.out.println("Number of Enclaves = " + ans);

        sc.close();
    }
}
