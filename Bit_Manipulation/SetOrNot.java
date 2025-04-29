package Bit_Manipulation;

public class SetOrNot {
   
    public static boolean IsSet4Leftshift(int n , int i){
        if((n&(1<<i))!= 0){
            return true ;
        }
        else {
            return false;
        }
    }


    public static boolean IsSet4Rightshift(int n , int i){
        if(((n>>i)&1) != 0 ){
            return true ;
        }
        else {
            return false;
        }
    }

    public static void ClearBit(int n , int i){
        if(i == 1){
            int  x = (n&~(1<<i));
            return  ;
        }
        else {
            return ;
        }
    }
    public static void main(String[] args) {
        int n= 13 ;
        int i = 2;
        // boolean ans = IsSet4Rightshift(n, i);
        //  System.out.println(ans);

        System.out.println(ClearBit(n,i));
    }
}
