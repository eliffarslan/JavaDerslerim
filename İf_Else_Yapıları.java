
public class İf_Else_Yapıları {

	public static void main(String[] args) {
		/*int a=20;
		int b=20;
		if(a==b) { 
			System.out.println("a sayısı b sayısına eşittir");
		} 
		int c=45;
		int d=56;
		if(c==d) {
			System.out.println("c sayısı d sayısına eşittir");
		}
		else {
			System.out.println("c sayısı d sayısına eşit değildir");
		} 
		int x=16;
		int y=23;
		if((x<=y)&&(x>=y)) {
			System.out.println("x ve y sayısı eşittir");
		}
		else {
			System.out.println("x ve y sayısı eşit değildir");
		} */
		int p=34;
		int g=45;
		int k=56;
		if(p==g) {
			if(g>=k) {
				System.out.println("g en büyük sayıdır");
			}
			else {
				System.out.println("k en büyük sayıdır");
			}
		}
		else {
			if(p>g) {
		        System.out.println("p sayısı g sayısından büyüktür");
			}
			else {
				System.out.println("g sayısı p sayısından büyüktür");
			}
		}
       if(g>k) {
    	   System.out.println("g sayısı en büyük sayıdır");
       }
       else {
    	   System.out.println("k sayısı en büyük sayıdır");
       }
	}

}
