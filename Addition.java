import javax.swing.JOptionPane;

public class Addition {

	public Addition() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		String FirstNumber;
		String SecondNumber;

		int number1;
		int number2;
		int sum;

		FirstNumber = JOptionPane.showInputDialog("enter first integers");

		SecondNumber = JOptionPane.showInputDialog("enter second integers");

		number1 = Integer.parseInt(FirstNumber);

		number2 = Integer.parseInt(SecondNumber);

		sum = number1 + number2;

		JOptionPane.showMessageDialog(null, "the sum is :" + sum, "results",
				JOptionPane.PLAIN_MESSAGE);

	}

}
