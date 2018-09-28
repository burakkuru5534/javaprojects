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
																 * kullanýlabilir
																 * ama eðer
																 * throw
																 * IOException
																 * kullanýrsanýz
																 * gerek kalmaz
																 * sýnavda
																 * try-catch
																 * kullanmamýz
																 * istenebilir.
																 * throw kýsmýný
																 * silerseniz
																 * file
																 * komutlarýnýn
																 * altý kýrmýzý
																 * çizilecek
																 * oradan
																 * try-catch
																 * ekleyebilirsiniz
																 * .
																 */

		File inFile = new File(System.getProperty("user.dir"),
				"OkunanDosya.txt"); // Kullanýcý workspace inin altýnda bulunan
									// OkunanDosya.txt
		FileReader okuyan = new FileReader(inFile); // Okumak için FileReader
													// nesnesi oluþturuyoruz.
		BufferedReader OkunanDosya = new BufferedReader(okuyan); // Dosyayý
																	// okumak(read)
																	// için
																	// ayarlýyor.

		File outFile = new File(System.getProperty("user.dir"),
				"YazilanDosya.txt"); // Kullanýcý workspace inin altýnda bulunan
										// YazilanDosya.txt
		FileWriter yazan = null; // Direk yazma yada ekleme olacaðýný
									// bilmediðimiz için null olarak FileWriter
									// nesenesi oluþturuyoruz.
		if (!outFile.exists()) { // YazilanDosya.txt yoksa oluþturuyor.
			outFile.createNewFile();
			yazan = new FileWriter(outFile); // Eðer dosya yoksa yazmak için
												// ayarlanýyor.
		} else {
			yazan = new FileWriter(outFile, true); // Eðer dosya varsa sonuna
													// ekleme olacaðýný
													// belirtmek için
													// (outFile,true) true
													// parametresini ekliyoruz.
		}
		// Eðer yukarýda yazma yada ekleme olacaðýný belirtmezsek dosya her
		// seferinde silinip üzerine yenisi yazýlýr. Ýsterseniz true
		// parametresini silin deneyin.
		BufferedWriter YazilanDosya = new BufferedWriter(yazan); // Dosyayý
																	// yazmak(write)
																	// için
																	// ayarlýyor.
		String OkuSatir;
		while ((OkuSatir = OkunanDosya.readLine()) != null) {

			YazilanDosya.append(OkuSatir);// Okunan her satýr append(ekleme)
											// komutuyla ekleniyor. Dosya boþ
											// olsa dahi ekleme komutu ilk
											// satýrý ekliyor.
			YazilanDosya.append(System.lineSeparator());// Satýr String olarak
														// okunduðu için \n (bir
														// alt satýra geçme)
														// iþlemi yapýlamýyor
														// lineSeparator()
														// fonksiyonu bu iþe
														// yarýyor.

		}
		// Son olarak dosyalar close fonksiyonu ile kapatýlýr ki hafýzada yer
		// kaplamasýnlar.
		YazilanDosya.close();
		OkunanDosya.close();

	}

}