public class Ýntegral {

	public static void main(String[] args) {

		String a, b, c;
		int d, e, f;

		a = JOptionPane.showInputDialog("x'in kuvvetini giriniz : ");
		b = JOptionPane.showInputDialog("integralin alt sýnýrýný giriniz : ");
		c = JOptionPane.showInputDialog("integralin üst sýnýrýný giriniz : ");

		d = Integer.parseInt(a);
		e = Integer.parseInt(b);
		f = Integer.parseInt(c);
		fonksiyon(d, e, f);

	}

	static void fonksiyon(int x, int n, int a) {
		int temp1 = 1;
		int temp = 1, sonuc;
		for (int i = 0; i < n; i++) {
			temp = temp * x;
		}
		temp = temp / (n + 1);
		for (int i = 0; i < a; i++) {
			temp1 = temp1 * x;
		}
		temp1 = temp1 / (a + 1);

		sonuc = temp1 - temp;

		JOptionPane.showMessageDialog(null, "sonuc : " + sonuc);
	}

}
