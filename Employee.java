
public class Employee {

String isim ;
int yas;
int maas;
String bolum;

public Employee (){
	
	
}// end of constructor 1

public Employee (String isim,int yas,int maas,String bolum)
{
	
	this.isim=isim;
	this.yas=yas;
	this.maas=maas;
    this.bolum=bolum;
	
}//end of constructor 2

public void setisim(String isim){
	System.out.println(" ");
	this.isim=isim;
	
}//end of setter_isim

public String getisim (){
	return isim;
	
}//end of getter_isim

public void setYas(int yas){
	System.out.println(" ");
	this.yas=yas;
	
	
}//end of setter_yas

public int getYas(){
	
	return yas;
	
	
}//end of getter_yas

public void setMaas(int maas){
	
	System.out.println(" ");
	this.maas=maas;
	
}//end of setter_maas

public int getMaas(){
	
	return maas;
	
}//end of getter_maas

public void setbolum(String bolum){
	System.out.println(" ");
	this.bolum=bolum;
	
}//end of setbolum

public String getbolum(){
	
	return bolum;
	
	
}

public static void main(String args[]){
	
	Employee kisi_1 = new Employee("Burak KURU\t",20,2000,"\tBilgisayar");
	Employee kisi_2 = new Employee("Burak OZCELIK\t",20,1500,"\tBilgisayar");
	Employee kisi_3 = new Employee("Serkan ÝNCÝ\t",26,4000,"\tYazýlým");
	


	
	
	kisi_1.setMaas(12000);
	kisi_2.setMaas(50000);
	kisi_3.setMaas(54000);
	
	
	
	
	
	
	
	
	
	
kisi_1.getisim();
kisi_1.getYas();
kisi_1.getMaas();
kisi_1.getbolum();


kisi_2.getisim();
kisi_2.getYas();
kisi_2.getMaas();
kisi_2.getbolum();	


kisi_3.getisim();
kisi_3.getYas();
kisi_3.getMaas();
kisi_3.getbolum();

System.out.println(kisi_1.isim+kisi_1.yas+kisi_1.maas+kisi_1.bolum);
System.out.println(kisi_2.isim+kisi_2.yas+kisi_2.maas+kisi_2.bolum);
System.out.println(kisi_3.isim+kisi_3.yas+kisi_3.maas+kisi_3.bolum);
}

}//end of class
