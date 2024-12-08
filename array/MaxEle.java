public class MaxEle {
    public static void main(String[] args) {
        int[] arr = {1,2,3,28,4,5};
        System.out.println(max(arr));
        System.out.println(maxRange(arr, 1, 3));
    }


    // //work on edge cases here like array being null
    // static int maxRange(int[] arr, int start , int end) {

    // }



   
    // imagine that array is not empty
    static int max(int[] arr) {
        int maxVal = arr[0];
        for (int i = 0 ; i<arr.length; i++){
            if(arr[i]>maxVal){
             maxVal = arr[i];
            }
        }
        return maxVal;
    }


// if i want max value in a range 
static int maxRange(int[] arr, int start , int end) {
    int maxVal = arr[start];
    for (int i = start ; i<= end; i++){
        if(arr[i]>maxVal){
         maxVal = arr[i];
        }
    }
    return maxVal;
}
}
