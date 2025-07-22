package String;

// brute force : see in copy  : tc and sc: 0(2^n)

//optimal : this by using iterative   tc: 0(mxn)   sc: 0(m)
public class CountAndSay {
        public String countAndSay(int n) {
            if (n == 1) return "1";
    
            String result = "1";
            
            for (int i = 2; i <= n; i++) {
                StringBuilder curr = new StringBuilder();
                int count = 1;
                char ch = result.charAt(0);
    
                for (int j = 1; j < result.length(); j++) {
                    if (result.charAt(j) == ch) {
                        count++;
                    } else {
                        curr.append(count).append(ch);
                        ch = result.charAt(j);
                        count = 1;
                    }
                }
    
                curr.append(count).append(ch);  // append the last group
                result = curr.toString();
            }
    
            return result;
        }
        
}
