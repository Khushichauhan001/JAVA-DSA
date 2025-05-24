package Recursion;

import java.util.ArrayList;

public class ReturnSSQ {
    static ArrayList<String> getSSQ(String s){   //s == abc
    ArrayList<String> ans = new ArrayList<>();
     //base case 
      if(s.length() == 0){
        ans.add(" ");
        return ans ;
      }

     //recursive work 
     char currChar = s.charAt(0);// a
     ArrayList<String> smallAns = getSSQ(s.substring(1));
    for(String ss : smallAns){
        ans.add(ss);   // bc  b  c  " "
        ans.add(currChar + ss);  // abc  ab ac  a
    }
     return ans ;

    }
    public static void main(String[] args) {
        String s = "abcdK" ;
        System.out.println(getSSQ(s));

    }
}
