package Recursion;

public class KeypadCombination {
    static void combination(String dig ,String[] kp , String res){    // " 253" -> kp[2]
if(dig.length() == 0){
    System.out.println(res+ " ");
    return ;
}
        int currNum = dig.charAt(0) -'0';  //2
        String currChoices = kp[currNum];   //abc

        for(int i=0 ;i<currChoices.length();i++){
            combination(dig.substring(1), kp, res+currChoices.charAt(i));
        }

    }
    public static void main(String[] args) {
        String s = "23";
        String[] kp = {"", "", "abc" , "def", "ghi" , " jkl" , "mno" , "pqrs" , "tuv" , "wxyz"};
                   //   0    1     2       3      4        5         6     7        8        9
                   ///kp[7] = "pqrs "  mil jayga 
                   combination(s, kp, " ");
    }
}



//   leetccode 17 ;


//     class Solution {
//     public List<String> letterCombinations(String digits) {
//         List<String> result =  new ArrayList<>();
//          if (digits == null || digits.length() == 0) return result;

//           String[] mapping = {
//             "",     // 0
//             "",     // 1
//             "abc",  // 2    
//             "def",  // 3
//             "ghi",  // 4
//             "jkl",  // 5
//             "mno",  // 6
//             "pqrs", // 7
//             "tuv",  // 8
//             "wxyz"  // 9
//         };
//        combination(digits ,0 , "", mapping , result);
//        return result  ;

//     }
//     private void combination(String digits , int idx ,String curr , String[] mapping , List<String> result){
//             if(idx == digits.length()){
//                 result.add(curr);
//                 return ;
//             }

//             int digit = digits.charAt(idx) -'0';
//             String letters = mapping[digit];

//             for(int i=0 ; i<letters.length() ;i++){
//                 combination(digits, idx+1,curr+letters.charAt(i), mapping ,result);
            
//             }
//     }
// }