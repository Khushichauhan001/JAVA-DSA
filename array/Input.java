//not run last step of convert string into array
import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);


        //array of primitives
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 45;
        arr[2] = 43;
        arr[3] = 55;
        arr[4] = 65;

        System.out.println(arr[3]);


    // input using for loops
    for(int i=0;i<arr.length;i++){   // when u don't know the size of variable
          arr[i] = s1.nextInt();
    // //     //   System.out.println(arr[i] + " ");
    }
        System.out.println(Arrays.toString(arr));

    for(int i =0 ; i<arr.length;i++)
      {
        System.out.println(arr[i] + " ");
      }


       // for each loop
      for(int num : arr) {   // for every element of the array , print the element
        System.out.println(num + " ");  // here num represents the elements of the array
      }

      //  System.out.println(arr[7]);  // index out of bound error

       //array of objects
       String[] str = new String[4];
       for(int i=0;i<str.length;i++){
        str[i] = s1.next();
      }
      System.out.println(Arrays.toString(str));     //error????

  

    }
 }