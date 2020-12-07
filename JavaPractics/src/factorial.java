
public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 4;
		int result = fact(n);
		System.out.println("Fact No ->"+ result);

	}
	
	public static int fact(int n) {
		if(n == 0 )
			return 0;
		if (n==1)
			return 1;
		else
			return n*fact(n-1);
		
	}

}
