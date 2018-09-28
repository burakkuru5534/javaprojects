
import java.util.Scanner;

public class kupkaree {
	
	
	
	public static void main (String[] args){
		
		Scanner scan = new Scanner(System.in);
		System.out.println("sayi gir");
		int x = scan.nextInt();
		for (int i=0 ; i<=x;)
		
			if (x%2==0)
			System.out.println(x + " = " + x*x );	
		
			else 
		{
			System.out.println(x + " = " + x*x*x );
		
		}
		
		
		
		
	}
	
	
}