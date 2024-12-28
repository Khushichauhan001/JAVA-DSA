// this is the best approach to find the single element ...


package Array2.Easy;

public class Appear_once_optimal {
    public static int getSingleElement(int[] arr){
        int n = arr.length;
        int xor = 0 ;
        for (int i = 0; i < n; i++) {
            xor = xor ^ arr[i];
        }
        return xor;
    }
    public static void main(String[] args) {
        int[] arr = {4,2,1,2,1};
        int n = arr.length;
        int ans = getSingleElement(arr);
        System.out.println(ans);
    }
}
