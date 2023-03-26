import java.util.Scanner;

public class BüyüktenKüçüğeSıralama {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
       int a,b,c;
       System.out.println("Sayıları giriniz");
       System.out.println("a sayısını giriniz: ");
       a=sc.nextInt();
       System.out.println("b sayısını giriniz: ");
       b=sc.nextInt();
       System.out.println("c sayısını giriniz");
       c=sc.nextInt();
       if((a>b)&&(a>c)) {
    	   if(b>c) {
    		   System.out.println("a>b>c");
    	   }
    	   else {
    		   System.out.println("a>c>b");
    	   }
       }
       else if((b>a)&&(b>c)) {
    	   if(a>c) {
    		   System.out.println("b>a>c");
    	   }
    	   else {
    		   System.out.println("b>c>a");
    	   }
       }
       else if((c>a)&&(c>b)) {
    	   if(a>b) {
    		   System.out.println("c>a>b");
    	   }
    	   else {
    		   System.out.println("c>b>a");
    	   }
       }
		
	}

}
