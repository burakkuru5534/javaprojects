import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import Ortalama.TextFieldHandler;

import javax.swing.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.File;




public class NotHesapla extends JFrame {

	public JTextField Dersler,Vize,Final,Ortalama;
	public JButton Hesapla;
	public JPanel uppanel, downpanel,buttonpanel,baslik;
	private JLabel DerslerLab,VizeLab,FinalLab,OrtalamaLab,Baslik;
	
	private final Font FONT = new Font("Calibri", Font.PLAIN, 21);
	
	public NotHesapla(){
		
		super("NotHesapla");
		
		
		uppanel= new JPanel();
		downpanel= new JPanel();
		buttonpanel=new JPanel();
		baslik=new JPanel();
		
		
		Container container= getContentPane();
		container.setLayout( new FlowLayout() );
		
	Baslik=new JLabel("Ögrenci Dersleri Ortalama Hesaplama");
	DerslerLab= new JLabel("Dersler");
	VizeLab= new JLabel("Vize Notu");
	FinalLab= new JLabel("Final Notu");
	OrtalamaLab= new JLabel("Ortalama");
	
	
	Dersler= new JTextField(8);
	Vize=new JTextField(8);
	Final = new JTextField(8);
	Ortalama = new JTextField(8);
	Ortalama.setEditable(false);
	
	Hesapla=new JButton("Hesapla");
	
	baslik.setBounds(200,20,190,30);
	uppanel.setBounds(50,60,500,30);
	downpanel.setBounds(50,100,500,30);
	buttonpanel.setBounds(50, 140,500, 30);
	
	container.setLayout(null);
	
	container.add(baslik);
	container.add(uppanel);
	container.add(downpanel);
	container.add(buttonpanel);
	
	baslik.add(Baslik);
	
	uppanel.add(DerslerLab);
	uppanel.add(VizeLab);
	uppanel.add(FinalLab);
	uppanel.add(OrtalamaLab);
	
	downpanel.add(Dersler);
	downpanel.add(Vize);
	downpanel.add(Final);
	downpanel.add(Ortalama);
	
	
	
	buttonpanel.add(Hesapla);
	
	uppanel.setBackground(Color.green);
	baslik.setBackground(Color.yellow);
	//downpanel.setBackground(Color.cyan);
	
	baslik.setLayout(new GridLayout(1,1,20,20));
	uppanel.setLayout(new GridLayout(1,1,20,20));
	downpanel.setLayout(new GridLayout(1,6,5,5));
	buttonpanel.setLayout(new GridLayout(1,3,50,50));
	
	 TextFieldHandler handler = new TextFieldHandler();
	 Dersler.addActionListener( handler );
	 Vize.addActionListener( handler );
	 Final.addActionListener( handler );
	 Ortalama.addActionListener( handler );
	 
	  
	  Hesapla.addActionListener(handler);
	  setSize(600,300);
	  setVisible(true);
	
	
	}
	
	
	public static void main(String[] args) {
		NotHesapla app = new NotHesapla();
		
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public class TextFieldHandler implements ActionListener{

		public void actionPerformed(ActionEvent a) {
		if(a.getActionCommand().equals("kaydet")){
			
String DerslerText,VizeText,FinalText,line,str_Ortalama;
			
			float OrtalamaText;
			int VizeNot,FinalNot;
			DerslerText=Dersler.getText();
			VizeText=Vize.getText();
			FinalText=Final.getText();
			
			
			VizeNot=Integer.parseInt(VizeText);
			FinalNot=Integer.parseInt(FinalText);
			
			
					
			OrtalamaText=(float) (((FinalNot*0.6)+(VizeNot*0.4)));
			str_Ortalama=String.valueOf(OrtalamaText);
			Ortalama.setText(str_Ortalama);    	
			
			line="\n"+DerslerText+", "+VizeText+", "+FinalText+", "+OrtalamaText+",";

try{
	File dosya=new File("C:\\Users\\packartbell\\Desktop\\ogrenciOrtalamasý.txt");
	FileWriter yazici= new FileWriter(dosya,true);
	BufferedWriter yaz=new BufferedWriter (yazici);
	
	yaz.write(line);
	yaz.close();
	System.out.println("Success !");
}
catch(Exception hata){
JOptionPane.showMessageDialog(null,hata.getMessage());
}
		}
		}
	}
}
