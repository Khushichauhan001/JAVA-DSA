package Heap;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SortByFreq {
      public static int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0 ; i< nums.length ;i++){
            map.put(nums[i] , map.getOrDefault(nums[i] , 0) + 1);
        }

        // PriorityQueue<int[]> pq = new PriorityQueue<>();
        // for(int i=0 ; i<nums.length ;i++){
        //      pq.add(new int[]{})
        //  }
          PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(
            (a, b) -> {
                if (a.getValue().equals(b.getValue())) {
                    return b.getKey() - a.getKey(); // higher number first
                }
                return a.getValue() - b.getValue(); // lower frequency first
            }
        );

         minHeap.addAll(map.entrySet());

          int[] result = new int[nums.length];
        int idx = 0;

        while (!minHeap.isEmpty()) {
            Map.Entry<Integer, Integer> entry = minHeap.poll();
            int value = entry.getKey();
            int freq = entry.getValue();

            for (int i = 0; i < freq; i++) {
                result[idx++] = value;
            }
        }

        return result;
    }
}




// (a, b) -> {
//     if (a.getValue().equals(b.getValue())) {
//         return b.getKey() - a.getKey();  // if frequency same → bigger number first
//     }
//     return a.getValue() - b.getValue();  // otherwise → smaller frequency first
// }
