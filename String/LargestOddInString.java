package String;

public class LargestOddInString {
    public static String largestOddNumber(String num) {
        int n = num.length();
        int j = n-1;
      
        while((j>=0 && (num.charAt(j) %2)==0)){
          j--;
        }
        if(j>=0){
            return num.substring(0,j+1);
        }
        return "" ;
    }
    public static void main(String[] args) {
        String num = "234156752";
        System.out.println(largestOddNumber(num));
    }
}
