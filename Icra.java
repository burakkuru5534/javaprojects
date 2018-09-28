import java.util.Scanner;

public class Icra extends Methods {

	
	
	public static void main(String args[])
	{
		
		
		Icra icra = new Icra();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Ýlk sayýyý girin : ");
		sayi1 = scan.nextInt();
		System.out.print("Ýkinci sayýyý girin : ");
		sayi2 = scan.nextInt();
		
		icra.cikarma(sayi1, sayi2);
		
		System.out.println("Sonuç : "+sonuc);
		
		
		
		
		
	}
	
	
	
	
	
}
