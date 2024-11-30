public class OrderagnosticBS
{
	public static void main(String[] args) {
	    int[] arr = {-18,-12,-4,0,2,4,5,6,78,89};
	    int target = 78;
	    int ans = orderagnosticBS(arr , target);
	    System.out.println(ans);
	}
    static int orderagnosticBS(int[] arr, int target ) {
	    int start = 0 ;
	    int end = arr.length - 1 ;
	    
	    // find whether the arry is sorted in asc or des order 
	    boolean isAsc = arr[start] < arr[end];
	    
	    while(start <= end) {
	        // find the middle element
	        int mid = start + (end - start) /2;
	        
	        if(arr[mid] == target){
	            return mid;
	        }
	        
	        if(isAsc) {
	            if(target <arr[mid]){
	                end = mid-1;
	            }else 
	            {
	                start = mid+1;
	            }
	        }
	        else{
	            if(target >arr[mid]){
	                end = mid-1;
	            }
	            else{
	                start = mid+1;
	            }
	        }
	    }
	    return -1 ;
	}
}
