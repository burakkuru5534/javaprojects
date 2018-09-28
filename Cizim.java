import javax.swing.JApplet;
import java.awt.Graphics;

public class Cizim extends JApplet {

	
	public void paint (Graphics g )
	{
		super.paint(g);
		
		
		for ( int sayac = 1;sayac<=10;sayac++)
		{
			g.drawLine(10, 10, 250, sayac*10);
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
