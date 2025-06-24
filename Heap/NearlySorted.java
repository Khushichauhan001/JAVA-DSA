package Heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class NearlySorted {
     public static void nearlySorted(int[] arr, int k) {
        // code here
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int index = 0 ;
        for(int i=0 ; i<=k; i++){
            pq.add(arr[i]);
        }
        for(int i= k+1 ; i< arr.length ; i++){
           int x =  pq.poll();
           pq.add(arr[i]);
           arr[index++] = x ;
        }
        
        while(!pq.isEmpty()){
            arr[index++] = pq.poll();   
        }
        return  ;
    }
    public static void main(String[] args) {
        int[] arr = { 2, 5,3,6,1,8,10,9 };
        int k=4 ;
        nearlySorted(arr, k);
        System.out.println(Arrays.toString(arr));
    }
    
}
