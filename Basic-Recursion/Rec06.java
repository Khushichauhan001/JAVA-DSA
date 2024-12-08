// second method of recurdsion02.java
// also the example of backtracking 
public class Rec06 {
      public void printNos(int n ){
        if(n<=0) return ;
         printNos(n-1);
         System.out.print(n+ " ");
      }
      public static void main(String[] args) {
        Rec06 r6 = new Rec06();
        r6.printNos(10);
        System.out.println();
      }                 
 }


 