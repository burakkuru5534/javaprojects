public class DiziErisim {
	public void calis() {
		int sayilar[] = { 1, 2, 3, 4 };
		for (int i = 0; i < 5; i++) {
			try {
				System.out.println("--> " + sayilar[i]);
			} catch (ArrayIndexOutOfBoundsException ex) {
				System.out.println("Hata Olustu " + ex);
			}
		} // for
	}

	public static void main(String args[]) {
		System.out.println("Basla");
		DiziErisim de2 = new DiziErisim();
		de2.calis();
		System.out.println("Bitti");
	}
}