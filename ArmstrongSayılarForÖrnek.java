
public class ArmstrongSayılarForÖrnek {

	public static void main(String[] args) {
		int onlar,birler,yüzler,toplam,temp;
		for(int i=100; i<999; i++) {
			temp=i;
			birler=temp % 10;
			temp/=10;
			onlar=temp % 10;
			temp/=10;
			yüzler=temp % 10;
			temp/=10;
			toplam=(birler*birler*birler+onlar*onlar*onlar+yüzler*yüzler*yüzler);
		
		if(toplam==i) {
			System.out.println(i + " = Bir armstrong sayıdır.");
		}
	  }
	}

}
