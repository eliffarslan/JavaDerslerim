
public class MantiksalOperatörler {

	public static void main(String[] args) {
		System.out.println("VE BAĞLACI");
		int a=10;
		int b=7;
		int c=16;
		int d=31;
		boolean kosul1=(a<b);
		boolean kosul2=(c>d);
		boolean sonuc=(kosul1 && kosul2);
		boolean sonuc2=(a<b)&&(c<d);
		System.out.println(sonuc);
		System.out.println(sonuc2);
		System.out.println("VEYA BAĞlACI");
		int f=12;
		int g=23;
		int r=15;
		int h=5;
		boolean kosul3=(f<g);
		boolean kosul4=(r<h);
		boolean sonuc3=(kosul3||kosul4);
		System.out.println(sonuc3);
		boolean sonuc4=(f>g)||(r>h);
		System.out.println(sonuc4);
		System.out.println("DEĞiL BAĞLACI");
		int y=53;
		int x=90;
		int z=12;
		int p=34;
		boolean kosul5=y<x;
		boolean kosul6=z<p;
		boolean sonuc5=!(kosul5&&kosul6);
		boolean sonuc6=!(y>x&&z>p);
		System.out.println(sonuc5);
		System.out.println(sonuc6);
		

	}

}
