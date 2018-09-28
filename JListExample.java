import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
public class JListExample extends JFrame { 
	private JPanel contentPane;
	String[] listColorNames = { "black", "blue", "green", "yellow","white" };
	Color[] listColorValues = { Color.BLACK, Color.BLUE,Color.GREEN,Color.YELLOW, Color.WHITE};
public JListExample() { setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); setBounds(100, 100, 450, 300);
contentPane = new JPanel(); 
contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
setContentPane(contentPane); 
contentPane.setLayout(null); 
final JList list = new JList(listColorNames); 
list.addListSelectionListener(new ListSelectionListener() {
	public void valueChanged(ListSelectionEvent e) { contentPane.setBackground(listColorValues[list.getSelectedIndex()]);
} }); list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
list.setSelectedIndex(0); list.setBounds(109, 54, 144, 163);
contentPane.add(list); 
}



public static void main(String[] args) 
{ SwingUtilities.invokeLater(new Runnable() {
	public void run() { JListExample frame = new JListExample(); frame.setVisible(true);
	} });
}
}
