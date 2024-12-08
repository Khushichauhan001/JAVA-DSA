// public class Recursion03 {
//     public void f2(int i,int n){
//       if(i>n ) return;
//       System.out.print("GFG ");
//       f2(i+1 , n);
//      }
//     public static void main(String[] args) {
//        Recursion03 r3 = new Recursion03();
//        r3.f2(1, 5); 
//        System.out.println();
//     }
// }


public class Recursion03{
//   public static void f2(int n){
// if(n == 0 ) return ;
// f2(n-1);
// System.out.println(n+ " ");
//   }
//   public static void main(String[] args) {
//     int n = 5;
//     f2(n);
//   }
  public static void printNumbers(int n) {
      if (n == 0) {
          return; // Base case: if n is 0, stop recursion
      }
      System.out.print(n + " "); // Print after recursion (backtracking step)
      printNumbers(n - 1); // Recursive call for smaller problem
      
  }

  public static void main(String[] args) {
      int n = 5; // Example value
      printNumbers(n);
  }
}

