// brute force method
package Array2.Easy;
import java.util.Arrays;

public class Largest {
      
    public static void main(String[] args) {
        int arr1[] = {2,7,3,8,5};
        System.out.println("the largest element in the array is :" + sort(arr1));
     }
     static int sort(int arr[]){
        Arrays.sort(arr);
        return arr[arr.length - 1 ];
     }
}

