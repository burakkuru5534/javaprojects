import java.util.*;

public class Donguler {
	
	    public static void main(String[ ] args){
	   
	    	int sayi;
	    	 Scanner scan = new Scanner(System.in);
	    	 System.out.print("Sayi gir  : ");
	   sayi = scan.nextInt();
	   for(int i = 0;i<=sayi;i++) {
	    for(int k=0;k<sayi-i;k++){
	     System.out.print(" "); } 
		   
	    	 for (int j=0;j<2*i-1;j++)
	    	 {	 System.out.print("*");}
	    	 System.out.println();
	     }
	    }}  

	    
		







