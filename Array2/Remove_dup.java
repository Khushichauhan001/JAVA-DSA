// Imp question (remove the duplicates number from the given sorted array and return the number of uniques elements  )

package Array2;

public class Remove_dup{
    public static int removeDuplicates(int[] arr,int n) {
        // Write your code here.
         int i = 0 ; 
         for(int j = 0 ; j<n ; j++){
             if(arr[j] != arr[i]){
                 arr[i+1] = arr[j];
                 i++;
             }
         }
         return i+1; 
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,3,4};
        int n = arr.length;

        int result = removeDuplicates(arr, n);
        System.out.println(result);
    }
    
}
