package Array2.Medium;
import java.util.Collections;

import java.util.Arrays;

public class Permutation {
        public static int[] NextPermutation(int[] nums){
            int n = nums.length ; 
            // find the break point 
            int index = -1 ;
            for(int i= n-2 ; i>= 0 ; i--){
                if(nums[i] < nums[i+1]){
                    index = i ;
                    break ;
                }
            }

            if(index == -1){
                // Collections.reverse(Arrays.asList(nums));
                reverse(nums, 0, n - 1);
                return nums ;
            }

            for(int i = n-1 ; i > index ;i--){   // i peche s chl rha h next iteration m or ind phle bala ka breakpoint ko bola gya h 
                 if(nums[index] < nums[i]){
                    int temp = nums[i];
                    nums[i] = nums[index];
                    nums[index] = temp ;
                        break ;
                 }
            }

            reverse(nums, index+1 , n-1);
            return nums ; 
        }

            private static void reverse(int[] nums, int start , int end){
               while(start < end){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp ;
                start++;
                end-- ; 
               }
            }

        
        public static void main(String[] args) {
            int[] nums = { 2 ,1 , 5, 4,3, 0 , 0};
            int n = nums.length ;
            int[] ans = NextPermutation(nums);
            System.out.println(Arrays.toString(ans));

        }
}
