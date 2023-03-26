import java.util.Scanner;

public class KDV_Hesaplayan_Program {

	public static void main(String[] args) {
		double tutar, kdvlifiyat,kdv=0.18;
		Scanner input = new Scanner(System.in);
		tutar =input.nextDouble();
		kdvlifiyat = tutar +(tutar*kdv);
		System.out.println("ürünün KDV'li Fiyat: "+kdvlifiyat);
		

	}

}
