package Practice;

public class FloodFill {
        private static void dfs(int[][] image,int[][] ans ,  int row,int col,  int[] dr, int[]dc, int color ,int initialCol){
            ans[row][col] =color;
            int n = image.length;
            int m=image[0].length;

             for(int i=0 ; i< 4 ; i++){
                int nrow = row+dr[i];
                int ncol = col+dc[i];

                if(nrow>=0 && nrow < n && ncol>=0 && ncol < m && image[nrow][ncol]== initialCol && ans[nrow][ncol] != color){
                    dfs(image , ans , nrow , ncol , dr , dc, color , initialCol);
                   
                }
             }
        }
    public static int[][] floddfi(int[][] image, int sr,int sc, int color){
        int initialCol = image[sr][sc];
        int[] dr= {-1,0,1,0};
        int[] dc= {0,1,0,-1};

        if(initialCol == color){
            return image;
        }

        int n= image.length ;
        int m= image[0].length ;

        int[][] ans = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ans[i][j] = image[i][j];
            }
        }
       dfs(image , ans , sr , sc , dr , dc , color , initialCol );
        return ans ;
    }
}
