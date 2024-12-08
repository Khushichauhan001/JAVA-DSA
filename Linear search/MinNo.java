import java.lang.reflect.Array;
import java.util.Arrays;

public class MinNo {
    public static void main(String[] args) {
        int[] arr = {12,34,2,56,43,57};
        System.out.println(min(arr));
    }



    // assume arr.length!= 0
    // return the minimum array 
    static int min(int[] arr) {
        int ans = arr[0];
        for(int i=0 ;i < arr.length ; i++){
           if(ans > arr[i]){
            ans = arr[i];
           }
        //    else {
        //     ans = arr[0];
        //    }
        }
        return ans ;

    }
}


