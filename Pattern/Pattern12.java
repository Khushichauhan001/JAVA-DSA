public class Pattern12 {
    public static void numberCrown(int n) {
        // Write your code here.
        int space = 2*(n-1);
        for(int i=1;i<=n;i++){
            // numbers
            for(int j=1;j<=i;j++){
            System.out.print(j+" ");
        }
        //space
        for(int j=1 ; j<=space ; j++){
            System.out.print(" ");
        }
        // numbers
        for(int j=i;j>=1;j--){
            System.out.print(j+" ");
        }
        System.out.println();
        space -= 2;
 }
}
    public static void main(String[] args){
      numberCrown(3);
    }
}