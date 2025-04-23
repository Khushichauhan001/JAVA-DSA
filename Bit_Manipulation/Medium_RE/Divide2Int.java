package Bit_Manipulation.Medium_RE;

public class Divide2Int {
        public static int divide(int dividend, int divisor) {
            // Handle overflow case
            if (dividend == Integer.MIN_VALUE && divisor == -1) {
                return Integer.MAX_VALUE;
            }
    
            // Use long to avoid overflow
            long n = Math.abs((long)dividend);
            long d = Math.abs((long)divisor);
            long ans = 0;
    
            while (n >= d) {
                long temp = d, multiple = 1;
                while (n >= (temp << 1)) {
                    temp <<= 1;
                    multiple <<= 1;
                }
                n -= temp;
                ans += multiple;
            }
    
            boolean sameSign = (dividend > 0) == (divisor > 0);
            return (int)(sameSign ? ans : -ans);
        }

        public static void main(String[] args) {
            int dividend = 43 ;
            int divisor= 3 ;
            int ans1 = divide(dividend, divisor);
            System.out.println(ans1);
        }

}
