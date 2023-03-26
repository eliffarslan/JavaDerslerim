import java.util.Scanner;

public class HesapMakinesi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("HESAP MAKİNESİ");
		double sayı1,sayı2,işlem;
		System.out.println("Birinci sayıyı giriniz: ");
		sayı1 =sc.nextInt();
		System.out.println("İkinci sayıyı giriniz: ");
		sayı2 =sc.nextInt();
		System.out.println("İşlem Seçiniz");
		System.out.println("1-Toplama\n 2-Çıkarma\n 3-Bölme\n 4-Çarpma\n"); 
		işlem =sc.nextInt();
		if(işlem==1) {
			double toplam = sayı1 + sayı2;
			System.out.println("Toplam: "+ toplam);
		}
		else if(işlem==2){
			double cıkarma=sayı1-sayı2;
			System.out.println("Çıkarma: "+cıkarma);
		}
		else if(işlem==3){
			double bölme=sayı1/sayı2;
			System.out.println("Bölme: "+ bölme);
		}
		else if(işlem==4){
			double carpma=sayı1*sayı2;
			System.out.println("Çarpma: "+carpma);
		}
		else if(işlem>=5) {
			System.out.println("lütfen 1 ile 4 arasında bir sayı seçiniz");
		}
		else if(işlem<=0) {
			System.out.println("Lütfen 1 ile 4 arasında bir sayı giriniz");
		}
		

	}

}
