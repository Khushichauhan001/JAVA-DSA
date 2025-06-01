package CDCPRAC;

public class KOKO {
        public static int findMax(int[] piles){
            int max = Integer.MIN_VALUE ;
            int n =piles.length;
           for(int i=0 ; i<n;i++){
                max = Math.max(max , piles[i]);
            }
            return max ;
        }
    
        public static double getHours(int[] piles , int limit){
            double th = 0;
            for(int i=0 ; i< piles.length; i++){
                if(piles[i]%limit == 0){
                    th = th+piles[i]/limit;
                }
                else {
                    th = th+piles[i]/limit+1;
                }
            }
            return th ;
        }
        public int minEatingSpeed(int[] piles, int h) {
                int low= 1 ; 
                int high = findMax(piles);
                while(low<=high){
                    int mid = (low+high)/2;
                    double th = getHours(piles, mid);
                    if(th <= h){
                         high = mid-1; 
                    }
                    else {
                        low = mid+1;
                    }
                }
                return low ;
    }
 }
    