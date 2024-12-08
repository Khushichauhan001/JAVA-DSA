public class Insertion_sort {
    public static void insert(int arr[] , int n){
      for(int i = 0 ; i<=n-1 ;i++){
        {
           int  j = i ;
           while(j> 0 && arr[j-1] > arr[j]){
            int temp = arr[j-1];
            arr[j-1] = arr[j];
            arr[j]  = temp ; 

            j--;
           }
         }
      }
      for(int i= 0 ; i< n ; i++){
        System.out.print(arr[i] + " ");
       }
     System.out.println();

    }
    public static void main(String[] args) {
        int arr[] = {23 , 12 , 45 , 32 , 5};
        int n = arr.length;
        // System.out.println("Before selection sort");
        // for(int i = 0 ; i< n ;i++){
        //     System.out.print(arr[i] + " ");
        // }
        //  System.out.println();

         insert(arr, n);
        
    }
}
