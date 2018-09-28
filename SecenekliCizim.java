import java.awt.Graphics;
import javax.swing.*;


public class SecenekliCizim extends JApplet {

	int secenek;
	
	
	public void init(){
		
		
		String girdi;
		
		girdi = JOptionPane.showInputDialog(
				"Cizgi cizmek için 1 e bas.\n"+
		        "Kare cizmek icin 2 ye bas.\n "+
				"Daire cizmek için 3 e bas.\n");
		secenek = Integer.parseInt(girdi);
	}
	
	public void paint ( Graphics g){
		
		
		super.paint(g);
		
		for (int i=0;i<=10;i++) {
			
			switch ( secenek)
			
			{
			case 1 : g.drawLine(10, 10, 200, 10+i*10);
			
			break;
			
			case 2 : g.drawRect(10+i*10,10+i*10,50+i*10,50+i*10);
			break;
			
			case 3 : g.drawOval(10+i*10, 10+i*10, 50+i*10, 50+i*10);
			break;
		
			default :
				g.drawString("Invalid value entered",
						10, 20+i*15);
			
			} // switch
		
		}//for
		
		
		
	} // end paint
	
}//end class
