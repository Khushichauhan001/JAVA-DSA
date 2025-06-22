package SlidingWindow;

import java.util.HashMap;

public class PickFruits {
     public int totalFruit(int[] fruits) {
        int i=0 ; 
        int j= 0 ;
        int max = Integer.MIN_VALUE ;
        HashMap<Integer , Integer> mpp  = new HashMap<>();
        if(fruits.length == 0){
            return 0 ;
        }
         for( j=0;j<fruits.length ;j++){
        mpp.put(fruits[j] , mpp.getOrDefault(fruits[j] , 0)+1);

        while(mpp.size() > 2){
            mpp.put(fruits[i] , mpp.get(fruits[i])-1);
            if(mpp.get(fruits[i]) == 0){
                mpp.remove(fruits[i]);
            }
            i++;
        }
        max = Math.max(max, j-i+1);
       }
       return max ;
    }
    public static void main(String[] args) {
        int[] fruits = {1,2,1,2,3,4,5,6,7,8,9};
        PickFruits pf = new PickFruits();
        int result = pf.totalFruit(fruits);
        System.out.println("Maximum number of fruits that can be picked: " + result);


    }
}
