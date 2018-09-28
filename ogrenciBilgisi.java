package veritabani;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class ogrenciBilgisi {

	public static void main(String[] args) {

		BufferedReader bufferReader = null;
		BufferedReader bufferReader1 = null;
		BufferedReader bufferReader2 = null;
		BufferedWriter bufferWriter = null;
		BufferedWriter bufferWriter1 = null;
		BufferedWriter bufferWriter2 = null;
		try {

			bufferReader = new BufferedReader(new FileReader(
					"C:\\oo\\isim-soyisim.txt")); // file.txt dosyasýdan okuma
													// yapýyoruz
			bufferReader1 = new BufferedReader(new FileReader(
					"C:\\oo\\tarih.txt")); // file.txt dosyasýdan okuma
											// yapýyoruz
			bufferReader2 = new BufferedReader(new FileReader(
					"C:\\oo\\numara.txt")); // file.txt dosyasýdan okuma
											// yapýyoruz

			String satir = bufferReader.readLine();
			String satir1 = bufferReader1.readLine();
			String satir2 = bufferReader2.readLine();

			String outFile = "C:\\oo\\isim-soyisim.txt"; // fileOut.txt
															// dosyasýna
															// birþeyler
															// yazýdýrýyoruz
			String outFile1 = "C:\\oo\\tarih.txt"; // fileOut.txt dosyasýna
													// birþeyler yazýdýrýyoruz
			String outFile2 = "C:\\oo\\numara.txt"; // fileOut.txt dosyasýna
													// birþeyler yazýdýrýyoruz

			bufferWriter = new BufferedWriter(new FileWriter(outFile));
			bufferWriter1 = new BufferedWriter(new FileWriter(outFile1));
			bufferWriter2 = new BufferedWriter(new FileWriter(outFile2));

			while (satir != null) {
				System.out.println("isim soyisim : " + satir);
				bufferWriter.write(satir + "\n");
				satir = bufferReader.readLine();
			}
			while (satir1 != null) {
				System.out.println("tarih : " + satir1);
				bufferWriter1.write(satir1 + "\n");
				satir1 = bufferReader1.readLine();
			}
			while (satir2 != null) {
				System.out.println("numara : " + satir2);
				bufferWriter2.write(satir2 + "\n");
				satir2 = bufferReader2.readLine();
			}

			// okuma ve yazma iþlemlerinden sonra dosyalarý kapatýyoruz
			bufferWriter.close();
			bufferReader.close();
			bufferWriter1.close();
			bufferReader1.close();
			bufferWriter2.close();
			bufferReader2.close();

		} catch (Exception e) {
			try {
				bufferWriter.close();
				bufferReader.close();
				bufferWriter1.close();
				bufferReader1.close();
				bufferWriter2.close();
				bufferReader2.close();
			} catch (Exception e1) {
				System.out.println(e1.getMessage());
			}
		}

	}

}
