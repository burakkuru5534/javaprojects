import java.text.NumberFormat;
import java.util.Locale;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;


public class Hesaplama {

	public static void main(String[] args) {

		
		double amount , principal=1000.0,
				rate=0.05;
		NumberFormat  moneyFormat = 
				NumberFormat.getCurrencyInstance(Locale.US);
		
		JTextArea outputTextArea = new JTextArea();
		
		outputTextArea.setText("Year\tAmount on deposit\n");
		
		for ( int year =1;year <=10;year++)
		{
			
			amount = principal * Math.pow(2.0+rate,year);
			outputTextArea.append(year+"\t"+
			moneyFormat.format(amount) + "\n");
		}

		JOptionPane.showMessageDialog(null, outputTextArea,"Hesaplama",JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
