package ornekler;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DosyaKopyala {

	public static void main(String[] args) {
		
		try {
			
			File dosya1 = new File("C:\\Users\\crunc\\Desktop\\Burak\\Çalýþmalar\\JAVA ÇALIÞMALAR\\Deneme\\metin.txt");
			File dosya2 = new File("C:\\Users\\crunc\\Desktop\\Burak\\Çalýþmalar\\JAVA ÇALIÞMALAR\\Deneme\\metin2.txt");
			
			
			BufferedReader br = new BufferedReader (new FileReader(dosya1));
			BufferedWriter bw = new BufferedWriter (new FileWriter(dosya2));
			
			
			String satir ;
			
			
			while((satir = br.readLine())!=null){
				
				bw.write(satir); // okunan satýrý buffera yaz
				
				bw.newLine(); // yeni satýra geç
				
	
				
			}
			
			bw.flush();
			bw.close();
			br.close();
			
		} catch (IOException ioe) {
			
			
			// okums yazma hatalarý olabilir
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("Baþarýyla kopyalandý");

	}

}
