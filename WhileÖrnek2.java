import java.util.Scanner;

public class WhileÖrnek2 {

	public static void main(String[] args) {
		//Örnek 1:Faktöriyel Hesaplama
		//Örnek 2:Harmonik sayılar
		//Örnek 3:Yıldızlar ile Üçgen Yapma
		//Örnek 4:Üslü sayı hesaplama
		
		/*Scanner sc =new Scanner(System.in);
		System.out.println("1.ÖRNEK");
		int f;
		System.out.println("Bir sayı giriniz: ");
		f=sc.nextInt();
		int sonuc=1;
		while(f > 0) {
			sonuc*=f;
			f--;	
		}
		System.out.println("Sonuç:"+sonuc);*/
		
		/*Scanner sc =new Scanner(System.in);
		System.out.println("Bir sayı giriniz: ");
		double h=sc.nextInt();
		double harmonic=0.0;
		while(h>0) {
			harmonic=harmonic + (1/h);
			h--;
			
		}
		System.out.println(harmonic);*/
		
		/*Scanner sc =new Scanner(System.in);
		System.out.println("Bir sayı giriniz: ");
		int star=sc.nextInt();
		int i=1;
		while(i<=star) {
			int k=1;
			while(k<=i) {
				System.out.print("*");
				k++;
			}
			System.out.println();
			i++;
		}*/
		
		Scanner sc =new Scanner(System.in);
		int sayı1,sayı2,sonuc=1;
		System.out.println("Üssü alınacak sayıyı giriniz: ");
		sayı1=sc.nextInt();
		System.out.println("Üs olacak sayıyı giriniz: ");
		sayı2=sc.nextInt();
		int i=1;
		while(i<=sayı2) {
			sonuc=sonuc*sayı1;
			i++;
		}
		System.out.println("Sonuç: "+sonuc);
		
	}

}
