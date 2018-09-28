public class ContinueLabelTest {

	public static void main(String[] args) {

		String output = "";
		nextRow: for (int row = 1; row <= 5; row++) {
			output += "\n";

			for (int column = 1; column <= 10; column++) {
				if (column > row)
					continue nextRow; // next iteration of

				output += "* ";

			} // end inner for structure

		} // end outer for structure

		JOptionPane.showMessageDialog(null, output,
				"Testing continue with a label",
				JOptionPane.INFORMATION_MESSAGE);

		System.exit(0); //

	}

}
