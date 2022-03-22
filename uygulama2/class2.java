package uygulama2;

import java.util.Scanner;

public class class2 {
	
	// a*x^2+b*x+c=0 denklemleminin kökünü bulan kod 
	public static void  main(String [] args) {
		int  a,b,c;
		int  x1;
		int  x2;
	   double  delta;
		Scanner scan=new Scanner(System.in);
		System.out.println("a deðiþkenin deðerini giriniz : ");
		a=scan.nextInt();
		System.out.println("b deðiþkenin deðerini giriniz : ");
		b=scan.nextInt();
	    System.out.println("c deðiþkenin deðerini giriniz : ");
	    c=scan.nextInt();
	    
	    delta =(b*b)-(4*a*c);
	    if(delta>0) {
	    	x1=(int)((-b)-Math.sqrt(delta)/(2*a));
	    	x2=(int)((-b)+Math.sqrt(delta)/(2*a));
	    	System.out.println("iki farklý kökü vardýr ");
	    	System.out.println("1.kök "+x1+"2. kök "+x2);
	    }
	    else if(delta ==0) {
	    	x1=(-b)/(2*a);
	    	System.out.println("tek kökü vardýr "+x1);
	    }
	    else {
	    	System.out.println("reel kök yoktur ");
	    	
	    }
	    	
	    	
	    		
	    		
	    	
	    	
	    
	    
	}

}
