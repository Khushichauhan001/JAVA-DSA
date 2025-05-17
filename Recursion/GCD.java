package Recursion;

public class GCD {
    static int rgcd(int x ,int y){
      if(y == 0){
        return x ;
      }
      return rgcd( y, x%y);
      
    }
    static int igcd(int x , int y ){
      while(x%y != 0){
        int rem = x%y;
        x = y ;
        y = rem ;
      }
      return y ;
    }
    public static void main(String[] args) {
        System.out.println(igcd(15,24));
        System.out.println(rgcd(15,24));
    }
}
