package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartioning {
      public static List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        List<String> path = new  ArrayList<>();
        partioning(0, s, path, result);
        return result ;

    }
    static void partioning(int idx , String s , List<String> path , List<List<String>> result){
         if(idx == s.length()){
            result.add(new ArrayList<>(path));
            return;
         }
        
        for(int i = idx ; i < s.length() ; i++){
            if(palindrome(s , idx , i)){
                path.add(s.substring(idx , i+1));
                partioning(i+1 , s , path , result);
                path.remove(path.size()-1);

            }
        }

    }

    static boolean palindrome(String s , int start , int end ){
        while(start<= end){
            if(s.charAt(start++) != s.charAt(end--)){
                return false ;
            }
        }
        return true ;
    }

    public static void main(String[] args) {
        String s= "aabb";
        System.out.println(partition(s));
    }
}







// for practice only 
class Solution2 {
    public static List<List<String>> partition(String s){
        List<List<String>> ans = new ArrayList<>();
        List<String> path = new  ArrayList<>();
        partioning(ans, path, 0 , s);
        return ans ;
    }
    private static void partioning(List<List<String>> ans, List<String> path , int idx , String s ){
      if(idx == s.length() ){
        ans.add(new ArrayList<>(path));
          return ;
      }

      for(int i= idx ;i< s.length();i++){
        if(palindrome(s, idx, i)){
            path.add(s.substring(idx, i+1));
            partioning(ans, path, idx+1, s);
            path.remove(path.size()-1);
        }
      }
    }
    private static boolean palindrome(String s , int start , int end){
        while(start <= end){
            if(s.charAt(start++) != s.charAt(end--)){
                return false ;
            }
        }
        return true ;
    }

    public static void main(String[] args) {
        String s = "aaabbb";
        System.out.println(partition(s));
    }
}