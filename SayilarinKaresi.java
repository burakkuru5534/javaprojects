import java.awt.Container;
import javax.swing.*;

public class  SayilarinKaresi  extends JApplet {

	public void init () {
		
		
		JTextArea  ciktialani = new JTextArea();
		
		Container kutu = getContentPane();
		
		kutu.add(ciktialani);
		
		int sonuc ;
		
		String cikti= "" ;
		
		for (int sayac=1;sayac<=10;sayac++ ){
			
			sonuc = kareal(sayac);
			
			cikti+=sayac+"  karesi\t"+ sonuc+"\n";
			
		} // end for

		ciktialani.setText(cikti);

		
	} // end init

	public int kareal (int y){
		
		return y*y;
	} // end of method
	
	
	
}// end of class
