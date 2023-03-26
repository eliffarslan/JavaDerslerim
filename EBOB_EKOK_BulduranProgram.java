import java.util.Scanner;

public class EBOB_EKOK_BulduranProgram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sayı1,sayı2,ekok,ebob=1;
		System.out.println("1.sayıyı giriniz: ");
		sayı1=sc.nextInt();
		System.out.println("2.sayıyı giriniz: ");
		sayı2=sc.nextInt();
		int min=(sayı1<sayı2)? sayı1:sayı2;
		for(int i=min; i>0; i--) {
			if((sayı1%i==0)&&(sayı2%i==0)){
				ebob=i;
				break;
			}
		}
		ekok=(sayı1*sayı2)/ebob;
		System.out.println("Girilen sayıların EBOB'u: "+ebob);
		System.out.println("Girilen sayının EKOK'u: "+ekok);
	}

}
