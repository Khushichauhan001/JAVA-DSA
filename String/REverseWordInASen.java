package String;
// import java.util.*;

// import Array2.Medium.printLeaderBrute;

public class REverseWordInASen {

//using string builder 
     public static String reverseWord(String s){
        StringBuilder res = new StringBuilder();
        // for(int si = 0;si< s.length() -1 ; si++){

        // }
        int startIndex = s.length()-1 ;
        while(startIndex >=0 ){
            while(startIndex >=0 && s.charAt(startIndex) == ' '){
                startIndex--;
            }
            if(startIndex <0){
                break ;
            }
            int endIndex = startIndex  ;
            while(startIndex >=0 && s.charAt(endIndex) != ' '){
                startIndex--;
            }

            if(res.length() == 0){
                res.append(s.substring(startIndex+1, endIndex+1));
            }
            else {
                res.append(" ");
                res.append(s.substring(startIndex+1, endIndex+1));
            }
        }
        return res.toString();
     }
    public static void main(String[] args) {
        String s = "I am a student";
        System.out.println(reverseWord(s));
      
        
}
}







// // brute force 

// public class REverseWordInASen {
//     public static String reverseWords(String s) {
//     String arr[] = s.split(" ");
//     String res = "";
//     for(int i = arr.length ; i>=0 ;i--){
//         if(arr[i].length() == 0){
//             continue ;
//         }
//         //word 
//         if(res.length() == 0){  // first word ke aage space ni chahie 
//             res += arr[i];
//         }else {
//             res+= " " + arr[i]; 
//         }
//     }
//     return res ;
//     }
//     public static void main(String[] args) {
//     String s = " the sky is blue ";
//      System.out.println(reverseWords(s)); 
//     }
// }


