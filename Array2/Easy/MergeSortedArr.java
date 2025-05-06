package Array2.Easy;

public class MergeSortedArr {
    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int i= m-1 ;
        int j= n-1 ;
        int k = m+n-1 ;

        while(j>=0 && i>= 0){
            if(nums1[i]==0 || nums2[j] == 0){
        
            }
            if(nums1[i] > nums2[j]){
                nums1[k--] = nums1[i--];
            }
            else {
                nums1[k--] = nums2[j--];
            }
        }

        while( j>=0 ){
            nums1[k--] = nums2[j--];
        }
        return  nums1;
    }

    public static void main(String[] args) {
        MergeSortedArr m1 = new MergeSortedArr();
        int[] nums1 = { 4,5,6,0,0,0};
        int[] nums2 = {1,2,3};
        int m =nums1.length;
        int n= nums2.length;
         int[] ans = m1.merge(nums1, m, nums2, n);
         System.out.println(ans);
    }

}