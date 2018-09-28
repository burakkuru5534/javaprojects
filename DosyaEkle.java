

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;



public class DosyaEkle {

	public static void main(String[] args) throws IOException
	
	{
		File dosya = new File("C:\\Users\\crunc\\Desktop\\belge.txt");
		
		BufferedWriter dYaz = new BufferedWriter(new FileWriter(dosya,true));
		
		String ifade;
		
		ifade = "sek";
		
		dYaz.write(ifade);
		dYaz.newLine();
		dYaz.close();
		System.out.println("Ekleme tamamlandý.");
		
	}

}
