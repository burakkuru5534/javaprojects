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
			
			File dosya1 = new File("C:\\Users\\crunc\\Desktop\\Burak\\�al��malar\\JAVA �ALI�MALAR\\Deneme\\metin.txt");
			File dosya2 = new File("C:\\Users\\crunc\\Desktop\\Burak\\�al��malar\\JAVA �ALI�MALAR\\Deneme\\metin2.txt");
			
			
			BufferedReader br = new BufferedReader (new FileReader(dosya1));
			BufferedWriter bw = new BufferedWriter (new FileWriter(dosya2));
			
			
			String satir ;
			
			
			while((satir = br.readLine())!=null){
				
				bw.write(satir); // okunan sat�r� buffera yaz
				
				bw.newLine(); // yeni sat�ra ge�
				
	
				
			}
			
			bw.flush();
			bw.close();
			br.close();
			
		} catch (IOException ioe) {
			
			
			// okums yazma hatalar� olabilir
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("Ba�ar�yla kopyaland�");

	}

}
