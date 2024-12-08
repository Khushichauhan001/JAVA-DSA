// factorial  using recursion

class Recursion08 {
    public static void factorialNumbers(long n) {
        // code here
        // ArrayList<Long> result = new ArrayList<>();
        
        long fact = 1;
        long i = 2;
        while (fact <= n){
            System.out.print(fact + " ");
            fact = fact * i ;
            i++;
        }
     }
    public static void main (String[] args){
        long n = 120;
        // ArrayList<Long> factorials = factorialNumbers(n);
    //    for (long num : factorials) {
    //         System.out.print(num + " ");
    //     }
    factorialNumbers(n);
    System.out.println();
    }

}
