import java.util.Scanner;
import javax.swing.JOptionPane;








/*
 * insan class ýndan oluþturulan insan1,insan2,insan3 nesnelerine yönelik
 * yemek_yesin_mi , kos , vur , acikma , calisma , konus , yuru , oyna gibi
 * methodlar var. bu methodlarla bu Nesneler uzerýnden nesnelerin hareketlerini yönlendirme 
 * yapmaya calýsýyoruz.
 */


public class Insan {

    String ad;
	String soy_ad;
	String meslek;
	
	int yas;
	int maas;
	int boy;
    int kilo;
	private static int guc;
	static int acikma_durumu;
	private static Scanner scan;
    
    public Insan(String ad,String soy_ad,String meslek,int yas,int maas,int boy,int kilo){
    	
    	this.ad=ad;
    	this.soy_ad=soy_ad;
    	this.meslek=meslek;
    	this.yas=yas;
    	this.maas=maas;
    	this.boy=boy;
    	this.kilo=kilo;
    	
    	
    	
    }
    
    public Insan() {
		
	}

	public static void vur(Insan e1,Insan e2){
    	
    	System.out.println(e1.ad+"\tVurdu\t"+e2.ad+"\ta");
    
	}
    
    
    public static void enerji(Insan e1){
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Baslangýc Gücünü gir : ");
    	guc = scan.nextInt();
    	
    	if ( guc > 50)
    	
    	System.out.println(e1.ad+" Enerjisi: "+guc+"Yeterli Enerji var");	
    	else
    		System.out.println(e1.ad+" enerjisi az");
    	
    }
    
    
    public static void konus(Insan e1){
    	String ne_diyor;
    	Scanner scan = new Scanner(System.in);
    	System.out.println(e1.ad+"\tNe diyor?\n");
    	ne_diyor = scan.nextLine();
    	System.out.print(" diyor.");
    }
    
    public static void dusun(Insan e1){
    	Scanner scan = new Scanner(System.in);
    	String ne_dusunuyor;
    	
    	System.out.println(e1.ad+" ne düsünüyor?...\n");
        ne_dusunuyor = scan.nextLine();
        System.out.println(e1.ad+" "+ne_dusunuyor+" düsünüyor...");
    
    }
    
    public static void kos(Insan e1){
    	System.out.println(e1.ad+" kosuyor...");
    guc=guc-2;
    System.out.println(e1.ad+" gücü 2 azaldý. yeni guc : "+guc);
    
    }
    
    
    public static void yuru(Insan e1){
    	
    	if(guc>45)
    		
    
    	System.out.println(e1.ad+" yürüyor...");
        guc--;
    }
    
    public static void oyna(Insan e1){
    	if(guc>50)
    	System.out.println(e1.ad+" gereken enerji 50.enerjisi var.Enerjisi : "+guc+ " Ne Oynasýn?\nSecenekler\n1.Futbol\n2.Basketbol");
    	
    	
    	
    	Scanner scan = new Scanner(System.in);
    	
    	
    	int girdi;
    	girdi=scan.nextInt();
    	
    	if(girdi==1){
    		System.out.println(e1.ad+" Futbol oynuyor");
    	}
    	else if (girdi==2){
    		System.out.println(e1.ad+" Basketbol oynuyor");
    	}
    	
    	
    	
    	guc = guc-3;
    }
    
    
    public static void yemek_yesin_mi(Insan e1){
    	
    	 Scanner scan = new Scanner(System.in);
    		if(e1.kilo<70)
    	{System.out.println(e1.kilo+"kilodasýn.Yemek ye");
    	System.out.println("öneriler\n1.ot\n2.et\n3.ekmek");
    	int secenek;
    	secenek = scan.nextInt();
    	switch (secenek){
    	
    	case 1 : System.out.println("ot yedin.");
    	guc++;
    	System.out.println("guc kazandýn yeni guc:"+guc);
    	break;
    	
    	case 2 : System.out.println("et yedin");
    	guc=guc+5;
    	System.out.println("guc kazandýn yeni guc:"+guc);
    	break;
    	case 3 : System.out.println("ekmek yedin");
    	guc=guc+2;
    	System.out.println("guc kazandýn yeni guc: "+guc);
    	break;
    	}
    	}	
    		else 
    			System.out.println(e1.kilo+"kilodasýn.Yemek yeme.");
    	   
    }
    
    
    
	public static void acikma(Insan e1){
		Scanner scan = new Scanner(System.in);
		System.out.println(e1.ad+"aciktiysa 1 e bas");
		
		acikma_durumu=scan.nextInt();
		
		if(acikma_durumu == 1 )
		System.out.println(e1.ad+"acikti");
		else
			System.out.println(e1.ad+"Acikmadi");
	}
	
	public static void uzama(Insan e1){
		System.out.println(e1.ad+e1.boy+" boyundaydý. boyu uzadý...");
	e1.boy=e1.boy+1;
	System.out.println(e1.ad+" yeni boyu : "+e1.boy);
	}
	
	public static void calisma(Insan e1){
		
		System.out.println(e1.ad+" calýþýyor...");
		guc --;
	}
	
	public static void buyume(Insan e1){
		System.out.println(e1.ad+e1.yas+" yaþýndaydý. 1 yaþ büyüdü.");
		e1.yas = e1.yas+1;
		
		System.out.println(e1.ad+"yeni yaþý "+e1.yas+".");
	}
	
	public static void main (String args[]){
		
		
		Insan insan1 = new Insan("Burak ","Kuru ","Bilgisayar Mühendisi ",20,675,174,60);
		Insan insan2 = new Insan("Haktan Sefa","PASIN ","Ýletiþim Mühendisi ",20,400,190,90);
		Insan insan3 = new Insan("Yunus ","Minarlý ","Ýnþaat Mühendisi ",20,2750,190,62);
		
		acikma(insan1);
		yemek_yesin_mi(insan1);
		buyume(insan1);
		calisma(insan1);
		uzama(insan1);
		vur(insan1,insan2);
	} 
	
	
}
