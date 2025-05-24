package CDCPRAC;

public class LeastCapacity {
    public int noOfDays(int[] weight , int capacity){
        int days= 1 ;
        int load= 0;
        for(int i=0 ; i<weight.length ;i++){
             if(load+weight[i] > capacity){
         days = days+1;
         load = weight[i];
        }
        else {
            load = load+weight[i];
        }
        }
         return days ;
    }
    public int shipWithinDays(int[] weight, int days) {
      int low = Integer.MIN_VALUE ;
      int high = 0;
      for(int i=0 ; i<weight.length ;i++){
        high = high+weight[i];
        low = Math.max(low , weight[i]);
      }
       while(low<= high){
        int mid =(low+high)/2;

        int TotalDays = noOfDays(weight, mid);
            if(TotalDays <= days){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        
       }
       return low ;
    }
}

