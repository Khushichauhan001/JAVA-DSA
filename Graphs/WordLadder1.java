package Graphs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

class Pair{
    String first ;
    int second ;
    Pair(String first , int second){
        this.first = first ;
        this.second = second ;
    }
}

public class WordLadder1 {
    public  static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> st = new HashSet<>(wordList);
        if(!st.contains(endWord)) return 0 ;

        Queue<Pair> qt = new LinkedList<>();
        qt.add(new Pair(beginWord, 1));

        st.remove(beginWord);

        while(!qt.isEmpty()){
            String first = qt.peek().first;
            int second = qt.peek().second ;
            qt.poll();

            if(first.equals(endWord)) return second ;

           for(int i=0 ;i<first.length() ;i++){
             char[] charArray = first.toCharArray();
             char original = charArray[i];

             for(char ch = 'a' ; ch <= 'z' ;ch++){
                if(ch == original) continue ;

                charArray[i] = ch ;
                String newWord = new String(charArray);

                if(st.contains(newWord)){
                  st.remove(newWord);
                  qt.add(new Pair(newWord , second+1));
                }
             }
           }
        }
        return 0;
    }

    public static void main(String[] args) {
        String beginWord = "hit";
        String endWord = "cog";
         String[] wordListt = {
            "hot",
            "dog",
            "dot",
            "lot",
            "log",
            "cog"
        };
        List<String> wordList = Arrays.asList(wordListt);

         int ans = ladderLength(beginWord, endWord, wordList);
         System.out.println(ans);
    }
}
