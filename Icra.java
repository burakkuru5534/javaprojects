import java.util.Scanner;

public class Icra extends Methods {

	
	
	public static void main(String args[])
	{
		
		
		Icra icra = new Icra();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("�lk say�y� girin : ");
		sayi1 = scan.nextInt();
		System.out.print("�kinci say�y� girin : ");
		sayi2 = scan.nextInt();
		
		icra.cikarma(sayi1, sayi2);
		
		System.out.println("Sonu� : "+sonuc);
		
		
		
		
		
	}
	
	
	
	
	
}
