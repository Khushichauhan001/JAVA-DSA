// import javax.swing.plaf.metal.MetalBorders.ScrollPaneBorder;

public class Gcdd {
	
	public static int gcd(int a,int b)
	{
		while(a>0 && b>0)
		{
			if(a>b) 
			{
				a=a%b;			

		    }
		    else {
			b=b%a;
		    }
		}
		if(a==0) 
		return b ;  	// Sopln(a)
		else return a ;  // sopln(b);
	}	
	public static void main(String[] args){
     int result = gcd(15, 20);
	 System.out.println(result);
	}	
}