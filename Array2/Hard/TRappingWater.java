package Array2.Hard;

public class TRappingWater {
    public static int trap(int[] height) {
        int n = height.length;
        int l=0; 
        int r = n-1 ;
        int res = 0 ;
        int maxLeft = 0 ;
        int maxRight = 0;
        while(l <= r){
            if(height[l] < height[r]){
                if(maxLeft > height[l]){
                    res += maxLeft - height[l];
                }
                else {
                    maxLeft = height[l];
                    l++;
                }
            }
            else{
                if(height[r] > height[l]){
                    if(maxRight > height[r]){
                        res+= maxRight - height[r];
                    }
                    else {
                        maxRight = height[r];
                        r--;
                    }
                }
            }
        }
        return res ;
    }
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }
}
