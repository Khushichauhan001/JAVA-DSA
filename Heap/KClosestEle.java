package Heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class KClosestEle {
     public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> {
            if(a[0] == b[0]){
                return b[1] - a[1];
            }
            return b[0]-a[0];
        });

        for(int i= 0 ; i<arr.length ; i++){
            pq.add(new int[]{Math.abs(arr[i] - x), arr[i]});
            if(pq.size() > k){
               pq.poll();
            }
        }
            List<Integer> result = new ArrayList<>();

            while(!pq.isEmpty()){
              result.add(pq.poll()[1]);
            }
             Collections.sort(result);
        return result ;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 4 ;
        int x =  3;
        System.out.println(findClosestElements(arr, k, x));
    }
}
