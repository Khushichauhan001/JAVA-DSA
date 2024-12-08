import java.util.Arrays;
import java.util.Scanner;
public class MultiD {
    
    public static void main(String[] args) {
        /* 123
           456
           789
         */
        Scanner s1 = new Scanner(System.in);

         int[][] arr = new int[3][3]; // ITS NOT Mandatory to add the no. of columns but adding rows is compulsory
                 
         //can also be add directly like 
        //  int[][] arr1 = {    // just array of arrays
        //     {1,2,3},
        //     {4,5,},
        //     {6,7,8,9}, //2nd index -> arr2D[2] = {6,7,8,9}
        //  };


          int[][]  arr1 = new int[3][3];

         //input 
         for (int i = 0; i < arr1.length; i++) {   // row=i
            for (int j = 0; j < arr1[i].length; j++) {  // col = j
                arr1[i][j] = s1.nextInt();
            }
 
         }
     
         //output

    // for (int i = 0; i < arr1.length; i++) {   // row=i
    //     for (int j = 0; j < arr1[i].length; j++) {  // col = j
    //        System.out.print(arr1[i][j] + " ");
    //     }
    //     System.out.println();    // like ek row print krne k bd new line k lie 
    //     }


    //2nd method

    // for (int i =0 ; i<arr1.length; i++)  // gives same output as upper one give 
    //  {
    //     System.out.println(Arrays.toString(arr1[i]));  // i->rows
    //  }

 
    //3rd method   (using enhanced for loop)
    for(int[] num : arr1) {      // every esingle element inside an array is itself an array
        System.out.println(Arrays.toString(num));
    }


    }
}
