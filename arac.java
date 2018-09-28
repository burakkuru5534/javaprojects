package aracSatisi;

import java.util.Scanner;

public class arac {

	public static void main(String[] args) {

		aracc arac1 = new aracc();

		Scanner Scan = new Scanner(System.in);

		String marka = null;
		String renk = null;

		int kilometre = 0;
		String b;
		char a;

		System.out.println("Marka gir : ");

		marka = Scan.nextLine();
		arac1.setMarka(marka);
		arac1.getMarka();

		System.out.println("Renk gir : ");

		renk = Scan.nextLine();
		arac1.setRenk(renk);
		arac1.getRenk();

		System.out.println("Kilometre gir : ");

		kilometre = Scan.nextInt();
		arac1.setKilometre(kilometre);
		arac1.getKilometre();

		arac1.hizlanma();
		arac1.hizlanma();
		arac1.yavaslama();
		arac1.gethiz();
		System.exit(0);
	}

}
