import java.util.Arrays;

public class SearchRange {
    public static int[] searchRange(int[] nums, int x) {
        int n = nums.length;
        int lb = lowerBound(nums, n, x);
        if (lb == n || nums[lb] != x) {
            return new int[] { -1, -1 }; // Return [-1, -1] if x is not found
        }
        return new int[] { lb, upperBound(nums, n, x) - 1 };
    }

    public static int lowerBound(int[] nums, int n, int x) {
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] >= x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low; // Return the lower bound directly
    }

    public static int upperBound(int[] nums, int n, int x) {
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low; // Return the upper bound directly
    }

    public static void main(String[] args) {
        int[] nums = { 2, 3, 5, 6, 8,8 , 8 , 8, 14, 17 };
        int x = 8;
        System.out.println(Arrays.toString(searchRange(nums, x)));
    }
}