package faktoriyel;

import java.util.Scanner;

public class faktoriyel_h {

	public static void main(String[] args) {
		// girilen sayinin faktoriyelini bulma 
		System.out.println("bir sayi girinz: ");
		Scanner scan=new Scanner(System.in) ;
		int sayi=scan.nextInt();
		int top=1;
		while (sayi>0) {
			 top=top*sayi;
			 sayi--;
			 
		}
		System.out.println("faktoriyel sonucu "+top);
		
		
	}

}
