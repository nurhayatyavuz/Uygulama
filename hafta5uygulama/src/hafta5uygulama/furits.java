package hafta5uygulama;

import java.util.ArrayList;

public class furits {

	public static void main(String[] args) {
		ArrayList<String> list =new ArrayList<String>();
		list.add("elma");
		list.add("muz");
		list.add("mandalina");
		
		System.out.println(list);
		for (String fruit:list) {
			System.out.println(fruit);
			
		}
	}

}
