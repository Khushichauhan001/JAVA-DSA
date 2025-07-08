package Heap;

import java.util.PriorityQueue;

public class KclosestPoiFROrigin {
        public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a,b) -> distance(b) - distance(a));

        for(int[] nums : points){
            maxHeap.add(nums);
            if(maxHeap.size() > k){
                maxHeap.poll();
            }
        }
        
        int[][] result = new int[k][2];
        int i=0 ;
        while(!maxHeap.isEmpty()){
         result[i++] =  maxHeap.poll(); 
        }
        return result ;
    }
    private int distance(int[] nums){
            return nums[0]*nums[0] + nums[1]*nums[1];
        }

}




// 2. Why we declare it outside the main method (kClosest)?
// 🔁 Because it may be called multiple times inside the class.
// If you write the method inside kClosest, Java will throw an error — Java does not allow nested method definitions like in Python.

// So, you must define it as a separate method at the class level (but still inside the class).

