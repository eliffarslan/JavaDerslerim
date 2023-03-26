import java.util.Scanner;

public class EtkinlikÖnerme {

	public static void main(String[] args) {
		// Hava sıcaklığını al.
		//sıcaklık 30 veya daha yüksekse yüzme etkinliği öner
		// 5 ve 30 arasında ise senema etkinliği öner
		// 4 ve altındaysa kayak etkinliği öner
		Scanner sc=new Scanner(System.in);
		System.out.println("Etkinlik Önerisi");
		int derece;
		System.out.println("Derece giriniz: ");
		derece=sc.nextInt();
		if(derece>=30) {
			System.out.println("Yüzme etkinliği yapabilirsiniz");
		}else if(derece>=5 && derece<=30) {
			System.out.println("Sinema etkinliği yapabilirsiniz");
		}else if(derece<=4) {
			System.out.println("Kayak etkinliği yapabilirsiniz");
		}

	}

}
