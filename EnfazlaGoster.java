import java.awt.Container;
import javax.swing.*;

public class EnfazlaGoster extends JApplet {

	public void init (){
		
		
		String s1 = JOptionPane.showInputDialog("1.Ondalýklý sayýyý Gir : ");
		String s2 = JOptionPane.showInputDialog("2.Ondalýklý sayýyý Gir : ");
		String s3 = JOptionPane.showInputDialog("3.Ondalýklý sayýyý Gir : ");
		
		double n1 = Double.parseDouble(s1);
		double n2 = Double.parseDouble(s2);
		double n3 = Double.parseDouble(s3);
		
		double max = maksimum (n1,n2,n3);
		
		JTextArea outputArea = new JTextArea();
		
		outputArea.setText("n1 : "+n1 + "\n n2 : "+n2+"\n n3 : "+n3+"\n Maksimum : "+max);
		
		Container kutu = getContentPane();
		
		kutu.add(outputArea);
	
	} // end of init
	
	public double maksimum(double x,double y,double z){
		
		return Math.max(x, Math.max(y, z));
	}// end of method maxsimum
	

}//end of class
