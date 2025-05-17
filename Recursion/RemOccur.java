package Recursion;

public class RemOccur {
    static String removeA2(String s ){
        int n = s.length();
        if(n == 0) return " ";

        String smallAns = removeA2(s.substring(1));

        char currChar = s.charAt(0);
        if(currChar != 'a'){
            return currChar+smallAns;
        }
        else {
            return smallAns;
        }
    }

    static String remove(String s , int idx){
        int n = s.length();

        if(idx == n) return " ";

        String  smallAns = remove(s, idx+1);

        char currChar = s.charAt(idx);
        if(currChar != 'a'){
            return currChar+smallAns;
        }
        else {
            return smallAns;
        }
    }
   public static void main(String[] args) {
    String s = "abcax";
    // System.out.println(remove(s, 0));
    System.out.println(removeA2(s));
   } 
}
