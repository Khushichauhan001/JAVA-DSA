public class Bubble_sort {
    public static void bubble(int arr[] , int n){
        // optimal approach ...
      for(int i = n-1; i>= 1 ; i--){
        int didSwap = 0 ;   // do this for optimal appproach and it is done i any ascending order is given it donot check by iterating n time 
        for (int j = 0 ; j<= i-1 ; j++){
            if(arr[j] > arr[j+1]){
                int temp = arr[j+1];
                arr[j+1] = arr[j];
                arr[j] = temp;
                didSwap = 1 ;
            }
        }
              if(didSwap == 0 ){
                break ;         
              }
              System.out.println("run ");// for checking ki how many times loop runs 
}
    //    System.out.println("After selection sort: ");
      for(int i= 0 ; i< n ; i++){
         System.out.print(arr[i] + " ");
      }
      System.out.println();

    }
    public static void main(String[] args) {
        int arr[] = {23 ,32 ,45, 78 ,96};
        int n = arr.length;
        // System.out.println("Before selection sort");
        for(int i = 0 ; i< n ;i++){
            System.out.print(arr[i] + " ");
        }
         System.out.println();

         bubble(arr, n);
        
    }
}

