// here not compulsolory that =ve and -ve numbers must be equal in number 
package Array2.Medium;

public class Rearrange_by_sign01 {
    public static int[] RearrangeArray(int[] nums){
     int n = nums.length;
     int[] pos = new int[n/2];
     int[] neg = new int[n/2];

     int posIndex = 0 ;
     int negIndex = 0;

     for(int i=0 ; i< n;i++){
        if(nums[i] > 0){
            pos[posIndex++] = nums[i];
        }
        else {
            neg[negIndex++] = nums[i];
        }
     }
      
     if(pos.length > neg.length){
       for(int i=0 ; i<neg.length ; i++){
        nums[2*i] = pos[i];
        nums[2*i+1] = neg[i];
       }
       int index = neg.length * 2 ;
       for(int i = neg.length ; i<pos.length ; i++){
         nums[index] = pos[i];
         index++;
       }
     }

     else {
        for(int i=0 ; i<pos.length ; i++){
            nums[2*i] = pos[i];
            nums[2*i+1] = neg[i];
           }
           int index = pos.length * 2 ;
           for(int i = pos.length ; i<neg.length ; i++){
             nums[index] = neg[i];
             index++;
           }
     }
     return nums ; 

    }
    // public static void main(String[] args) {
    //     int n = 6;
    //     int nums[]= {1,2,-4,-5 , 6 ,3};
      
      
    //     int[]ans= RearrangeArray(nums);
        
    //     for (int i = 0; i < n; i++) {
    //       System.out.print(ans[i]+" ");
    //     }
    //  }
}
