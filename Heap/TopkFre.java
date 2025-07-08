package Heap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;


 // tc: 0(nlog k) sc: 0(n+k)


// public class TopkFre {
//      public static int[] topKFrequent(int[] nums, int k) {
//         HashMap<Integer,Integer> map = new HashMap<>();
//         for(int i=0 ; i<nums.length;i++){
//             map.put(nums[i] , map.getOrDefault(nums[i] ,  0)+1);
//         }

//         PriorityQueue<Map.Entry<Integer,Integer>> minH = new PriorityQueue<>((a,b) -> a.getValue() - b.getValue());
//          for(Map.Entry<Integer,Integer> entry : map.entrySet()){
//             minH.add(entry);
//             if(minH.size() > k){
//                 minH.poll();
//             }
//          }

//          int[] result = new int[k];
//          int i=0 ;
//          while(!minH.isEmpty()){
//             result[i++] = minH.poll().getKey();
//          }

//          return result ;
//     }
//     public static void main(String[] args) {
//         int[] nums= {1,1,2,2,4,4,3,3};
//         int k= 2;
//          int[] result = topKFrequent(nums, k);
//          for(int it : result){
//             System.out.println(it);
//          }
//      }
// }



//  optimized tc : 0(n) sc: 0(n)




public class TopkFre {
  public static int[] topKFrequent(int[] nums, int k) {
      HashMap<Integer, Integer> map = new HashMap<>();
      for(int i=0 ; i<nums.length ; i++){
        map.put(nums[i] , map.getOrDefault(nums[i] , 0)+1);
      }

      List<Integer>[] buckets = new List[nums.length +1];
      for(int key : map.keySet()){
        int freq = map.get(key);
        if(buckets[freq] == null){
            buckets[freq] = new ArrayList<>();
        }
            buckets[freq].add(key);
      }

    List<Integer> result = new ArrayList<>();
      for(int i= buckets.length -1 ; i>= 0 &&  result.size()< k ; i-- ){
          if(buckets[i] != null){
            result.addAll(buckets[i]);
          }
      }

      int[] ans = new int[k];
      for(int i=0 ; i<k ;i++){
        ans[i] = result.get(i);
      }

      return ans ;

  }
  public static void main(String[] args) {
      int[] nums= {1,1,2,2,4,4,3,3};
      int k= 2;
       int[] result = topKFrequent(nums, k);
       for(int it : result){
          System.out.println(it);
       }
   }
}
