package Practice;

public class Rotated {
    public static boolean isRotated(int[] arr){
         int n = arr.length;
         int count = 0 ;
         for(int i=0 ; i<n;i++){
             if(arr[i] > arr[(i+1)%n]){

                 count++;
             }
         }
         if(count > 1){
            return false ;
        }
        return true ;
    }

    public static void main(String[] args) {
        int[] arr ={ 3,4,5,65,1,2};
        System.out.println(isRotated(arr));
    }
}
