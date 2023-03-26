import java.util.Scanner;

public class WhileÖrnekleri {

	public static void main(String[] args) {
		// Örnek 1: 1'den 100'e kadar çit sayıları ekrana yazdıran program
		// Örnek 2:Negatif bir değer girilene kadar kullanıcıdan girişleri kabul eden ve girilen
		// değerlerden tek sayıları toplayan program
		// Örnek 3:Girilen sayıya kadar olan 2'nin kuvvetleri
		
		/*  int i=1;
		while(i<=100) {
			if(i % 2==0) {
				System.out.println(i);
			}
			i++;
		}*/
		
		/*int toplam=0;
		Scanner sc =new Scanner(System.in);
        while(true) {
        	System.out.println("Lütfen bir sayı giriniz: ");
        	int i =sc.nextInt();
        	if(i<0) {
        	System.out.println("Negatif değer girdiniz döngü bitti");
        	System.out.println("Girilen tek sayılar toplamı: " +toplam);
        		break;
        	}
        	if(i % 2==1) {
        		toplam=toplam+i;
        	}
        } */
		
		int input;
		Scanner sc =new Scanner(System.in);
		System.out.println("Bir sayı giriniz: ");
		input=sc.nextInt();
		int k=1;
		while(k<=input) {
			System.out.println(k);
			k=k*2;
		}
		
		
	}

}
