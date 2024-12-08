import java.util.ArrayList;
import java.util.Scanner;

class Sorting {
    private static void merge(int arr[] , int low , int mid , int high)
    {
      ArrayList<Integer> temp = new ArrayList<>();
      int left = low ; 
      int right = mid+1;

      //storing elements in sorted array 
      while(left <= mid && right <= high)   {     // yha index ki bat chlri h 
         if(arr[left] <= arr[right]){              // yha us index k andr likhe hue element ki bat chlri h 
            temp.add(arr[left]);
            left++;
         }
         else {
            temp.add(arr[right]);
            right++;
         }
      }

      while(left <= mid){
        temp.add(arr[left]);
        left++;
      }

      while(right <= high){
        temp.add(arr[right]);
        right++;
      }
      // abhi tkk sirf add hue h sare elements ... sort ni hue h 


      // transfering all elements fr temp to arr
    for(int i = low ; i<= high; i++){
        arr[i] = temp.get(i-low);
      }

    }
    public static void mergeSort(int arr[] ,int low ,int high){
        if(low >= high)   return ; 
        int mid = (low+high)/2 ;
        mergeSort(arr , low , mid);
        mergeSort(arr , mid+1 , high);
        merge(arr, low, mid, high);
    }
    }
    public class Merge_sort{
        public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int n = 7 ;
        int arr[] = {3,1,5,8, 8,4,6,9};
        System.out.println("Before sorting Array");
        for(int i = 0 ; i<n ; i++){
          System.out.print(arr[i]+ " ");
        }
        System.out.println();
          Sorting.mergeSort(arr, 0, n-1);
          System.out.println("After sorting ");   // ye hmesa function ko call krne k bd likha jayga 
          for(int i = 0 ; i< n ;i++){
            System.out.print(arr[i] + " ");
          }
          System.out.println();
        }
    }
    

    