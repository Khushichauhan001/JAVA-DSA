package Recursion;

import java.util.ArrayList;

public class PrintOneSubsOnly {
    static boolean printOne(int idx, int[] arr , int s , int sum , ArrayList<Integer> ds ,int n){
         if(idx == n){
            // if condition satisfied 
            if(s== sum){
               for (int it : ds) {
                  System.out.print(it+ " ");
                }
                   System.out.println();
                return true ;
            }
             else return false ;
         }

         ds.add(arr[idx]);
         s+=arr[idx];

         if(printOne(idx+1, arr, s, sum, ds, n) == true){
            return true ;
         }

           ds.remove(ds.size()-1);
           s-=arr[idx];

           if(printOne(idx+1, arr, s, sum, ds, n)== true ){
            return true ;
           }

           return false ;

    }
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        int n = arr.length ;
        int sum = 2 ;
         ArrayList<Integer> ds = new ArrayList<>();
        printOne(0 , arr , 0 , sum , ds , n);
    }
}
