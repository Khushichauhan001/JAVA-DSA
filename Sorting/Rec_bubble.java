public class Rec_bubble {
     static void bubble_sort(int arr[] , int n ){
        if( n== 1) return ; 

        // int didswap = 0;(for best case)
        for( int j = 0 ; j < n-1 ; j++){
            if(arr[j] > arr[j+1]){
                int temp = arr[j] ; 
                arr[j] = arr[j+1];
                arr[j+1] = temp ;
                // didSwap = 1;
            }
        }

        // if(didswap = 0 ) return ;  // mtln=b ye aese krne s sari elements ko check ni krega jaise agr ascending order m h koi array toh usme sirf if condition check krega kuch ni krega 
        bubble_sort(arr, n-1);
     }

     public static void main(String[] args) {
        int arr[] = {6,3,7,5,2,9,1};
        int n = arr.length;
        System.out.println("before using bubble sort ");
       for(int i = 0 ; i<n;i++){
       System.out.print(arr[i]+ " ");
        }
        System.out.println();

        bubble_sort(arr, n);

        System.out.println("after bubble sort");
        for(int i=0;i<n;i++){
         System.out.print(arr[i] + " ");
        }
        System.out.println();
     }
}
