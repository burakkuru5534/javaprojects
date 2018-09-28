public class LogicalOperators {

	// main method begins execution of Java application
	public static void main(String args[]) {
		// create JTextArea to display results
		JTextArea outputArea = new JTextArea(17, 20);

		// attach JTextArea to a JScrollPane so user can
		// scroll through results
		JScrollPane scroller = new JScrollPane(outputArea);

		String output;

		// create truth table for && operator
		output = "Logical AND (&&)" + "\nfalse && false: " + (false && false)
				+ "\nfalse && true: " + (false && true) + "\ntrue && false: "
				+ (true && false) + "\ntrue && true: " + (true && true);

		// create truth table for || operator
		output += "\n\nLogical OR (||)" + "\nfalse || false: "
				+ (false || false) + "\nfalse || true: " + (false || true)
				+ "\ntrue || false: " + (true || false) + "\ntrue || true: "
				+ (true || true);

		// create truth table for & operator
		output += "\n\nBoolean logical AND (&)" + "\nfalse & false: "
				+ (false & false) + "\nfalse & true: " + (false & true)
				+ "\ntrue & false: " + (true & false) + "\ntrue & true: "
				+ (true & true);

		// create truth table for | operator
		output += "\n\nBoolean logical inclusive OR (|)" + "\nfalse | false: "
				+ (false | false) + "\nfalse | true: " + (false | true)
				+ "\ntrue | false: " + (true | false) + "\ntrue | true: "
				+ (true | true);

		// create truth table for ^ operator
		output += "\n\nBoolean logical exclusive OR (^)" + "\nfalse ^ false: "
				+ (false ^ false) + "\nfalse ^ true: " + (false ^ true)
				+ "\ntrue ^ false: " + (true ^ false) + "\ntrue ^ true: "
				+ (true ^ true);

		// create truth table for ! operator
		output += "\n\nLogical NOT (!)" + "\n!false: " + (!false) + "\n!true: "
				+ (!true);

		outputArea.setText(output); // place results in JTextArea

		JOptionPane.showMessageDialog(null, scroller, "Truth Tables",
				JOptionPane.INFORMATION_MESSAGE);

		System.exit(0); // terminate application

	} // end method main

}