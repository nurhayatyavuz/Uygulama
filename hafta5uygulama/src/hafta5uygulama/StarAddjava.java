package hafta5uygulama;

import java.util.ArrayList;

public class StarAddjava {

	public static void main(String[] args) {
		ArrayList<String> words =new ArrayList<String>();
		words.add("kalem");
		words.add("defter");
		words.add("kitap");
		words.add("Bartýn");
		words.add("Ankara");
		System.out.println("dongu oncesi: "+words);
		System.out.println("liste uzunlugu "+words.size());
		
		for (int index=0;index < words.size();index+=2) {
			words.add(index,"*");
			}
		System.out.println("dongu sonrasi: "+words);
		System.out.println("liste uzunlugu "+words.size());
		for (int index=0;index < words.size();index++) {
			words.remove(index);
		}
		System.out.println("silme sonrasi: "+words);
		System.out.println("silme liste uzunluðu: "+words.size());
		
	}

}
