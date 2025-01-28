 class Rotated_Sort_arr_search {
    public static int search(int[] arr, int target) {
        int n= arr.length ;
        int low = 0 , high = n-1 ; 
        while(low <= high){
            int mid = (low + high)/2 ; 
            if(arr[mid] == target){
                return mid ;
            }


            if(arr[low] <= arr[mid]){
             if(arr[low] <= target && target <= arr[mid]){
                high = mid -1 ;
             }
             else {
                low = mid+1 ;
             }
            }
            else {
               if(arr[mid] <= target && target <= arr[high]) {
                low = mid+1 ;
               }
               else {
                high = mid - 1 ;
               }
            }

        }
            return -1 ;
    }
    public static void main(String[] args) {
        int[] arr = {7,8,9,1,2,3,4,5,6};
        int target = 1 ;
        int n = arr.length ;
        int ans = search(arr, target);
        if(ans == -1 ){
            System.out.println("element is not present");
        }
        else {
            System.out.println("The index is"+ " " + ans);
        }
    }

}