package Bit_Manipulation;

// optimal approach
class MinNoToFlip {
    public int minBitFlips(int start, int goal) {
        // XOR the two numbers to find differing bits
        int xor = start ^ goal;
        
        // Use Integer.bitCount to count the number of 1's in the XOR result
        return Integer.bitCount(xor);
    }
}   // tc:0(1) sc: 0(1)


//better 
class Solution {
    public int minBitFlips(int start, int goal) {
        int xor = start ^ goal; // bits that differ
        int count = 0;

        while (xor != 0) {
            count += xor & 1; // check if last bit is 1
            xor >>= 1;        // right shift to check next bit
        }

        return count;
    }
}
