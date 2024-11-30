public class Pattern19 {
    public static void nStarTriangle(int n) {
        int iniS = 0;
        for(int i=0;i<n;i++){
           
        //stars 
        for(int j=1;j<=n-i;j++){
            System.out.print("*");
        }

        //spaces
        for(int j=0;j<iniS;j++)
        {
            System.out.print(" ");
        }

        //stars
        for(int j=1;j<=n-i;j++){
            System.out.print("*");
        }
         
        iniS+=2;
        System.out.println();
        }

        iniS = 2*n-1;
        for(int i=0;i<n;i++){
               //stars 
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }

        //spaces
        for(int j=0;j<iniS;j++)
        {
            System.out.print(" ");
        }

        //stars
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
         
        iniS-=2;
        System.out.println();
        }
        
    }
    public static void main(String[] args) {
        nStarTriangle(5);
    }
}