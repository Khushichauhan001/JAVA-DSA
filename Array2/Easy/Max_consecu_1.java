// in this we have to find the maximum consecutive 1 ....ex:  1  0  1 1 1 0 0 1 1 
package Array2.Easy;
class Max_consecu_1 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxi = 0 ;
        int count =  0 ;
        for(int i = 0 ; i< nums.length ; i++){
            if(nums[i] == 1){
                count++;
                maxi= Math.max(maxi , count);
            }
            else {
                count = 0 ;
            }
        }

        return maxi ; 
    }
}