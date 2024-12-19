// optimized approac to find the largest element fr the array S

package Array2;

public class Largest1{
    static int Large_Elem(int arr[] , int n){
        int largest = arr[0];
        for(int i = 0 ; i<n;i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int arr[]= {2,3,8,5,7};
        int n = arr.length;
        System.out.println("the largest element is :"+Large_Elem(arr, n));
        }
}