import java.util.Scanner;

public class MetotlarDeneme {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		
		int sayi1,sayi2;
		System.out.print("Sayi gir:");
		sayi1 = scan.nextInt();
		
		System.out.print("Sayi gir:");
		sayi2= scan.nextInt();
		
		
		System.out.println(max(sayi1,sayi2));
		
	}

	public static int max(int a,int b){
		if (a<b)
			return b;
		else if(a>b)
			return a ;
		else return 0;
		
	}
}
