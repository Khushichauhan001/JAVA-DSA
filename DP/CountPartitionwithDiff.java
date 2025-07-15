package DP;
class CountPartitionwithDiff{
    public int countPartitions(int[] arr, int d) {
        int sum = 0 ;
        int n = arr.length ;
        // code here
        for(int i=0 ;i<n;i++ ){
            sum += arr[i];
        }
        
        if((sum+d) %2 !=0 || d>sum) return 0;
        int s1 = (d + sum)/2;
        int s2 = sum - s1 ;
        
        return countOfSubset(arr, s1);
    }
    
    int countOfSubset(int[] arr , int target){
        int n = arr.length ;
        int[][] t = new int[n+1][target+1];
        
        for(int i=0 ; i<=n;i++){
            t[i][0]= 1;
        }
        
        for(int i=1 ; i<=n;i++){
            for(int j=0 ; j<=target ;j++){
                if(arr[i-1] <= j ){
                t[i][j] = t[i-1][j] + t[i-1][j-arr[i-1]];
                    
                }
                else {
                    t[i][j] = t[i-1][j];
                }
            }
        }
        return t[n][target];
    }
}