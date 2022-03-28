package mantýksail;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class manitksal {

	public static void main(String[] args) {
		// txt dosyasini olustuma
		PrintWriter cikti=null;
		String dosya ="ornek.txt";
		try {
			cikti=new PrintWriter( new FileOutputStream(dosya));
			
		}
		catch (FileNotFoundException hata)
				{
			System.out.println("ornek.txt dosyasi");
			System.out.println("hata olustu");
			System.exit(0);
		}
		System.out.println("bir cumle griniz");
		Scanner klavye=new Scanner(System.in);
		String cumle =klavye.nextLine();
		cikti.println("klavyeden alinan cumle : "+cumle );
		cikti.println("dosya kapatilabilir.");
		cikti.close ();
		System.out.println("girilen cumle ornek.txt dosyasina yazildi.");

	}

}
