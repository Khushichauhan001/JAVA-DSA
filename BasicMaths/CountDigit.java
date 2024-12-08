// package BasicMaths;
 


public class CountDigit {

    int count(int n){
    //     int count = 0;
    //     while(n>0){
    //    int rem = n%10;
    //    n = n/10;
    //    count++;
    //     }
    // return count;
    // }


    // second method
    int count = (int)(Math.log10(n)+1);
        return count;
    }

    public static void main(String[] args) {
        // count(7699);
        CountDigit cd = new CountDigit();
        int result = cd.count(34566);
        System.out.println("Number of digits :" + result);
    }
}
