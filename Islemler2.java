

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Scanner;

public class Islemler2 {

	public static void main(String[] args) throws IOException
	
	
	{

		
		
		
		File dosya = new File("C:\\Users\\crunc\\Desktop\\Burak\\Çalýþmalar\\JAVA ÇALIÞMALAR\\Islemler\\islemler.txt");
		
		dosya.createNewFile();
		
		FileWriter dyaz = new FileWriter(dosya);
	

	int islem_no,sayi_1,sayi_2;
	int sonuc;
	System.out.print("1.Toplama\n2.Çýkarma\n3.Çarpma\n4.Bölme\n5.Çýkýþ\nÝslem numarasýný yazýnýz numarasýný yazýn : ");   

File f = new File("C:\\Users\\crunc\\Desktop\\Burak\\Çalýþmalar\\JAVA ÇALIÞMALAR\\Islemler\\islemler.txt");
	
	
	
	
	Scanner scan = new Scanner(System.in);
	islem_no = scan.nextInt();
char c = 0 ;
	do{
		
		
	
	if (islem_no== 1){
	
		System.out.println("Toplama iþlemi yapýlacaktýr.");
		System.out.print("Ýlk Sayýyý girin : ");
		sayi_1 = scan.nextInt();
		System.out.println("Girilen ilk sayi : "+sayi_1);
	    System.out.print("Ýkinci Sayýyý Girin : ");
	    sayi_2 = scan.nextInt();
	    System.out.println("Girilen Ýkinci Sayi : "+sayi_2);
	    sonuc = sayi_1 + sayi_2;
	    System.out.println("Toplama iþlemi yapýldý.\nSonuç : "+sonuc);
	
	dyaz.write(sayi_1+"+"+sayi_2+"= "+sonuc);
	dyaz.flush();
	dyaz.close();
	}
	else if (islem_no== 2){
	
		System.out.println("Çýkarma iþlemi yapýlacaktýr.");
		System.out.print("Ýlk Sayýyý girin : ");
		sayi_1 = scan.nextInt();
		System.out.println("Girilen ilk sayi : "+sayi_1);
	    System.out.print("Ýkinci Sayýyý Girin : ");
	    sayi_2 = scan.nextInt();
	    System.out.println("Girilen Ýkinci Sayi : "+sayi_2);
	    sonuc = sayi_1 - sayi_2;
	    System.out.println("Çýkarma iþlemi yapýldý.\nSonuç : "+sonuc);
	
	    dyaz.write(sayi_1+"-"+sayi_2+"= "+sonuc);
		dyaz.flush();
		dyaz.close();
	}
	else if (islem_no== 3){
	
		System.out.println("Çarpma iþlemi yapýlacaktýr.");
		System.out.print("Ýlk Sayýyý girin : ");
		sayi_1 = scan.nextInt();
		System.out.println("Girilen ilk sayi : "+sayi_1);
	    System.out.print("Ýkinci Sayýyý Girin : ");
	    sayi_2 = scan.nextInt();
	    System.out.println("Girilen Ýkinci Sayi : "+sayi_2);
	    sonuc = sayi_1 * sayi_2;
	    System.out.println("Çarpma iþlemi yapýldý.\nSonuç : "+sonuc);
	
	    dyaz.write(sayi_1+"*"+sayi_2+"= "+sonuc);
		dyaz.flush();
		dyaz.close();
	}
	else if (islem_no== 4){
		
		System.out.println("Bölme iþlemi yapýlacaktýr.");
		System.out.print("Ýlk Sayýyý girin : ");
		sayi_1 = scan.nextInt();
		System.out.println("Girilen ilk sayi : "+sayi_1);
	    System.out.print("Ýkinci Sayýyý Girin : ");
	    sayi_2 = scan.nextInt();
	    System.out.println("Girilen Ýkinci Sayi : "+sayi_2);
	    sonuc = sayi_1 / sayi_2;
	    System.out.println("Bölme iþlemi yapýldý.\nSonuç : "+sonuc);
	
	    dyaz.write(sayi_1+"/"+sayi_2+"= "+sonuc);
		
		dyaz.close();
	}	
	else if (islem_no == 5){
		
		System.out.println("Çýkýþ Yapýldý");
	}
	
	else {
		 
		System.out.println("Yanlýþ tuþa bastýnýz.");
		dyaz.write("Hatalý girdi.");
		dyaz.flush();
		dyaz.close();
	
	}
	
	}while(islem_no!=5);
	
	
	
	
	}
	
	}
	
	

	


