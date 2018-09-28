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
		// ilk sayiya string cinsinden bir sayi giriþi istedik.
		
		ikinci_sayi =
				JOptionPane.showInputDialog("ikinci sayiyi gir :");
		// ayný iþlemi ikinci sayi için yaptýk.
		
		sayi_1 = Integer.parseInt(ilk_sayi);
		sayi_2 = Integer.parseInt(ikinci_sayi);
		
		// sayi_1 ve sayi_2 ye ilk_sayi ve ikinci_sayi yi atayarak string ifadeyi
		// integer ifadeye dönüþtürdük. Integer.parseInt komutu ile.
		
		sonuc = "";
		
		if (sayi_1 == sayi_2)
			sonuc = sayi_1 + "=" + sayi_2;
		//eger sayi_1 == sayi_2 ise sonucun ne olacagýný yazdýk. benzer islemlere devam.
		
		if ( sayi_1 < sayi_2)
			
			sonuc = sayi_1 + "<" + sayi_2;
		
		if ( sayi_1 > sayi_2)
			sonuc = sayi_1 + ">" + sayi_2;
		
		
		JOptionPane.showMessageDialog(null,sonuc,"Karþýlaþtýrma Sonucu",JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);
		
		
			
			
			
		
		
		
	} // main bitiþ parantezi
} // class ýn bitiþ parantezi
