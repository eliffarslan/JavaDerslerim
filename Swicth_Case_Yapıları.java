import java.util.Scanner;

public class Swicth_Case_Yapıları {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Bir sayı giriniz: ");
		int sayı =sc.nextInt();
		switch(sayı) {
		case 6:
		System.out.println("Girilen sayı 6'dır");
		break;
		case 4:
		System.out.println("Girilen sayı 4'tür");
		break;
		default:
			System.out.println("Girilen sayı 6 veya 4 değildir");
		}
		
	}

}
