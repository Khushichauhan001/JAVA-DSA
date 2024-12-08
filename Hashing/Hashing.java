import java.util.*;

class Hashing{
   public static void main(String[] args){
    Scanner s1 = new Scanner(System.in);

    int n;
    n = s1.nextInt();
    int[] arr =  new int[n];
    for(int i = 0 ; i <n ; i++){
        arr[i] = s1.nextInt();
    }
     
    // pre compute
    int[] hash = new int[13];
    for(int i = 0 ; i<n;i++){
        hash[arr[i]] += 1;
    }

    // fetch the query 
    int q ;
    q = s1.nextInt();
    while(q-- != 0){
        int number ;
        number = s1.nextInt();
        // fetch
        System.out.println(hash[number]);
    }
   }
}