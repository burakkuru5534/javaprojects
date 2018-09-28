import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileStream {

	
	public static void main ( String args[]){
		
		
		
		
		try {
			
			byte bwhite [] = {11,21,3,4,0,5	};
			
			
			OutputStream os = new FileOutputStream ( "C:\\Users\\crunc\\Desktop\\Burak\\Çalýþmalar\\JAVA ÇALIÞMALAR\\Kopyala\\input.txt");
			
			for ( int x = 0;x<bwhite.length;x++){
				os.write(bwhite[x]);
				
			}
			os.close();
			
			
			
			InputStream is = new FileInputStream ( "test.txt");
			
			int size = is.available();
			
			for ( int i = 0;i<size;i++)
			{
				System.out.print(is.read());
			}
			
			is.close();
			
			
		} catch (IOException e) {
			System.out.print("Exception");
		}
		
		
		
		
		
	}
	
	
	
	
}
