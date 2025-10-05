package Recursion;

import java.util.ArrayList;

public class IsPresent {
    static int elePresent(int[] arr , int target , int idx){
        int n= arr.length;
        if(idx >= n) return -1 ;
        //self work
         if(arr[idx] == target){
            return idx ;
         }
        //  recursive work 
        return elePresent(arr, target, idx+1);
        // if(elePresent(arr, target, idx+1)){
        //     return true;
        // }
        // else{
        //     return false
        // }

    }


    static ArrayList<Integer> findAllIndices(int[] arr , int target , int idx){
        int n = arr.length ;
        ArrayList<Integer> ans = new ArrayList<>();
        if(idx>=n){
            return ans;
        }
        // ArrayList<Integer> ans = new ArrayList<>();
         if(arr[idx] == target){        // 1
            // System.out.println(idx);
            ans.add(idx);
        }
       ArrayList<Integer> smallAns = findAllIndices(arr, target, idx+1);   //5 6
       ans.addAll(smallAns);
       return ans ;
    }

    static ArrayList<Integer> PracticeOnly(int[] arr , int target , int idx){
        int n = arr.length ;
        ArrayList<Integer> a1 = new ArrayList<>();
        if(idx>=n){
            return a1 ;
        }
        if(arr[idx] == target ){
            a1.add(idx);
        }
        ArrayList<Integer> smallArrayList = PracticeOnly(arr, target, idx+1);
        a1.addAll(smallArrayList);
        return a1 ;
    }
   public static void main(String[] args) {
        int[] arr ={2,3,5,6,8,3,3,4};
        // int target = 8;
        // System.out.println(elePresent(arr, 3, 0));
        ArrayList<Integer> ans = findAllIndices(arr, 3, 0);
        for(int value: ans){
            System.out.println(value);
        }
    }
}


