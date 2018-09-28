package filekontrol;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileControl {
	public static void main(String[] args) throws IOException { /*
																 * Normalde
																 * try-catch
																 * kullan�labilir
																 * ama e�er
																 * throw
																 * IOException
																 * kullan�rsan�z
																 * gerek kalmaz
																 * s�navda
																 * try-catch
																 * kullanmam�z
																 * istenebilir.
																 * throw k�sm�n�
																 * silerseniz
																 * file
																 * komutlar�n�n
																 * alt� k�rm�z�
																 * �izilecek
																 * oradan
																 * try-catch
																 * ekleyebilirsiniz
																 * .
																 */

		File inFile = new File(System.getProperty("user.dir"),
				"OkunanDosya.txt"); // Kullan�c� workspace inin alt�nda bulunan
									// OkunanDosya.txt
		FileReader okuyan = new FileReader(inFile); // Okumak i�in FileReader
													// nesnesi olu�turuyoruz.
		BufferedReader OkunanDosya = new BufferedReader(okuyan); // Dosyay�
																	// okumak(read)
																	// i�in
																	// ayarl�yor.

		File outFile = new File(System.getProperty("user.dir"),
				"YazilanDosya.txt"); // Kullan�c� workspace inin alt�nda bulunan
										// YazilanDosya.txt
		FileWriter yazan = null; // Direk yazma yada ekleme olaca��n�
									// bilmedi�imiz i�in null olarak FileWriter
									// nesenesi olu�turuyoruz.
		if (!outFile.exists()) { // YazilanDosya.txt yoksa olu�turuyor.
			outFile.createNewFile();
			yazan = new FileWriter(outFile); // E�er dosya yoksa yazmak i�in
												// ayarlan�yor.
		} else {
			yazan = new FileWriter(outFile, true); // E�er dosya varsa sonuna
													// ekleme olaca��n�
													// belirtmek i�in
													// (outFile,true) true
													// parametresini ekliyoruz.
		}
		// E�er yukar�da yazma yada ekleme olaca��n� belirtmezsek dosya her
		// seferinde silinip �zerine yenisi yaz�l�r. �sterseniz true
		// parametresini silin deneyin.
		BufferedWriter YazilanDosya = new BufferedWriter(yazan); // Dosyay�
																	// yazmak(write)
																	// i�in
																	// ayarl�yor.
		String OkuSatir;
		while ((OkuSatir = OkunanDosya.readLine()) != null) {

			YazilanDosya.append(OkuSatir);// Okunan her sat�r append(ekleme)
											// komutuyla ekleniyor. Dosya bo�
											// olsa dahi ekleme komutu ilk
											// sat�r� ekliyor.
			YazilanDosya.append(System.lineSeparator());// Sat�r String olarak
														// okundu�u i�in \n (bir
														// alt sat�ra ge�me)
														// i�lemi yap�lam�yor
														// lineSeparator()
														// fonksiyonu bu i�e
														// yar�yor.

		}
		// Son olarak dosyalar close fonksiyonu ile kapat�l�r ki haf�zada yer
		// kaplamas�nlar.
		YazilanDosya.close();
		OkunanDosya.close();

	}

}