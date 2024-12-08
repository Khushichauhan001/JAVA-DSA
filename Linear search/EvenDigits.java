// leetcode prblm 1295 solved (find the no. of even digits in a number)

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
        System.out.println(digit2(-2334356));   // second way (Also optimize way) to solve this prblm
    }

    static int findNumbers(int[] nums){
        int evenDigitCount = 0 ;

      // count the number of digits
        for(int i = 0  ; i< nums.length; i++ ){
            int n = nums[i];
            int count = 0;

           while( n > 0){
            count++;
            n = n/10;
           }     
                
           // check if the digit count is even or not 
           if (count%2 == 0) {
            evenDigitCount++;
           }
        }
        
        return evenDigitCount ;
    }





    static int digit2(int num ) {
        if(num<0){
            num = num*-1;
        }
        return (int)(Math.log10(num))+1;

    }

}
