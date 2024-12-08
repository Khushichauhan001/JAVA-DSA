// https://leetcode.com/problems/richest-customer-wealth/description/

class Account {
    public static void main(String[] args) {
        int[][] arr = {
            {2,4,6},
            {5,7,8},
            {6,3,5},
        };
        System.out.println(maximumWealth(arr)); 
         }
  
         public static int maximumWealth(int[][] accounts) {
           // person = i
           // account = j 
           int ans = Integer.MIN_VALUE;

           for(int i=0;i<accounts.length;i++) {   // person k kitne account h 
           int sum = 0 ;
              for(int j=0 ; j< accounts[i].length ; j++) {
                       sum = sum + accounts[i][j];

              }

              // now we have sum of accounts of person
              // check with overall answer
                 if(sum > ans) {
                    ans = sum ;
                 }
           }
           return ans ; 
             
    }
}
