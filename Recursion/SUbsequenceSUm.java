package Recursion;

// import java.util.ArrayList;

public class SUbsequenceSUm {
    // static void SumSSQ(int idx , ArrayList<Integer> ds  , int s , int sum , int[] arr ,int n){    // it has ds in it so uncomment it frm main fn when needed
    //        if(idx == n) {
    //         if( s == sum){
    //            for (int it : ds) {
    //             System.out.print(it);
    //            }
    //            System.out.println();
    //         }
    //            return ;
    //         }
    //         ds.add(arr[idx]);
    //         s+= arr[idx];

    //       SumSSQ(idx+1, ds, s, sum, arr, n);
    //       s-= arr[idx];
    //       ds.remove(ds.size()-1);

    //       SumSSQ(idx+1, ds, s, sum, arr, n);
    //        }


           static int getCountOfSubse(int idx , int s , int sum , int[] arr ,int n){
            if(idx == n) {
                if( s == sum){
                   return 1;
                }
                else {
                    return 0;
                }
            }
        
                s+= arr[idx];
    
             int l=  getCountOfSubse(idx+1, s, sum, arr, n);
              s-= arr[idx];
             
    
              int r = getCountOfSubse(idx+1, s, sum, arr, n);
              return l+r;
           }
        
    public static void main(String[] args) {
        int arr[] ={1,2,1};
        int n=  3;
        int sum =2;
        // ArrayList<Integer> ds = new ArrayList<>();
        System.out.println(getCountOfSubse(0, 0, sum, arr, n));
}

}