
public class reverseNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 123;
		int y = 0 ;
		int z = 0 ;
		
		while(x > 0) {
			
			y = x%10;
			z = z*10+y;
			x = x/10;
		}
		System.out.println("New No - >"+ z);

	}

}
