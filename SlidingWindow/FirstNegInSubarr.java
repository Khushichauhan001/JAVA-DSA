package SlidingWindow; 

import java.util.*;
class FirstNegInSubarr {
    public static List<Integer> firstNegInt(int arr[], int k) {
        // write code here
        int i = 0 ;
        int j=0 ;
        int n=arr.length;
        List<Integer> l1 = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        
         
        while(j<n){
            if(arr[j]<0){
                l1.add(arr[j]); 
                }
            if((j-i+1) < k){
                j++;
            }
            else if((j-i+1) == k){

                if(l1.size() == 0){
                     ans.add(0);
                }
                else{
                   ans.add(l1.get(0));
                }
                if(arr[i]<0){
                     l1.remove(0);
                }
               
                i++;
                j++;
            }
        }
        return ans ;
        
    }

    public static void main(String[] args) {
        int arr[] = { 12 , -1 , -7 , 8 , -15 , 30 ,16 , 28};
        int k  = 3 ;
        System.out.println(firstNegInt(arr, k));
    }
}