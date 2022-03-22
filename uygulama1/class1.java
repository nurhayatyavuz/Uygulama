package uygulama1;

import java.util.Scanner;

public class class1 {
	public static void  main (String[] args) {
		
     Scanner scan=new Scanner(System.in);// veri alma bildirilir
	 String isim;// deðiþkeni tanýmladýk
	 System.out.println("isim griniz");
	 isim=scan.nextLine();// kullanýcýan veri alma komutunu 
	 int sayac = 0,uzunluk;// sayaç ve kelime uzunluðu
	 uzunluk=isim.length();// uzunluðu kelimenin uzunluðuna atar 
	 for(int i =0;i<uzunluk;i++) {
		 if (isim.charAt(i)=='a') {// isim deðiþkeninin içinde a harfini aratýr 
			 sayac++;// her a harfi için sayacý 1'er arttýrýr .
		 }
			
		 }
	 System.out.println(sayac+" tane a harfi var");// son olarak kaç tane a harfi bulduysa sayaç sayýsý kadar ekrana yazar 
			
		 
		
	 }
	
	 
	}

	
	
	
	 



