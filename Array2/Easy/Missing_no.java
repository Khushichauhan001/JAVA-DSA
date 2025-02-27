// best approach 
package Array2.Easy;

public class Missing_no {
    public int missingNumber(int[] nums) {
    int n = nums.length;
    int xor1 = 0; // XOR of all numbers in the range [0, n]
    int xor2 = 0; // XOR of all elements in the array

    // Compute XOR of all numbers in the range [0, n]
    for (int i = 0; i <= n; i++) {
        xor1 ^= i;
    }

    // Compute XOR of all numbers in the array
 for (int i = 0; i < nums.length; i++) {
      xor2 ^= nums[i];
        }


    // XOR of xor1 and xor2 gives the missing number
    return xor1 ^ xor2;
}
}
 


