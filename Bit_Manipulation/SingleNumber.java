package Bit_Manipulation;

class singleNumber {
    public int singleNo(int[] nums) {
        int n = nums.length;
        int XOR = 0;
        for(int i=0 ; i < n ;i++){
            XOR = XOR ^nums[i];
        }
        return XOR ;
    }
}