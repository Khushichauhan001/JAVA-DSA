package Practice;

import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges {
    public static int orangesRott(int[][] grid){
        int m = grid.length;
        int n = grid[0].length ;
        if(m==0) return 0;

        int total=0;
        int count =0;
        Queue<int[]> q1 = new LinkedList();
        for(int i=0;i<m;i++){
          for(int j=0;j<n;j++){
            if(grid[i][j] != '0') total++;
            if(grid[i][j] == 2){
                q1.add(new int[]{i,j});
            }
          }
        }

        int[] dx = {-1,0,1,0};
        int[] dy = {0,-1,0,1};

        int days =0;
        while(!q1.isEmpty()){
           int k = q1.size();
           count+=k;
           for(int i=0;i<k;i++){
            int[] pos= q1.poll();
        int x = pos[0],y=pos[1];

        for(int d=0;d<4;d++){
            int nx = dx[d] +x ;
            int ny = dy[d] +y;

            if(nx<0 || ny<0 || nx>=m || ny>=n || grid[nx][ny] != 1){
                continue;
            }
            grid[nx][ny] =  2;
            q1.add(new int[]{nx,ny});
        }
        }
        if(!q1.isEmpty()) days++;
        }
        return total==count ? days : -1 ;
    }
    public static void main(String[] args) {
        int[][] grid = {
            {2,1,1},
            {1,1,0},
            {0,1,1}
        };

        int res = orangesRott(grid);
        System.out.println(res);
    }
}
