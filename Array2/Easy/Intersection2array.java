package Array2.Easy;
import java.util.*;

class Intersection2array {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        Set<Integer> set = new HashSet<>();
        int i = 0, j = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                set.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        // Convert set to array
        int[] result = new int[set.size()];
        int idx = 0;
        for (int num : set) {
            result[idx++] = num;
        }

        return result;
    }

    public static void main(String[] args) {
     
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        System.out.println(Arrays.toString(intersection(nums1, nums2))); // [2]
    }
}




// optimal way 
//tc : 0(n+m)
//sc: 0(n+k)
// import java.util.*;

// class Solution {
//     public int[] intersection(int[] nums1, int[] nums2) {
//         Set<Integer> set1 = new HashSet<>();
//         for (int num : nums1) {
//             set1.add(num);
//         }

//         Set<Integer> resultSet = new HashSet<>();
//         for (int num : nums2) {
//             if (set1.contains(num)) {
//                 resultSet.add(num);
//             }
//         }

//         int[] result = new int[resultSet.size()];
//         int i = 0;
//         for (int num : resultSet) {
//             result[i++] = num;
//         }

//         return result;
//     }

//     public static void main(String[] args) {
//         Solution s = new Solution();
//         int[] nums1 = {1, 2, 2, 1};
//         int[] nums2 = {2, 2};
//         System.out.println(Arrays.toString(s.intersection(nums1, nums2))); // [2]
//     }
// }
