import java.util.Scanner;

public class Futbolcu extends Insan {

	String top = "O";
	String oyuncu;
	String kale;
	String ad,soy_ad;
	static String yetenek;
	String oynadigi_takim;
	int forma_no,boy,kilo;
	
	
	Futbolcu(){
		
	}
	Futbolcu(String ad,String Soy_Ad,String yetenek,String oynadigi_takim,int forma_no,int boy,int kilo){
		
		this.ad=ad;
		this.soy_ad=soy_ad;
		this.yetenek=yetenek;
		this.oynadigi_takim=oynadigi_takim;
		this.forma_no=forma_no;
		this.boy=boy;
		this.kilo=kilo;
		
	}
	
	Futbolcu futbolcu_1 = new Futbolcu("Cristiano","Ronaldo","Yüksek Yetenek","Real Madrid",7,188,85);
	
	

	public static void kalite(String s1,String s2){
		
		
		if(s1.equals(s2)){
			
			System.out.println(s1);
			
			
		}
		
		
		
	
		
		
	}
	
	public static void main(String args[]){
		System.out.println("Oyuncunun adýný girin.");
		Scanner scan = new Scanner(System.in);

		yetenek = scan.nextLine();
		
		kalite("Yüksek Kalite",yetenek);
	
	
	}
	
	
}
	
	
	
	
	
	
	
	
	
	

