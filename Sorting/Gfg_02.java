import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'countSwaps' function below.
     *
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static void countSwaps(List<Integer> a) {
    // Write your code here
    // ArrayList<Integer> arr = new ArrayList<>();
    int n = a.size() ;
          int count = 0 ;
         for(int i=0 ; i< a.size() ;i++){
            int didSwap = 0;
            for(int j = 0 ; j< n-1 ; j++){
                if(a.get(j) > a.get(j+1)){
                    int temp = a.get(j+1);
                     a.set(j+1 , a.get(j));
                     a.set(j , temp);
                    didSwap = 1 ; 
                    count++;
                }
            }
            if(didSwap == 0){
                break ; 
            } 
            
            System.out.println("Array is sorted in" + count + "swaps");
                System.out.println("First element: " +a.get(0));
                System.out.println("Last element: " + a.get(a.size()-1)) ;             
         }
    }

}

public class    Gfg_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());     

        Result.countSwaps(a);

        bufferedReader.close();
    }
}
