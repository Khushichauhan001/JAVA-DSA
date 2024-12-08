// import java.util.Scanner;
// class Pattern1{
//     public static void main(String[] args) {
//         Scanner s1 = new Scanner(System.in);
//         System.out.println("enter the input");
//          int n= s1.nextInt();
//      for(int i=1; i<=n ; i++)
//      {
//         for(int j=1; j<=n; j++)
//         {
//             System.out.print("* ");
//         }
//         System.out.println();
//      }
//     }
// }


// second method

class Pattern1{
    public static void main(String[] args) {
         int n = 5;
         pattern01(n);
    }
     
    static void pattern01(int n){
        for(int i=1; i<=n ; i++)
             {
                for(int j=1; j<=n; j++)
                 {
                     System.out.print("* ");
                 }
                 System.out.println();
              }
    }
}
