package SlidingWindow;

import java.util.HashMap;

public class LengthOfLOngestSubstring {
      public int lengthOfLongestSubstring(String s) {
       HashMap<Character , Integer> h1 = new HashMap<Character , Integer>();
       int left =0;
       int right =0;
       int len =0;
       int n = s.length();
       while(right <n){
        if(h1.containsKey(s.charAt(right))){
            left = Math.max(h1.get(s.charAt(right))+1 , left);

          
        }
          h1.put(s.charAt(right) , right);
            len = Math.max(len, right-left+1);
            right++;

       }
        return len ;
    }
}
