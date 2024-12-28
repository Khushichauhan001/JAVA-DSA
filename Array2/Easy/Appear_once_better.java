package Array2.Easy;

//better approach 1 
public class Appear_once_better {
    public static int getSingleElement(int[] arr){
        int n = arr.length;
        // find the maximum element
        int maxi = arr[0];
           for(int i = 0 ; i< n ; i++){
            maxi = Math.max(maxi , arr[i]);
           }

            // Declare hash array of size maxi+1
            // And hash the given array:
            int[] hash = new int[maxi+ 1];
            for (int i = 0; i < n; i++) {
                hash[arr[i]]++;
             }

             for (int i = 0; i < n; i++) {
                if(hash[arr[i]] == 1 ){
                    return arr[i];
                }
             }
             return -1;
            }

            public static void main(String args[]) {
                int[] arr = {4, 1, 2, 1, 2};
                int ans = getSingleElement(arr);
                System.out.println("The single element is: " + ans);
        
            }
    }

