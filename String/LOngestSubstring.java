public class LOngestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLen = 0;
        int left = 0;
        int[] index = new int[128];

        for (int right = 0; right < n; right++) {
            char c = s.charAt(right);
            left = Math.max(index[c], left);
            maxLen = Math.max(maxLen, right - left + 1);
            index[c] = right + 1;
        }

        return maxLen;
    }
public static void main(String[] args) {
    String s = " abcba";
    System.out.println(lengthOfLongestSubstring(s));
}
}
