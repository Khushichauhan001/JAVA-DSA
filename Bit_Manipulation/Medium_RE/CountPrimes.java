//leetcode 204 
package Bit_Manipulation.Medium_RE;

import java.util.Arrays;

public class CountPrimes {
    public int countPrimes(int n) {
        if (n <= 2) return 0;

        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);  // purre array ko true fill krdia ki sb primeno. h 
        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {      // it checks ki kya ab bhi i prime h & if its already false , we can skip it .
                for (int j = i * i; j < n; j += i) {      // eleminates the multiple of i and increase by i 
                    isPrime[j] = false;
                }
            }
        }

        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                System.out.print(i+ " ");
              count++;
            }
            

        }

        return count;
    }
    public static void main(String[] args) {
        int n = 40 ;
        CountPrimes c1 = new CountPrimes();
        int ans = c1.countPrimes(n);
        System.out.println(ans);
    }
}
