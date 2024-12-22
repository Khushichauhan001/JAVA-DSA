//check-if-array-is-sorted-and-rotated   
//ex: 34521 (rotated yet sorted)
//ex: 23145(not sorted)
// ex: 123 (sorted )

package Array2.Easy;

 class IsRotated_array {
        public static boolean check(int[] arr) {
            int n = arr.length ;
            int count = 0 ;
            for(int i = 0 ; i< n ; i++){
                if(arr[i] > arr[(i+1)%n]){  // to check circularly 
                    count++;
                }
                if(count > 1){
                    return false ; 
                }
            }
            return true ;
        }
public static void main(String[] args) {
    int[] arr = { 3,4,5,1,2,3};
    int n = arr.length ; 
  
     System.out.println(check(arr));
}
    }


    // second method 
//     package Array2;

// public class IsRotated_array {
//     public static boolean check(int[] arr) {
//         int count = 0 ;
//         int n = arr.length; 
//         if(arr[0] < arr[n -1]){
//             count++ ; 
//         }

//         for(int i=0 ; i< n-1 ; i++ ){
//         if(arr[i] > arr[i+1]){
//            count++;
//          }

//         if(count > 1) {
//            return false ; 
//         }
//     }

//      return true; 
//     }

//     public static void main(String[] args) {
//         int[] arr = { 3,4,5,2,1};
//         int n = arr.length ; 
//          System.out.println(check(arr));
//     }
// }


