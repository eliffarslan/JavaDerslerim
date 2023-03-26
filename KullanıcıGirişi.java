import java.util.Scanner;

public class KullanıcıGirişi {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String kullanıcıadi,parola;
		System.out.println("Kullanıcı Adını Giriniz: ");
        kullanıcıadi=sc.nextLine();
        System.out.println("Parola Giriniz");
        parola=sc.nextLine();
        if(kullanıcıadi.equals("elif")&& parola.equals("333")) {
        System.out.println("Başarılı bir şekilde giriş yaptınız");
        }
        else {
        	System.out.println("Kullanıcı adı veya parola yanlış.Tekrar deneyiniz!");
        }
	}

}
