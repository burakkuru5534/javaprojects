import javax.swing.JOptionPane;

public class Karsilastirma {

	public static void main(String[] args) {
	
		String ilk_sayi;
		String ikinci_sayi;
		String sonuc;
		int sayi_1;
		int sayi_2;
		
		ilk_sayi =
				JOptionPane.showInputDialog("ilk sayiyi gir : ");
		// ilk sayiya string cinsinden bir sayi giri�i istedik.
		
		ikinci_sayi =
				JOptionPane.showInputDialog("ikinci sayiyi gir :");
		// ayn� i�lemi ikinci sayi i�in yapt�k.
		
		sayi_1 = Integer.parseInt(ilk_sayi);
		sayi_2 = Integer.parseInt(ikinci_sayi);
		
		// sayi_1 ve sayi_2 ye ilk_sayi ve ikinci_sayi yi atayarak string ifadeyi
		// integer ifadeye d�n��t�rd�k. Integer.parseInt komutu ile.
		
		sonuc = "";
		
		if (sayi_1 == sayi_2)
			sonuc = sayi_1 + "=" + sayi_2;
		//eger sayi_1 == sayi_2 ise sonucun ne olacag�n� yazd�k. benzer islemlere devam.
		
		if ( sayi_1 < sayi_2)
			
			sonuc = sayi_1 + "<" + sayi_2;
		
		if ( sayi_1 > sayi_2)
			sonuc = sayi_1 + ">" + sayi_2;
		
		
		JOptionPane.showMessageDialog(null,sonuc,"Kar��la�t�rma Sonucu",JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);
		
		
			
			
			
		
		
		
	} // main biti� parantezi
} // class �n biti� parantezi
