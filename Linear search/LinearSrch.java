public class LinearSrch {
    public static void main(String[] args) {
        int[] nums = {23,45,34,56,78,79,21,69,28,-22};
        int target = 28;
        // int ans = linearSearch(nums, target);
        boolean ans1 = linearSearch1(nums, target);

        // System.out.println(ans);
        System.out.println(ans1);
    }


    static boolean linearSearch1 (int[] arr, int target) {
        if (arr.length == 0){
            return false;
        }

        // run a for loop
        for (int element : arr){
            if(element == target ) {
                return true;
            }
        }

        // this line will wexecute if non eof the return statements above have executed hence target not found
        return false;
    }

    // search in array : return the index if item found 
    // otherwise if item not found return -1
    // static int linearSearch (int[] arr, int target) {
    //     if (arr.length == 0){
    //         return -1;
    //     }

    //     // run a for loop
    //     for(int i = 0 ; i < arr.length; i++) {
    //            // check for element at every index if it is = target
    //            int element = arr[i];
    //            if(element == target) {
    //             return -1;
    //            }
    //     }

    //     // this line will wexecute if non eof the return statements above have executed hence target not found
    //     return -1;
    // }
}