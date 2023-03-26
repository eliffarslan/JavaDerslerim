import java.util.Scanner;

public class ATM_Kodlama {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int input,miktar,bakiye=1000;
		System.out.println("ArslanBank'a Hoşgeldiniz...");
		System.out.println("Güncel Bakiyeniz: "+bakiye+"TL'dir");
		while(bakiye>0) {
			System.out.println();
			System.out.println("1-)Para yatır.");
			System.out.println("2-)Para çek.");
			System.out.println("3-)Bakiye sorgula.");
			System.out.println("4-)Çıkış Yap.");
			System.out.println("Yapmak istediğiniz işlemi seçiniz.");
			input=scan.nextInt();
			if(input==1) {
				System.out.println("Lütfen yatırmak istediğiniz para miktarını giriniz!");
				miktar=scan.nextInt();
				bakiye=bakiye+miktar;
				System.out.println("Güncel Bakiyeniz: "+bakiye);
			}
			else if(input==2) {
				System.out.println("Lütfen çekmek istediğiniz para miktarını giriniz!");
				miktar=scan.nextInt();
				      if(miktar>bakiye) {
					  System.out.println("Bakiyeniz yetersiz tekrar deneyin!");
				      }
				      else {
				      bakiye=bakiye-miktar;
				      System.out.println("Kalan Bakiyeniz: "+bakiye);
				      }
			}
			else if(input==3) {
				System.out.println("Mevcut Bakiyeniz: "+bakiye);
			}
			else if(input==4) {
				System.out.println("Çıkış yaptınız!");
			}
			else {
				System.out.println("Geçersiz işlem girişi yaptınız!");
			}
			break;
		}
		System.out.println("Tekrar bekleriz.");
	}

}
