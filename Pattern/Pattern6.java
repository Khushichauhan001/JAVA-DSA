public class Pattern6 {
    public static void nNumberTriangle(int n) {
        // Write your code here
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        nNumberTriangle(3);
     }
}