
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.File;

public class Ortalama extends JFrame {
	public JTextField numara,isim,soyisim,ders,vize,Final,ortalama;
	public JButton kaydet,yenile;
	public JPanel uppanel, downpanel,buttonpanel,baslik;
	private JLabel numLab, isLab, soyiLab,dersLab,vizeLab,FinalLab,ortLab,Baslik;

	private final Font FONT = new Font("Calibri", Font.PLAIN, 21);
		
		public Ortalama(){
			
			super("Ortalama");
			
			
			uppanel= new JPanel();
			downpanel= new JPanel();
			buttonpanel=new JPanel();
			baslik=new JPanel();
			
			
			Container container= getContentPane();
			container.setLayout( new FlowLayout() );
			
		Baslik=new JLabel("Ortalama Hesabý");
		numLab= new JLabel("Numara");
		isLab= new JLabel("Ýsim");
		soyiLab= new JLabel("Soyisim");
		dersLab= new JLabel("Ders");
		vizeLab= new JLabel("Vize");
		FinalLab= new JLabel("Final");
		ortLab= new JLabel("Ortalama");
		
		 
		
		numara= new JTextField(8);
		isim=new JTextField(8);
		soyisim = new JTextField(8);
		ders = new JTextField(8);
		vize = new JTextField(8);
		Final = new JTextField(8);
		ortalama= new JTextField(8);
		ortalama.setEditable(false);
		
		kaydet=new JButton("kaydet");
		
		yenile=new JButton("yenile");
		
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
		
		uppanel.add(numLab);
		uppanel.add(isLab);
		uppanel.add(soyiLab);
		uppanel.add(dersLab);
		uppanel.add(vizeLab);
		uppanel.add(FinalLab);
		uppanel.add(ortLab);
		
		
		downpanel.add(numara);
		downpanel.add(isim);
		downpanel.add(soyisim);
		downpanel.add(ders);
		downpanel.add(vize);
		downpanel.add(Final);
		downpanel.add(ortalama);
		
		
		buttonpanel.add(kaydet);
		
		buttonpanel.add(yenile);
		
		
		
		baslik.setLayout(new GridLayout(1,1,20,20));
		uppanel.setLayout(new GridLayout(1,1,20,20));
		downpanel.setLayout(new GridLayout(1,6,5,5));
		buttonpanel.setLayout(new GridLayout(1,3,50,50));
		
		
		
		 TextFieldHandler handler = new TextFieldHandler();
		 numara.addActionListener( handler );
		 isim.addActionListener( handler );
		 soyisim.addActionListener( handler );
		 ders.addActionListener( handler );
		 vize.addActionListener( handler );
		 Final.addActionListener( handler );
		 ortalama.addActionListener( handler );
		  
		  kaydet.addActionListener(handler);
		  
		  yenile.addActionListener(handler);
		  setSize(600,300);
		  setVisible(true);
		
		}	
	


	public static void main(String[] args) {
		Ortalama app = new Ortalama();
		
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
   

	public class TextFieldHandler implements ActionListener{

		public void actionPerformed(ActionEvent a) {
		if(a.getActionCommand().equals("kaydet")){
			
String numaraText,isimText,soyisimText,dersText,vizeText,FinalText,line,str_ortalama;
			
			float ortalamaText;
			int VizeNot,FinalNot;
			numaraText=numara.getText();
			isimText=isim.getText();
			soyisimText=soyisim.getText();
			dersText=ders.getText();
			vizeText=vize.getText();
			FinalText=Final.getText();
			
			
			VizeNot=Integer.parseInt(vizeText);
			FinalNot=Integer.parseInt(FinalText);
			
			
					
			ortalamaText=(float) (((FinalNot*0.6)+(VizeNot*0.4)));
			str_ortalama=String.valueOf(ortalamaText);
			ortalama.setText(str_ortalama);    	
			
			line="\n"+numaraText+", "+isimText+", "+soyisimText+", "+dersText+", "+vizeText+", "+FinalText+", "
							+ortalamaText+"\n";

try{
	File dosya=new File("ogrenciOrtalamasý.txt");
	FileWriter yazici= new FileWriter(dosya,true);
	BufferedWriter yaz=new BufferedWriter (yazici);
	
	yaz.write(line);
	yaz.newLine();
	yaz.close();
	System.out.println("Doðru !");
}
catch(Exception hata){
JOptionPane.showMessageDialog(null,hata.getMessage());
}
		}
		else if(a.getActionCommand().equals("Yenile"))
				{
			String space="";
			numara.setText(space);
			isim.setText(space);
			soyisim.setText(space);
			ders.setText(space);
			vize.setText(space);
			Final.setText(space);
			ortalama.setText(space);
		}
		
		
		}	//end of actionPerforme	
	}	//end of TextFieldHandler
}	//end of class
	


