
public class fibonnaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 10;
		fibon(n);

	}
	
	public static int fibon(int n) {
		int sum = 0;
		if (n == 0 || n ==1) 
		 return 1;
		
		else {
			for(int i= 2;i<n;i++ ) {
			
			sum	= fibon(i-1) + fibon(i-2);
			System.out.print(sum + ",");
			}
			
			}
		return sum;
	}

}
