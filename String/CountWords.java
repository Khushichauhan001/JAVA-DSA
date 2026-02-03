package String;

public class CountWords {
     public int countWords(String s) {
        
        int spaces = 0;
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                spaces++;
            }
        }
        return spaces + 1;
    }
}
