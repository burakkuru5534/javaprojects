

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Scanner;

public class Islemler {

	public static void main(String[] args) throws IOException
	
	
	{

		
		
		
		File dosya = new File("C:\\Users\\crunc\\Desktop\\Burak\\�al��malar\\JAVA �ALI�MALAR\\Islemler\\islemler.txt");
		
		dosya.createNewFile();
		
		FileWriter dyaz = new FileWriter(dosya);
	

	int islem_no,sayi_1,sayi_2;
	int sonuc;
	System.out.print("1.Toplama\n2.��karma\n3.�arpma\n4.B�lme\n�slem numaras�n� yaz�n�z numaras�n� yaz�n : ");   

File f = new File("C:\\Users\\crunc\\Desktop\\Burak\\�al��malar\\JAVA �ALI�MALAR\\Islemler\\islemler.txt");
	
	
	
	
	Scanner scan = new Scanner(System.in);
	islem_no = scan.nextInt();

	
	if (islem_no== 1){
	
		System.out.println("Toplama i�lemi yap�lacakt�r.");
		System.out.print("�lk Say�y� girin : ");
		sayi_1 = scan.nextInt();
		System.out.println("Girilen ilk sayi : "+sayi_1);
	    System.out.print("�kinci Say�y� Girin : ");
	    sayi_2 = scan.nextInt();
	    System.out.println("Girilen �kinci Sayi : "+sayi_2);
	    sonuc = sayi_1 + sayi_2;
	    System.out.println("Toplama i�lemi yap�ld�.\nSonu� : "+sonuc);
	
	dyaz.append(sayi_1+"+"+sayi_2+"= "+sonuc);
	dyaz.flush();
	dyaz.close();
	}
	else if (islem_no== 2){
	
		System.out.println("��karma i�lemi yap�lacakt�r.");
		System.out.print("�lk Say�y� girin : ");
		sayi_1 = scan.nextInt();
		System.out.println("Girilen ilk sayi : "+sayi_1);
	    System.out.print("�kinci Say�y� Girin : ");
	    sayi_2 = scan.nextInt();
	    System.out.println("Girilen �kinci Sayi : "+sayi_2);
	    sonuc = sayi_1 - sayi_2;
	    System.out.println("��karma i�lemi yap�ld�.\nSonu� : "+sonuc);
	
	    dyaz.write(sayi_1+"-"+sayi_2+"= "+sonuc);
		dyaz.flush();
		dyaz.close();
	}
	else if (islem_no== 3){
	
		System.out.println("�arpma i�lemi yap�lacakt�r.");
		System.out.print("�lk Say�y� girin : ");
		sayi_1 = scan.nextInt();
		System.out.println("Girilen ilk sayi : "+sayi_1);
	    System.out.print("�kinci Say�y� Girin : ");
	    sayi_2 = scan.nextInt();
	    System.out.println("Girilen �kinci Sayi : "+sayi_2);
	    sonuc = sayi_1 * sayi_2;
	    System.out.println("�arpma i�lemi yap�ld�.\nSonu� : "+sonuc);
	
	    dyaz.write(sayi_1+"*"+sayi_2+"= "+sonuc);
		dyaz.flush();
		dyaz.close();
	}
	else if (islem_no== 4){
		
		System.out.println("B�lme i�lemi yap�lacakt�r.");
		System.out.print("�lk Say�y� girin : ");
		sayi_1 = scan.nextInt();
		System.out.println("Girilen ilk sayi : "+sayi_1);
	    System.out.print("�kinci Say�y� Girin : ");
	    sayi_2 = scan.nextInt();
	    System.out.println("Girilen �kinci Sayi : "+sayi_2);
	    sonuc = sayi_1 / sayi_2;
	    System.out.println("B�lme i�lemi yap�ld�.\nSonu� : "+sonuc);
	
	    dyaz.write(sayi_1+"/"+sayi_2+"= "+sonuc);
		
		dyaz.close();
	}	
	else {
		 
		System.out.println("Yanl�� tu�a bast�n�z.");
		dyaz.write("Hatal� girdi.");
		dyaz.flush();
		dyaz.close();
	
	}
	
	
	
	
	
	
	}
	
	}
	
	

	


