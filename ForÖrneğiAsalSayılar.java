import java.util.Scanner;

public class ForÖrneğiAsalSayılar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int input;
		boolean asal=true;
		do {
			System.out.println("Bir sayı giriniz: ");
			input=sc.nextInt();
		}while(input<2); {
			for(int i=2; i<input; i++) {
				if(input %i==0) {
					asal=false;
					break;
				}
			}
			if(asal) {
				System.out.println("Girilen sayı: "+input +" asal sayıdır");
			}
			else {
				System.out.println("Girilen sayı: "+input+ " asal sayı değildir");
			}
		}
		
	}

}
