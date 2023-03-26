import java.util.Scanner;

public class OgrenciOrtalamasıBulma {
	
        public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
       // System.out.println("İKİ SINAVIN ORTALAMASI");
		//int sınav1,sınav2;
		//System.out.println("1.sınavı giriniz: ");
		 //sınav1=input.nextInt();
		 //System.out.println("2.sınavı giriniz: ");
		// sınav2=input.nextInt();
		// double ortalama=(sınav1+sınav2)/2;
		//System.out.println("ortalama: "+ortalama);
		
		System.out.println("VİZE,FİNAL,ÖDEV ORTALAMASI");
		System.out.println("vize %25,final %60,ödev %15 etkili");
		int vize,odev,finall;
		System.out.println("Vize: ");
		vize =input.nextInt();
		System.out.println("Odev: ");
		odev =input.nextInt();
		System.out.println("Final: ");
		finall =input.nextInt();
		double unıversiteortalama=(vize*0.25+odev*0.15+finall*0.6);
		System.out.println("unıversiteortalama: "+unıversiteortalama);
		int ogrenci;
		System.out.println("ogrenci sayısını giriniz: ");
		ogrenci=input.nextInt();
		for(int i=1;i<=ogrenci; i++)
		{
			System.out.println(i+". öğrencinin ortalaması: ");
		}
		
		
	}

}
