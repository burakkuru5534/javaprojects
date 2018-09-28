
public class Comparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstNumber;
		String secondNumber;
		String result;
		int number1;
		int number2;

		firstNumber = JOptionPane.showInputDialog("Enter first number ");

		secondNumber = JOptionPane.showInputDialog("Enter second number");

		number1 = Integer.parseInt(firstNumber);
		number2 = Integer.parseInt(secondNumber);
		result = "";

		if (number1 == number2)
			result = number1 + "==" + number2;

		if (number1 != number2)
			result = number1 + " != " + number2;

		if (number1 < number2)
			result = result + "\n" + number1 + " < " + number2;

		if (number1 > number2)
			result = result + "\n" + number1 + " > " + number2;

		if (number1 <= number2)
			result = result + "\n" + number1 + " <= " + number2;

		if (number1 >= number2)
			result = result + "\n" + number1 + " >= " + number2;

		JOptionPane.showMessageDialog(null, result, "Comporison Results",
				JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}

}
