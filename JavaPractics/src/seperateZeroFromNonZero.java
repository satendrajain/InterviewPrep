
public class seperateZeroFromNonZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {2,4,5,0,1,0,3,0,7};
		int count = 0 ;
		
		for (int i = 0 ; i < a.length ; i++) {
			if(a[i] == 0) {
				count++;
			}
		}
		System.out.println("Total No Of Zero ->"+ count);
		int temp ;
		for(int i = 0 ; i < a.length ;i++) {
			for(int j = i+1 ; j < a.length ;j++)
			
				if(a[i] == 0 ) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					
				}
			
		}
		
		for (int i = 0 ; i < a.length ; i++) {
			System.out.print(a[i]+ ",");
			}
		
		
		
	}

}
