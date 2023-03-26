import java.util.Scanner;

public class WhileVeDoWhile {

	public static void main(String[] args) {
		// do-while komutu döngünün dahili olmasada bir kez çalışması için bir komuttur örnektede j=10
		// while döngüsünde yoktu fakat biz j=10 u çalıştırdık
		/*int i=1;
		System.out.println("Döngü başladı!");
		while(i<=5) {
			System.out.println("i=" + i);
			i++;
		}
		System.out.println("Döngü bitti!");

		int j=10;
		do {
			System.out.println("j=" + j);
			j++;
		}while(j<=5);
		*/
		int input,toplam=0;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Bir sayı giriniz: ");
			input=sc.nextInt();
			if(input %2==0) {
				toplam+=input;
			}
		}while(input>0);
			System.out.println("çift sayıların toplamı: "+toplam);
	}

}
