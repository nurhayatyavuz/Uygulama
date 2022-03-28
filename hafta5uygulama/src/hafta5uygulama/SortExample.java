package hafta5uygulama;

import java.util.ArrayList;
import java.util.Collections;

public class SortExample {

	public static void main(String[] args) {
		ArrayList<String> words =new ArrayList<String>();
		words.add("kalem");
		words.add("defter");
		words.add("kitap");
		words.add("Bartýn");
		words.add("Ankara");
		
		System.out.println("siralamdan once : "+words);
		System.out.println(words.get(0));//a-z ye sýralama komutu 
		Collections.sort(words);
		System.out.println("siralamadan sonra : "+words);
		
		

	}

}
