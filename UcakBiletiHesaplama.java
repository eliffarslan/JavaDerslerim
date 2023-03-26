import java.util.Scanner;

public class UcakBiletiHesaplama {

	public static void main(String[] args) {
		//km birim fiyatı:0.10$
		//12 yaşından küçükse toplam fiyata %50 indirim
		//12 ve 24 yaş aralığında ise %10 indirim
		//65 yaşından büyükse %30indirim
		//Gidiş-Dönüş alırsa %20 indirim
		//Bu koşullara göre uçak bileti fiyatı hesaplayan program
		
		Scanner sc=new Scanner(System.in);
		int km,yas,tercih;
		System.out.println("Yaşınızı Girin");
		yas=sc.nextInt();
		System.out.println("Km'yi girin");
		km=sc.nextInt();
		System.out.println("Yolculuk tipini seçiniz.1-Tek gidiş veya dönüş 2-Gidiş-Dönüş");
		tercih=sc.nextInt();
		 double normalfiyat;
		 double yasIndırımı,tercihindirimi;
		 if(km > 0 && yas > 0 && (tercih == 1 || tercih == 2) ) {
		  normalfiyat=km*0.10;
			 if(yas<12) {
				 yasIndırımı=normalfiyat*0.5;
				 	  
			}else if(yas>=12&& yas<=24) {
				yasIndırımı=normalfiyat*0.2;
			
			}else if(yas>65) {
				yasIndırımı=normalfiyat*0.3;
			
			}else {
				yasIndırımı=0;	
			}
		    normalfiyat-=yasIndırımı;
			if(tercih==2) {
				 tercihindirimi=normalfiyat*0.2;
				 normalfiyat=(normalfiyat-tercihindirimi)*2;
			 }
			 System.out.println("Bilet Fiyatınız; "+normalfiyat);
		 }else {
			 System.out.println("Girdiğiniz değerler yanlış tekrar deneyiniz!");
		 }
		
		

	}

}
