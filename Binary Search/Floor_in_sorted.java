public class Floor_in_sorted {
    static int findFloor(int[] arr, int k) {
        // write code here
        int n = arr.length;
        int low = 0 , high = n-1 ;
        int ans = -1 ;
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] <= k){
                ans = mid ;
                low = mid+1 ;
            }
            else {
                high = mid -1 ;
            }
        }
                   return ans ;
        }
        public static void main(String[] args) {
            int[] arr ={ 1, 2,8,10,11,12,19};
            int k = 5 ;
            int n = arr.length ;
            int ans = findFloor(arr, k);
            System.out.println(ans);
        }
}
