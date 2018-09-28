import java.awt.Graphics;
import javax.swing.*;

public class EklemeApplet extends JApplet {

double sonuc ;


	public  void init ( )
	{
		
		String ilk_sayi;
		String ikinci_sayi;
		
		double sayi_1;
		double sayi_2;
		
		ilk_sayi = 
				JOptionPane.showInputDialog("Ýlk Ondalýklý sayiyi gir : ");
		
		ikinci_sayi = 
				JOptionPane.showInputDialog("Ýkinci ondalýklý sayiyi gir : ");
		
		sayi_1 = Double.parseDouble(ilk_sayi);
		sayi_2 = Double.parseDouble(ikinci_sayi);
		
		
 sonuc = sayi_1 + sayi_2;

		}
	


		public  void paint ( Graphics g )
		{
			super.paint(g);
			g.drawRect(15,10,270,20);
			g.drawString("Sonuc = " + sonuc, 25, 25);
			}

}
