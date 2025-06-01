package Array2;

public class DutchNationalFlag {
    // 0120010

    public static void dutch(int[] a){
        int n = a.length ;
        int low = 0 ;
        int high = n-1 ;
        for(int i = 0 ; i< n ; i++){
            if(a[i] == 0){
                int temp = low ; 
                low = a[i];
                a[i]  = temp ; 
                i++;
                low++;
            }
            else if(a[i] == 2 ){
                int temp = high ;
                high  = a[i];
                a[i] = temp ; 
                high-- ;

            }
            else {
                i++;
            }


        }

    }
    public static void main(String[] args) {
        int[] a = {0,1,2,0,0,1};
      dutch(a);
      int n = a.length;
      for (int i = 0; i < n; i++) {
        System.out.print(a[(i)] + " ");
    }
    System.out.println();
    }
}
