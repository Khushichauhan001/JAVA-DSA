package Array2.Easy;

//Bruteful method ....
public class Appear_once_Brute {
    public static int getSingleElement(int[] arr){
int n = arr.length;

for(int i = 0 ; i< n ; i++){
    int num = arr[i];
    int  count = 0 ;

for(int j = 0 ;j < n ;j++){
    if(arr[j] == num){
        count++;
    }
}

if(count == 1 )
   return arr[i]; 
 
    }
    return -1 ;
}

public static void main(String[] args) {
    int[] arr = {1,2,1,3,4,3,4};
    int n = arr.length;
    int ans = getSingleElement(arr);
    System.out.println(ans);
}

}