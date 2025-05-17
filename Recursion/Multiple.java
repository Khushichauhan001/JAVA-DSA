package Recursion;

public class Multiple {
    static void multi(int num , int k){
        if(k == 1){
            System.out.println(num);
            return ;
        }

         multi(num, k-1);
        int result = num*k;
        System.out.println(result); 
        return ;
    }
    public static void main(String[] args) {
        multi(12,5);
    }
}
