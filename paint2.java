import java.awt.Graphics;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class  paint extends JApplet {

	public void init(){
		
	}
	
	public void paint(Graphics g) {
		
		
		super.paint(g);
		
		g.drawLine(15, 10, 210, 10);
		
		g.drawLine(15, 30, 210, 30);
		
        g.drawLine(15, 10, 15, 30);
		
		g.drawLine(210, 10, 210, 30);
		
		g.drawString("welcome to java programming",25,25);
	}

}
