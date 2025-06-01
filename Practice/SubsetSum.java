package Practice;

import java.util.*;

public class SubsetSum {
    static ArrayList < Integer > subsetSums(ArrayList < Integer > arr, int N) {
        ArrayList<Integer> ans = new ArrayList<>();
        subset(0, 0, ans, arr, N);
        Collections.sort(ans);
        return ans ;
   }
   private static void subset( int idx , int sum,  ArrayList<Integer> ans , List<Integer> arr , int n){
        if(idx == n){
          ans.add(sum);
          return ;
        }

        //recursive work 
          // subset(idx+1, sum, ans, arr, n);

          //self work
          // if curr element consider

          // int currNu = arr.get(idx);
           int Newsum = sum+arr.get(idx);

           subset(idx+1, Newsum, ans, arr, n);

           //when not consider 
           subset(idx+1, sum, ans, arr, n);

   }

  public static void main(String[] args) {
      
      ArrayList < Integer > arr = new ArrayList < > ();
      arr.add(3);
      arr.add(1);
      arr.add(2);
      System.out.println(subsetSums(arr, arr.size()));
  }
    }

