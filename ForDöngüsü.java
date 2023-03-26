
public class ForDöngüsü {

	public static void main(String[] args) {
		
    for(int i=1; i<=10; i++) {
    	System.out.println("For döngüsü: "+ i +".sayıda"); 	
    }
    
    for(int x=1; x<=10; x++) {
    	for(int y=1; y<=5; y++) {
    		System.out.println(x +"," + y);
    	}
    }
    for(int k=1; k<=10; k++) {
    	for(int p=1; p<=10; p++) {
    		for(int h=1; h<=10; h++) {
    			for(int m=1; m<=10;m++) {
    				System.out.println(k + "," + p);
    				System.out.println(h + "," + m);
    				
    			}
    		}
    	}
    }
	}

}
