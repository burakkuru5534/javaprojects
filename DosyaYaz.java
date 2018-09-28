package ornekler;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DosyaYaz {

	
	
	public static void main (String args[]) throws IOException{
		
		
		File dosya = new File("C:\\Users\\crunc\\Desktop\\Burak\\Çalýþmalar\\JAVA ÇALIÞMALAR\\Deneme\\metin.txt");
		
		dosya.createNewFile();
		
		FileWriter dYaz = new FileWriter(dosya);
		
		Scanner gir = new Scanner(System.in);
		
		System.out.println("Metin giriniz : ");
		
		dYaz.write(gir.nextLine());
		
		dYaz.flush();
		
		dYaz.close();
		
		System.out.println("Metin baþarýyla txt dosyasýna kaydedildi.");
		
	}
	
	
	
}
