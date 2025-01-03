package Array2.Easy;

public class Linear_Search {
       static int searchInSorted(int arr[], int k) {
            // Your code here
            int n = arr.length;
            for(int i = 0 ; i< n ;i++){
                if(arr[i] == k)
                  return i;
            }
            return -1 ; 
            
        }

        public static void main(String[] args) {
            int[] arr = { 2,3,4,1,8,6,4};
            int n= arr.length;
            int k = 1;
            int result = searchInSorted(arr, k);
            System.out.println(result);
        }
    
}
