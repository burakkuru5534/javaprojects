package ornekler;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.swing.JOptionPane;

public class DosyaOku {

	public static void main(String[] args) throws IOException

	
	
	{
		
	int i;
	
	File dosya = new File("C:\\Users\\crunc\\Desktop\\Burak\\Çalýþmalar\\JAVA ÇALIÞMALAR\\Deneme\\metin.txt");
		
		
	FileInputStream dOku = new FileInputStream(dosya);	
		
		do {
			i = dOku.read();
			if (i!= -1)
		System.out.print((char)i);
		
		}while(i!=-1);
		
		dOku.close();
		

	}

}
