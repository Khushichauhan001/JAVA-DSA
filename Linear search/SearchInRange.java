public class SearchInRange {
    public static void main(String[] args) {
        int arr[] =     {18,12,-33,36,56,28,3};
        int target = 36;
        System.out.println(linearSearch(arr, target , 1, 6));

    }
              static int linearSearch (int[] arr, int target, int start , int end) {
               if (arr.length == 0){
                 return -1;
                }
                   //    run a for loop
                   for(int i = start ; i < end; i++) {
                   // check for element at every index if it is = target
                   int element = arr[i];
                   if(element == target) {
                    return 1;
                   }
            }
    
            // this line will wexecute if non eof the return statements above have executed hence target not found
            return -1;
        }
}
