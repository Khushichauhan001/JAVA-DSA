package Recursion;

import java.util.*;
class Subset2 {

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
         Arrays.sort(nums);
        subsets(0 , nums ,new ArrayList<>(), result);
        return result ;


    }
    private static void subsets(int idx , int[] nums , List<Integer> currSet ,List<List<Integer>> result ){
          
        result.add(new ArrayList<>(currSet));

        for(int i= idx ; i< nums.length ; i++){
            if(i> idx && nums[i] == nums[i-1]) continue ;
        
        currSet.add(nums[i]);
        subsets(i+1 , nums , currSet , result);
        currSet.remove(currSet.size() -1);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2};
        System.out.println(subsetsWithDup(nums));
    }
}
