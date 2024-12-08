// check if a given string is palindrome or not 
class Recursion10 {
    
    static boolean palindrome(int i, String s){
        
            // Base Condition
            // If i exceeds half of the string, means all the elements 
            // are compared, we return true.
            if(i>=s.length()/2) return true;  // mtlb ki sare elements compare ho gye h ....
            
            // If start is not equal to end, not palindrome.
            if(s.charAt(i)!=s.charAt(s.length()-i-1)) return false;
            
            // If both characters are same, increment i and check start+1 and end-1.
            return palindrome(i+1,s);  // we increase only i bcz start or end dono i p depend kr rhe h ..
            

    }
    public static void main(String[] args) {

       // Example string.
       String s = "madam";
       System.out.println(palindrome(0,s));
    }
}
// space complexity : O(1) as elements are swap with each other and no extra space is required to store the elements
// time complexity : O(N)

