package GreedyAlgo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;


//tc: 0(nlogn) 
//sc: 0(n)
public class AvoidFlood {
      public int[] avoidFlood(int[] rains) {
        int n = rains.length ;
        int[] ans = new int [n];
        Arrays.fill(ans , -1);
        Map<Integer, Integer> full = new HashMap<>();
        TreeSet<Integer> dryDays = new TreeSet<>();

        for(int i=0 ;i < n ;i++){
            int lake = rains[i];

            if(lake == 0){
                dryDays.add(i);
                ans[i] =1 ;
            }
            else {
                ans[i]=-1;

                if(full.containsKey(lake)){
                    Integer dryDay  = dryDays.higher(full.get(lake));
                    if(dryDay == null) return new int[0];

                    ans[dryDay] = lake ;
                    dryDays.remove(dryDay)  ;
                }
                full.put(lake , i);
            }
        }
        return ans ;
    }
}




// explanation
// rains = [1, 2, 0, 0, 2, 1] with indices 0..5

// i=0, lake=1: full didn't contain 1 → skip if-block, then full.put(1,0)

// i=1, lake=2: full.put(2,1)

// i=2, zero-day: dryDays = {2}

// i=3, zero-day: dryDays = {2,3}

// i=4, lake=2: full.containsKey(2) is true, prevRainDay = 1.
// dryDays.higher(1) → returns 2 (earliest dry day after day 1).
// So ans[2] = 2, dryDays.remove(2), then full.put(2,4) (now lake 2 is filled on day 4).

// i=5, lake=1: prevRainDay = 0, dryDays.higher(0) → now returns 3, so ans[3]=1, dryDays.remove(3), full.put(1,5).

// Result: [-1,-1,2,1,-1,-1] — no floods.