package Recursion;

import  java.util.*;

public class Combination{
    private static void findCombination(int idx , int target  , int[] arr , List<List<Integer>> result , List<Integer> ds){
        int n = arr.length;
      if(idx == n){
        if(target == 0){
            result.add(new ArrayList<>(ds));
        }
        return ; 
      }

     if(arr[idx]<= target){
        ds.add(arr[idx]);
        findCombination(idx, target - arr[idx], arr, result, ds);
        ds.remove(ds.size()-1);

     }
     findCombination(idx+1, target, arr, result, ds);
     
    }
    public static List<List<Integer>> combinationSum(int[] candidates , int sum){
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        findCombination(0, sum, candidates, result, ds);
        return result ;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,6,7};
        int sum =7 ;
        System.out.println(combinationSum(arr, sum));
    }
}
