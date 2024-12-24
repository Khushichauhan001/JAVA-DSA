package Array2.Easy;

import java.util.*;
public class Union {
    public static List< Integer > sortedArray(int[] a, int[] b) {
        // Write your code here
        int n1 = a.length;
        int n2 = b.length;
        int i = 0 ; 
        int j = 0 ; 
        ArrayList<Integer> unionArray = new ArrayList<>();
         while(i <n1 && j < n2){
             if(a[i] <= b[j]){
                 if(unionArray.size() == 0 || unionArray.get(unionArray.size() -1) != a[i]){  
                    // it tells us ki unionArray kla size 0 nahi hona chahie or last element of unionArray should not be equal to a[i]
                     unionArray.add(a[i]);
                 }
                 i++;
             }
             else {
                 if(unionArray.size() == 0 || unionArray.get(unionArray.size() -1) != b[j]){
                     unionArray.add(b[j]);
                 }
                 j++;
             }
         }
     
             while(j<n2){
                  if(unionArray.size() == 0 || unionArray.get(unionArray.size() -1) != b[j]){
                     unionArray.add(b[j]);
                 }
                 j++;
             }

               while(i<n1){
                  if(unionArray.size() == 0 || unionArray.get(unionArray.size() -1) != a[i]){
                     unionArray.add(a[i]);
                 }
                 i++;
               }

         return unionArray;
    }
}