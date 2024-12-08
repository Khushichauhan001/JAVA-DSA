// METHOD 2 FOR SOLVING RECURSION04.JAVAs
public class Recursion05 {

    public void f(int i){
       if(i<1) return ;
       System.out.print(i+ " ");
    //    i++;
       f(i-1);
    }
    public static void main(String[] args) {
        
        Recursion05 r5 = new Recursion05();
        // int n ;/
        r5.f(4);
        System.out.println();

    }
}