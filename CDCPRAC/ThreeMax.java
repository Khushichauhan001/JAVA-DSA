package CDCPRAC;

public class ThreeMax{
    static void three(int arr[] , int n){
       int max =Integer.MIN_VALUE ;
       int max2 = Integer.MIN_VALUE ;
       for(int i=0 ; i< n ; i++){
        if(arr[i] > max){
            max = arr[i];
        }
        if(arr[i]< max && arr[i]>max2){
            max2= max ;
        }
        System.out.println(max );
        System.out.println(max2);
       }
       

    }
    public static void main(String[] args) {
        int arr[]= {2,3,8,5,7};
        int n = arr.length;
        three(arr, n);
        }
}