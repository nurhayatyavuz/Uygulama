package uygulama2;

import java.util.Scanner;

public class class2 {
	
	// a*x^2+b*x+c=0 denklemleminin k�k�n� bulan kod 
	public static void  main(String [] args) {
		int  a,b,c;
		int  x1;
		int  x2;
	   double  delta;
		Scanner scan=new Scanner(System.in);
		System.out.println("a de�i�kenin de�erini giriniz : ");
		a=scan.nextInt();
		System.out.println("b de�i�kenin de�erini giriniz : ");
		b=scan.nextInt();
	    System.out.println("c de�i�kenin de�erini giriniz : ");
	    c=scan.nextInt();
	    
	    delta =(b*b)-(4*a*c);
	    if(delta>0) {
	    	x1=(int)((-b)-Math.sqrt(delta)/(2*a));
	    	x2=(int)((-b)+Math.sqrt(delta)/(2*a));
	    	System.out.println("iki farkl� k�k� vard�r ");
	    	System.out.println("1.k�k "+x1+"2. k�k "+x2);
	    }
	    else if(delta ==0) {
	    	x1=(-b)/(2*a);
	    	System.out.println("tek k�k� vard�r "+x1);
	    }
	    else {
	    	System.out.println("reel k�k yoktur ");
	    	
	    }
	    	
	    	
	    		
	    		
	    	
	    	
	    
	    
	}

}
