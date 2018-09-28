import javax.swing.JOptionPane;

public class Calisma2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x,i=0;
String y ;

y = JOptionPane.showInputDialog(" x : ");
x = Integer.parseInt(y);

do {
	if ( x%2==0)
	{
		System.out.println(x + " = " + x*x);
	
	}
	else {
		System.out.println(x + " = " + x*x*x);
	}
	
} while (i<=x);
		
	i++;	
		
		
	}

}
