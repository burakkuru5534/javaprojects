import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerSinifi {

	public static void main(String[] args) {
		
		File f = new File("C:\\Users\\crunc\\Desktop\\belge.txt");
		
		try {
		      Scanner s = new Scanner(f);
		      
		      while (s.hasNextInt()){
		    	  
		    	  int sayi = s.nextInt();
		    	  if(sayi %2 ==0)
		    	  {
		    		  System.out.println("ikiye bölunebilen sayilar."+sayi);
		    	  }
		    	  
		    	  
		      }
		      } catch (FileNotFoundException e ){
		    	  System.out.println("hata");
		      }
		
		
		
		
		
		
	}

}
