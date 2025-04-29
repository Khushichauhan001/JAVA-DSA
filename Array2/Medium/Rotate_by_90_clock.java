

package Array2.Medium;
public class Rotate_by_90_clock {
    static int[][] rotate(int[][] matrix) {
        int n= matrix.length ;
        int ans[][] = new int[n][n];
        for(int i=0 ;i< n;i++){
            for(int j=0 ; j< n;j++){
             ans[j][n-1-i] = matrix[i][j];
            }
        }
        return ans ; 
    }
    public static void main(String[] args) {
        int arr[][] =  {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int ans[][] = rotate(arr);
         System.out.println("Rotated image ");
         for(int i=0 ; i< ans.length;i++){
           for(int j=0 ;j< ans.length ; j++){
            System.out.print(ans[i][j]);
           }
           System.out.println();
         }
       
    }
}
