import javax.swing.JOptionPane;
public class Ekleme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String ilk_Sayi;
String ikinci_Sayi;
int sayi1;
int sayi2;
int sonuc;

ilk_Sayi = 
JOptionPane.showInputDialog("ilk sayiyi gir ");
ikinci_Sayi =
JOptionPane.showInputDialog("ikinci sayiyi gir ");

sayi1 = Integer.parseInt(ilk_Sayi);
sayi2 = Integer.parseInt(ikinci_Sayi);
sonuc = sayi1 + sayi2;

JOptionPane.showMessageDialog(null,"Sonuc : "+ sonuc, "sonuclar",JOptionPane.PLAIN_MESSAGE);

System.exit(0);

	}

}
