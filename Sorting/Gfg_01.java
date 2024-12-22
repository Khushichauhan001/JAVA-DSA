// class Gfg_01{
//     public static void sort012(int[] arr){
//         int n = arr.length ; 
//        for(int i=0 ; i< n  ;i++){
//         int min = i ; 
//                 int didSwap = 0 ;
//              for(int j=i+1 ; j < n ; j++){
//                  if(arr[min] > arr[j] ){
//                     min = j ;
//                     didSwap = 1;
//                  }
//                 }
//                   // swap 
//                     int temp = arr[min];
//                     arr[min] = arr[i];
//                     arr[i] = temp ; 

    
//              }
//              System.out.println("after sort");
//              for(int i= 0 ; i< n ; i++){
//               System.out.print(arr[i] + " ");
//            }
//            System.out.println();
//        }
    
//     public static void main(String[] args) {
//         int arr[] =  {0, 1, 2, 0, 1, 2};
//         int n = arr.length;
//         System.out.println("before sorting");
//         for(int i= 0 ; i<n ; i++){
           
//             System.out.print(arr[i]+ " ");
//         }
//         sort012(arr);

      //     }
// }


class Gfg_01{
    public static void sort012(int[] arr){
        int n = arr.length ; 
       for(int i=0 ; i< n  ;i++){
        // int min = i ; 
                // int didSwap = 0 ;
        for(int j=i+1 ; j < n; j++){
                 if(arr[j] < arr[i] ){
                    // swap 
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp ;
                    // didSwap = 1;
                 }
                }
                // if(didSwap == 0){
                //     break ; 
                // }
                // System.out.println("run");
             }  
             System.out.println("after sort");
             for(int i= 0 ; i< n ; i++){
              System.out.print(arr[i] + " ");
           }
           System.out.println();
       }
    
    public static void main(String[] args) {
        int arr[] =  {0, 1, 2, 0, 1, 2};
        int n = arr.length;
        System.out.println("before sorting");
        for(int i= 0 ; i<n ; i++){
           
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        sort012(arr);
     }
}