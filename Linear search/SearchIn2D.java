// search min number in 2d array 

import java.util.Arrays;

public class SearchIn2D {
    public static void main(String[] args) {
        int[][] arr = {
            {18,3,7,},
            {34,65,67,87},
            {27,98,46},
            {39,63},
        };
        int target = 98;
        int[] ans = Search(arr,target); 
        System.out.println(Arrays.toString(ans));
        System.out.println(Integer.MIN_VALUE);
    }

    static int[] Search(int[][] arr , int target){
        for(int i=0;i < arr.length;i++){
            for(int j=0 ; j < arr[i].length; j++) {
                if(arr[i][j] == target){
                    //  ans = arr[i][j];
                    return new int[]{i,j};
                }
            }
            
        }
        return new int[]{1,1};
       
    }
}


