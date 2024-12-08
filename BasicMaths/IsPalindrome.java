// solve on leetcode 9 . all test cases are passed

public class IsPalindrome {
    static boolean isPalindrome(int n) {
        int revNum = 0, rem = 0 ;
        int dup = n;
        boolean isNegative = n< 0;
        n = Math.abs(n);

        while(n>0){
            rem = n%10;
            revNum = (revNum*10)+ rem;
            n=n/10;
        }
        if(dup == revNum){
        return true ; 
        } 
        else {
           return false ;
        }
            
    }
    public static void main(String[] args){
        int number = 4554;

        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }
}