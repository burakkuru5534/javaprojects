import java.applet.Applet;
import java.awt.Graphics;
import javax.swing.JOptionPane;
public class s�n�fnotort extends Applet {
    public int DiziBoyutu;
    public String[] Ogrenci;
    public int[] Not;
    public int Toplam=0;
        public void init() {
    DiziBoyutu=Integer.parseInt(JOptionPane.showInputDialog("��renci Say�s�"));
        Ogrenci=new String[this.DiziBoyutu];
        Not=new int[this.DiziBoyutu];
        for(int i=0; i<this.Ogrenci.length; i++){
            Ogrenci[i]=JOptionPane.showInputDialog((i+1)+". ��rencinin �smi");
            Not[i]=Integer.parseInt(JOptionPane.showInputDialog((i+1)+". ��rencinin Notu"));
            Toplam+=Not[i];
        }
    }
    public void paint(Graphics Ekran){
int Yekseni=0;
                for(int i=0; i<Ogrenci.length; i++){
            Yekseni=(i*20)+40;
            Ekran.drawString(Ogrenci[i], 100, Yekseni);
            Ekran.drawString(Integer.toString(Not[i]), 200, Yekseni);
        }

        Ekran.drawString(Not.length + " ��renci i�in Ortalama :" + (Toplam/Not.length), 100, Yekseni+40); 
    }
}