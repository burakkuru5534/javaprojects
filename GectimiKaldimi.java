import javax.swing.JOptionPane;



public class GectimiKaldimi {
	
	
	public static void main(String[] args) {
		
		int gecti=0,
				kaldi=0,
				ogrenci_Sayisi=1,
				sonuc;
		
		String girdi,
		cikti;
		
		
		while(ogrenci_Sayisi<=10){
			
			girdi = JOptionPane.showInputDialog("Sonucu girin : (1 = gecti , 0 = kaldi");
			
			sonuc = Integer.parseInt(girdi);
			
			if ( sonuc == 1)
				
			gecti=gecti+1;
			
			else if(sonuc==0)
			kaldi=kaldi+1;
			
			else 
				System.out.println("Yanlis girildi");
			
			ogrenci_Sayisi = ogrenci_Sayisi+1;
			
			
		} //WHÝLE bitiþ
		
		
		cikti = "Gecen kisi sayisi : " + gecti + "\nKalan Kisi sayisi : " + kaldi;
		
		if(gecti > 8)
			
			cikti = cikti + "\nYuksek Basarý";
		
		JOptionPane.showMessageDialog(null,cikti,"Sonuclarýn Analizi",JOptionPane.INFORMATION_MESSAGE);
		
		
		System.exit(0);
	}

}
