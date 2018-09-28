package ornekler;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class DosyaOku2 {

	private static BufferedReader dOku;
	
	public static void main(String[] args) throws IOException
	{
		
		File dosya = new File("C:\\Users\\crunc\\Desktop\\Burak\\Çalýþmalar\\JAVA ÇALIÞMALAR\\Deneme\\metin.txt");
		
		
		
		dOku = new BufferedReader (new FileReader(dosya));
		
		while (true){
			
			if ( ! dOku.ready()) break;
			
			
			String str = dOku.readLine();
			
			System.out.println(str);
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
