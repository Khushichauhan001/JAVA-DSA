import java.util.Arrays;
import java.lang.reflect.Array;

public class MaxNo {
    public static void main(String[] args) {
        int[] arr = { 23,4,45,65,34,2};
        System.out.println(max(arr));
    }

    static int max(int[] arr){
    int ans = arr[0];
    for(int i = 0 ; i< arr.length; i++){
        if(ans<arr[i]){
            ans = arr[i];
        }
    }
       return ans;
    }
}
