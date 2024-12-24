// it finds ki how many time a number occurs in an array 
public class Count_fre {
    public static void countFreq(int arr[] , int n){
        boolean visited[] = new boolean[n];
        for(int i=0;i<n;i++){
           if (visited[i] == true)
              continue;


              int count = 1;
              for(int j = i+1 ; j< n ; j++){
                if (arr[i] == arr[j]){
                    visited[j] = true ;
                    count++;
                }
                 
              }
              System.out.println(arr[i] + " " + count);
            
           
        }

    }
    public static void main(String[] args) {
        int arr[] = {2,4,2,6,5,3,2,3};
        int n = arr.length;
         countFreq(arr, n);
    }
}
