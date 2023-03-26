import java.util.Scanner;

public class FibonacciSerisi {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Bir Sayı Giriniz: ");
	int input=sc.nextInt();
	int s1=0;
	int s2=1;
	for(int i=1; i<input; i++) {
		System.out.println(s1 + ",");
		int toplam=s1+s2;
	    s1=s2;
	    s2=toplam;
		
	}
	}

}
