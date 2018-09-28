import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ButtonTest extends JFrame {
	private JButton plainButton, fancyButton;

	public static void main(String args[]) {
		ButtonTest application = new ButtonTest();

		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public ButtonTest() {
		super("Testing Buttons");

		// get content pane and set its layout
		Container container = getContentPane();
		container.setLayout(new FlowLayout());

		// create buttons
		plainButton = new JButton("Plain Button");
		container.add(plainButton);

		Icon bug1 = new ImageIcon("keman.jpg");
		Icon bug2 = new ImageIcon("notalar.jpg");
		fancyButton = new JButton("Fancy Button", bug1);
		fancyButton.setRolloverIcon(bug2);
		container.add(fancyButton);

		// create an instance of inner class ButtonHandler
		// to use for button event handling
		ButtonHandler handler = new ButtonHandler();
		fancyButton.addActionListener(handler);
		plainButton.addActionListener(handler);

		setSize(1000, 1000);
		setVisible(true);
	}

	private class ButtonHandler implements ActionListener {

		// handle button event
		public void actionPerformed(ActionEvent event) {
			JOptionPane.showMessageDialog(null,
					"You pressed: " + event.getActionCommand());
		}

	}

}
