public class Recursion01{
    static int count = 0 ; 
    public static void counting(){
        
        if(count ==4){
            return ;
        }
        else System.out.println(count);
        count++;
        counting(); 
    }
     public static void main(String[] args) {
       counting(); 
     }
}