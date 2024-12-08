package Collections;

import java.util.Arrays;

public class LearnArrayClass {
    public static void main(String[] args) {
        // int[] numbers  = {1,2,3,4,5,6,7,8,9} ;
        // int index = Arrays.binarySearch(numbers, keys)

        // System.out.println("THE index of element 4 is " +index);

        // for sorting 
        Integer[] numbers = {10,2,34,43,23,4,67,9};
        Arrays.sort(numbers);

        for(int i : numbers) {
            System.out.print(i+ " ");
        }

        // to fill values in each array
        Arrays.fill(numbers , 12);
    }
}
