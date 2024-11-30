// import java.lang.Math;
public class IsPrime {
    public static boolean checkPrime(int n){
            // int sqrtN = (int) Math.sqrt(n)
            int count = 0 ;
            for(int i=1;i*i<=n;i++){
                if(n%i == 0){
                    count++;
                    if((n/i)!= i){
                        count++;
                       }
                 }
                
                
            }
            if(count == 2){
                // System.out.println("no. is prime");
                return true;
            }
            else{
                // System.out.println("no. is not prime");
                return false;
            }
        }
    public static void main(String[] args) {
        int n=37;
        boolean isPrime = checkPrime(n);
        if(isPrime) {
            System.out.println(n + "is a prime number");
        }
        else{
            System.out.println(n + "is not a prime number");
        }
    }
}
