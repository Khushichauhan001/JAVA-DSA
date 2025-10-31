import java.util.HashMap;
import java.util.Map;


//tc : 0(n) sc : 0(n)
public class SneakyNumber {
    public int[] getSneakyNumbers(int[] nums) {
        int n = nums.length ;
        int[] ans = new int[2];
        HashMap<Integer, Integer> h1 = new HashMap<>();
        for(int i=0 ;i< n ;i++){
            h1.put(nums[i], h1.getOrDefault(nums[i],0)+1);
        }
         int idx = 0;
        for(Map.Entry<Integer, Integer> entry : h1.entrySet()){
            if(entry.getValue()== 2){
                ans[idx++] = entry.getKey();
            }
        }
        return ans ;
    }
}



//optimized one 
//tc: 0(n) sc: 0(1)
class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int n = nums.length - 2; 
        int[] freq = new int[n];
        int[] ans = new int[2];
        for (int num : nums) {
            freq[num]++;
        }
        int idx = 0;
        for (int i = 0; i < n; i++) {
            if (freq[i] == 2) {
                ans[idx++] = i;
            }
        }
        return ans;
    }
}

