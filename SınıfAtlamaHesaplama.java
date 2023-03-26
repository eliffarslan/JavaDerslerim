import java.util.Scanner;

public class SınıfAtlamaHesaplama {

	public static void main(String[] args) {
		//Türkçe ,Matematik,Fen bilgisi, Sosyal Bilgiler,Beden Eğitimi Ders Notlarına Göre Sınıf Atlama Hesaplaması
        //50'den yüksekse geçti alttaysa kaldı(ortalama)
		Scanner sc = new Scanner(System.in);
		double turkce,matematik,fenbilgisi,sosyalbilgiler,bedeneğitimi;
		System.out.println("Türkçe notunu giriniz: ");
		turkce=sc.nextDouble();
		System.out.println("Matematik notunu giriniz: ");
		matematik=sc.nextDouble();
		System.out.println("Fen Bilgisi notunu giriniz: ");
		fenbilgisi=sc.nextDouble();
		System.out.println("Sosyal Bilgiler notunu giriniz: ");
		sosyalbilgiler=sc.nextDouble();
		System.out.println("Beden Eğitimi notunu giriniz: ");
		bedeneğitimi=sc.nextDouble();
		/* if(turkce>50) {
			System.out.println("Türkçe dersinden geçtiniz");
		}
		else {
			System.out.println("Türkçe dersinden kaldınız");
		}
		
		if(matematik>50) {
			System.out.println("Matematik dersinden geçtiniz");
		}
		else {
			System.out.println("Matematik dersinden kaldınız");
		}
		
		if(fenbilgisi>50) {
			System.out.println("Fen bilgisi dersinden geçtiniz");
		}
		else {
			System.out.println("Fen Bilgisi dersinden kaldınız");
		}
		
		
		if(sosyalbilgiler>50) {
			System.out.println("Sosyal Bilgiler dersinden geçtiniz");
		}
		else {
			System.out.println("Sosyal Bilgiler dersinden kaldınız");
		}

		
		if(bedeneğitimi>50) {
			System.out.println("Beden Eğitimi dersinden geçtiniz");
		}
		else {
			System.out.println("Beden Eğitimi dersinden kaldınız");
		} */
		
		//eğer tüm derslerin ortalamasının 50 den yüksek olması yeterli ise aşağıdaki kod yeterlidir
		double ortalama=(matematik+turkce+sosyalbilgiler+fenbilgisi+bedeneğitimi)/5;
		if(ortalama>50) {
			System.out.println("Tebrikler sınıfı geçtiniz.Genel ortalamanız: " +ortalama);
		}
		else {
			System.out.println("Sınıfta kaldınız!Genel ortalamanız: " +ortalama);
		}
		
		
		
		
		
	}

}
