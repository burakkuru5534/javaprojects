package ornekler;

import java.io.IOException;
import java.io.InputStreamReader;

public class IslemKayit {

	public static void main(String[] args)throws IOException
	
	{
	
		
		
		try {
			
			InputStreamReader cin = new InputStreamReader (System.in);
			
			System.out.println("Karakter gir, beklemek için 'q' ye bas.");
			char c ;
			
			do {
				
				c = (char) cin.read();
				System.out.print(c);
			}while(c!='q');
				
			}
			finally{
				
				InputStreamReader cin = null;
				if (cin !=null)
				{
					cin.close();
				}
				
				
				
			
		}
		
		

	}

}
