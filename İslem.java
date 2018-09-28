import javax.swing.JOptionPane;



public class Ýslem {

	public static void main(String args[] ) {
		
		int x,y,z,sum,product,smallest,largest;
		float avarage;
		
		xVal = JOptionPane.showImputDialog( 
				"Enter first integer : ");
		yVal = JOptionPane.showImputDialog( 
				"Enter second integer : ");
		zVal = JOptionPane.showImputDialog( 
				"Enter third integer : ");
		
		x=Integer.parseInt(xVal);
		y=Integer.parseInt(yVal);
		z=Integer.parseInt(zVal);
		
		sum=x+y+x;
		product=x*y*z;
		avarage=(x+y+z)/3;
		//largest
		if(x>y){
			if(x>z){
				largest=x;
			}else{
				if(y>z){
					largest=y;
				}else{
					largest=z;
				}
			}
		};
		//smaller
		if(x<y){
			if(x<z){
				smallest=x;
			}else{
				if(y<z){
					smallest=y;
				}else{
					smallest=z;
				}
			}
		
			};
		
			
		JOptionPane.showMessageDialog(null,"sum : "+sum+"product : "+product+"avarage : "+avarage+"largest : "+largest+"smallest : "+smallest);
			
		System.exit(0);
		
	}

}
