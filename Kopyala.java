import java.io.*;

public class Kopyala {

	
	public static void main(String args[]) throws IOException
	{
		FileReader in = null;
		FileWriter out = null;
		
		try {
			
		in = new FileReader("C:\\Users\\crunc\\Desktop\\Burak\\Çalýþmalar\\JAVA ÇALIÞMALAR\\Kopyala\\input.txt");
		out = new FileWriter ("output.txt");
		int c;
		while ((c=in.read())!=1)
		
		{
			out.write(c);
		}
		}
	
	finally { 
		
		
		if (in !=null){
			
			in.close();
		}
		
if (out != null){
	
	out.close();
}
		
		
		
		
	}
	
	
	}
}
