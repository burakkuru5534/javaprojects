import javax.swing.JOptionPane;

public class Rastgele {

	public static void main(String[] args) {
		
		int deger;
		String cikti= "";
		
		for(int sayac=1;sayac<=20;sayac++){
			
			deger = 1+ (int)(Math.random()*6);
			
			cikti += deger + " ";
			
			if(sayac%5==0)
				cikti += "\n";
		}
			
		JOptionPane.showMessageDialog(null,cikti,"20 Rastgele sayi 0 dan 6 ya kadar",
				JOptionPane.INFORMATION_MESSAGE);
		
		
		System.exit(0);
		}
		
		
		
		
		
		
		

	}


