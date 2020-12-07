
public class missingNoInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,3,4,5,6,8,9,10};
		
		
		/*
		 * int length = 10;
		 * 
		 * int finalSum = (length*(length+1))/2; System.out.println("final sum ->" +
		 * finalSum); int sum = 0 ;
		 * 
		 * for(int i = 0 ; i < a.length ;i++) { sum +=a[i]; }
		 * System.out.println("Sum of arrary ->"+ sum);
		 * 
		 * int missingNO = finalSum - sum;
		 * 
		 * System.out.println("Missing No->"+ missingNO);
		 */
		
		//Second method 
		
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println("i "+ i);
			System.out.println("a ->"+ a[i]);
			int missNo = i+1;
			System.out.println("i+1 ->"+ missNo);
			if(!(a[i] == missNo)) {
				
				System.out.println("Missing No - >"+ missNo);
				break;
			}
		}
	}

}
