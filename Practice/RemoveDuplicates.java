// package Practice;

// import java.util.HashSet;

// public class RemoveDuplicates {
//     public static int removeDuplicates(int[] nums) {
//         HashSet<Integer> s1 = new HashSet<>();

//         for(int i=0 ; i< nums.length ; i++){
//             if(!s1.contains(nums[i])){
//                 s1.add(nums[i]);
//             }
//         }
//              int k = s1.size();
//             int j=0 ; 
//             for(int it : s1 ){
//               nums[j++] = it ;
//             }
//             return k ;
//     }

//     public static void main(String[] args) {
//         int[] nums = { 1,4,2,3,5,4,76};
//         for(int i = 0; i< nums.length;i++){
//             System.out.print(nums[i]+ " ");
//         }
//     }
// }





//optimal 0(n)
package Practice;

import java.util.HashSet;

public class RemoveDuplicates {
   
        public int removeDuplicates(int[] nums) {
            
             int n = nums.length;
            if (n <= 1)
                return n;
            
            int idx = 1; 
          
            for (int i = 1; i < n; i++) {
                if (nums[i] != nums[i - 1]) {
                    nums[idx++] = nums[i];
                }
            }
            return idx;
        }
    

    public static void main(String[] args) {
        int[] nums = { 1,4,2,3,5,4,76};
        for(int i = 0; i< nums.length;i++){
            System.out.print(nums[i]+ " ");
        }
    }
}
