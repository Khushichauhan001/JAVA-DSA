package String ;

import java.util.HashMap;
import java.util.Map;

public class Isomorphic {
     public static boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false ;
        }
        Map<Character, Character> mpp = new HashMap<>();
        for(int i=0 ; i < s.length() ; i++){
           char Original = s.charAt(i);
           char replacement = t.charAt(i);

           if(!mpp.containsKey(Original)){
            if(!mpp.containsValue(replacement)){
                mpp.put(Original , replacement);
            }else {
                return false ;
            }
           }
           else { // agr original key  h already present 
            char  mappedValue = mpp.get(Original);
              if(mappedValue != replacement ){
                return false ;
              }
           }
        }
        return true ;
    }
    public static void main(String[] args) {
        String s = "library";
        String t = "privacy";
        System.out.println(isIsomorphic(s, t));
    }
}

