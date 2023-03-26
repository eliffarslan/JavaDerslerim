import java.util.Scanner;

public class Dairenin_Alanın_Bulduran_Program {

	public static void main(String[] args) {
		Scanner İnput = new Scanner(System.in);
		System.out.println("Dairenin Alanını,Çevresini,Hacmini Bulma Programı");
		System.out.println("Yarıçapı giriniz: ");
		double r= İnput.nextDouble();
		double pi=3.14;
		double DaireninAlanı=pi*r*r;
		System.out.println("Dairenin Alanı: "+DaireninAlanı);
		double DaireninCevresi=2*pi*r;
		System.out.println("Dairenin Çevresi: "+DaireninCevresi);
		double DaireninHacmi=r*r*r*pi*4/3;
		System.out.println("Dairenin Hacmi: "+DaireninHacmi);
		 System.out.println("KARŞILAŞTIRMA OPERATÖRLERİ");
		 int a=10;
		 int b=10;
		 boolean sonuc = a==b;
		 System.out.println(sonuc);
		 int c=23;
		 int k =41;
		 boolean hesap = c<=k;
		 System.out.println(hesap);
		 

	}

}
