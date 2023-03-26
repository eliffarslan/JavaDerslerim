import java.util.Scanner;

public class BreakVeContinue {

	public static void main(String[] args) {
		// break döndüyü durdurur
		// contiune döngüyü durdurmaz ama bir sonraki adıma atlar
		//while(true) sonsuz döngüdür
	    Scanner scan=new Scanner(System.in);
	    System.out.println("Break komutu çalıştırıyoruz!");
	    int sayi;
	    while(true) {
	    	System.out.println("Bir sayı giriniz: ");
	    	sayi =scan.nextInt();
	    	if(sayi==0) {
	    		System.out.println("Döngü Bitti");
	    		break;
	    	}
	    	System.out.println(sayi);
	    }
	    System.out.println("Contiune komutunu çalıştırıyoruz!");
	    
	    for(int j=1; j<=9; j++) {
	    	if(j==3||j==6) {
	    		continue;
	    	}
	    	System.out.println("j= "+ j);
	    }
	    
	
	
	}

}
