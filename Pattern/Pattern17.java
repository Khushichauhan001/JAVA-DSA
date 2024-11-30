public class Pattern17 {
    public static void nStarTriangle(int n) {
        // Write your code here
        for(int i=0;i<n;i++)
        {
            for(int j=0; j<n-i-1 ; j++)
            //space
            {
              System.out.print(" ");
            }
            //char
            char ch = 'A';
            int breakpoint = (2*i+1)/2;
            for(int j=1;j<=2*i+1;j++){
                System.out.print(ch);
                
                if(j<= breakpoint) ch++ ;
                else ch--;

            }

             //space 
             for(int j=0;j<n-i-1;j++)
             {
                System.out.print(" ");
             }
           System.out.println();
    }
}
       public static void main(String[] args)
       {
        nStarTriangle(5);
       }
}

