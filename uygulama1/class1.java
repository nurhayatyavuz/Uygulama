package uygulama1;

import java.util.Scanner;

public class class1 {
	public static void  main (String[] args) {
		
     Scanner scan=new Scanner(System.in);// veri alma bildirilir
	 String isim;// de�i�keni tan�mlad�k
	 System.out.println("isim griniz");
	 isim=scan.nextLine();// kullan�c�an veri alma komutunu 
	 int sayac = 0,uzunluk;// saya� ve kelime uzunlu�u
	 uzunluk=isim.length();// uzunlu�u kelimenin uzunlu�una atar 
	 for(int i =0;i<uzunluk;i++) {
		 if (isim.charAt(i)=='a') {// isim de�i�keninin i�inde a harfini arat�r 
			 sayac++;// her a harfi i�in sayac� 1'er artt�r�r .
		 }
			
		 }
	 System.out.println(sayac+" tane a harfi var");// son olarak ka� tane a harfi bulduysa saya� say�s� kadar ekrana yazar 
			
		 
		
	 }
	
	 
	}

	
	
	
	 



