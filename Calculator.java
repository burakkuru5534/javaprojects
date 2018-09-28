package hesapMakinesi;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Calculator extends JFrame {

	private final Font BIGGER_FONT = new Font("Calibri", Font.PLAIN, 20);
	
	private JTextField textfield;
	
	private boolean number = true;
	
	private String  equalOp  = "=";
	
	private CalculatorOp op = new CalculatorOp();//******
	
	public Calculator2() {

		textfield = new JTextField("0", 12); 
		
		textfield.setHorizontalAlignment(JTextField.RIGHT);
		
		textfield.setFont(BIGGER_FONT);
		
		ActionListener numberListener = new NumberListener();
		
		String buttonOrder = "1234567890 ";
		
		JPanel buttonPanel = new JPanel();
		
		buttonPanel.setLayout(new GridLayout(4, 4, 4, 4));
		
		
	}
}

class NumberListener implements ActionListener {

public void actionPerformed(ActionEvent event) {

String digit = event.getActionCommand();

if (number) {

textfield.setText(digit);

number = false;

}

else {

textfield.setText(textfield.getText() + digit);

}

}

}