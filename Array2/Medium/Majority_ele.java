package Array2.Medium;

import java.util.HashMap;
import java.util.Map;

public class Majority_ele {
    public static int majorityElement(int[] arr){
            int n= arr.length;

            HashMap<Integer , Integer> mpp = new HashMap<>();
            for(int i=0 ; i< n;i++){
                int value = mpp.getOrDefault(arr[i], 0);
                mpp.put(arr[i], value+1);

            }

            for(Map.Entry<Integer , Integer> it: mpp.entrySet()){
                if(it.getValue() > (n/2)){
                    return it.getKey();
                }
            }
            return -1 ;
    }
}
