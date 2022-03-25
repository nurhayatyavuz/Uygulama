package ugulama3;
import java.util.Scanner;

public class class2 {
	        Scanner scan=new Scanner(System.in);
			int a,b;
			int islem;
			System.out.println("a sayisini giriniz: ");
			a=scan.nextInt();
			System.out.println("b sayisini girinz: ");
			b=scan.nextInt();
			
			System.out.println("toplama 1" );
			System.out.println("cikarma 2");
			System.out.println("carpma 3");
			System.out.println("bolme 4");
			
			System.out.println("bir islem seciniz: ");
			islem=scan.nextInt();
			
			switch(islem) {
			case 1:
			System.out.println(a+b);
			break;
			case 2:
				System.out.println(a-b);
				break;
			case 3:
				System.out.println(a*b);
				break;
			case 4:
				System.out.println(a/b);
			break;
			default:
				System.out.println("Lutfen gecerli bir islem seciniz ");
				break;
				
				
			
			}
			
		}

	}


}
