import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Craps extends JApplet implements ActionListener {

final int WON = 0,
LOST=1,
CONTINUE =2; // SABÝT DEÐÝÞKENLER OYUN DURUMU ÝÇÝN

boolean firstRoll=true;
int sumOfDice=0;
int myPoint=0;
int gameStatus=CONTINUE;

JLabel die1Label,die2Label,sumLabel,pointLabel; // grafiksel kullanýcý arayüz ifadeleri
JTextField die1Field,die2Field,sumField,pointField;
JButton rollButton;

public void init (){
	
	Container container = getContentPane();
	container.setLayout(new FlowLayout());
	
	// create label and text for die1
	
	die1Label = new JLabel("Die 1");
	container.add(die1Label);
	die1Field = new JTextField(10);
	
	die1Field.setEditable(false);
	container.add(die1Field);
	
	//create label and text for die2
	die2Label = new JLabel("Die 2");
	container.add(die2Label);
	die2Field = new JTextField(10);
	die2Field.setEditable(false);
	container.add(die2Field);
	
	// create label and field for sum
	
	sumLabel = new JLabel("Sum is");
	container.add(sumLabel);
	sumField = new JTextField(10);
	sumField.setEditable(false);
	container.add(sumField);
	
	// create label and field for point
	pointLabel = new JLabel("Point is");
	container.add(pointLabel);
	pointField = new JTextField(10);
	pointField.setEditable(false);
	container.add(pointField);
	
	
	
	// create button user clicks to roll dice
	
	rollButton = new JButton("Roll Dice");
	rollButton.addActionListener(this);
	container.add(rollButton);
	
	// proces one roll of dice
	
	public void actionPerformed (ActionEvent actionEvent){

		if (firstRoll) {
			sumOfDice = rollDice();
		
			switch (sumOfDice)
			{
			
			case 7 : case 11 : 
				gameStatus = WON;
				pointField.setText("");
				break;
				
			case 2 : case 3 : case 12 : 
				gameStatus = LOST;
				pointField.setText(Integer.toString(myPoint));
			firstRoll = false;
			break;
			
			} // end of switch
		
		} // end of if
		
		
		else {
			sumOfDice =rollDice();
			
			if (sumOfDice == myPoint)
		gameStatus = WON;
			else 
				if(sumOfDice==7)
		}
		
		
	}
	
	
	
	
	
	
	
	
}







	}


