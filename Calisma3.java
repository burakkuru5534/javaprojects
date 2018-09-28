import javax.swing.JOptionPane;

public class Calisma3 {
 public static int kareal(int a ){
	return a*a;
	}
 public static  int kupal(int b ){
	return b*b*b;
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x;
String s ;

s = JOptionPane.showInputDialog(" x : ");
x = Integer.parseInt(s);

for(int i=0;i<=x;i++){
	if (x%2==0){
		System.out.println(kareal(i));
	}
		else {
			System.out.println(kupal(i));
		}

	}
}
}


