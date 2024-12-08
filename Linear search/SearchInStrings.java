import java.util.Arrays;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Khushi";
        char target = 'h';
        // System.out.println(search(name , target));
        System.out.println(search2(name , target));
        /// or y bhi ho skta h 
        System.out.println(Arrays.toString(name.toCharArray()));   // give char array
    }


    static boolean search2(String str, char target){
        if(str.length() == 0 ){      // str.length() is an function or method so we have to apply () here
         return false;
        }
         for(char ch: str.toCharArray()){
            if(ch == target){
                return true ;
            }
         }
        return false;
}




//     static boolean search(String str, char target){
//            if(str.length() == 0 ){      // str.length() is an function or method so we have to apply () here
//             return false;
//            }

//            for(int i=0 ; i<str.length();i++) {
//               if(target == str.charAt(i)) {
//                 return true ;
//               }
//            }
//            return false;
// }
}
