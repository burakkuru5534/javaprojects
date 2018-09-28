import javax.swing.JOptionPane;

public class yildiz2 {

	public static void main(String[] args) {

		
		
		String cikti="";
		nextRow:
			for (int row=1;row<=5;row++){
				cikti += "\n";
				
			
		for (int column=1;column<=10;column++)
			
		{
			if(column>row)
		continue nextRow;
		
			cikti+="*  ";
			
	
	}

}

	JOptionPane.showMessageDialog(null, cikti,"testing bla bla",JOptionPane.INFORMATION_MESSAGE);
		
		
		System.exit(0);
		
		
		
		
		
	}
	}