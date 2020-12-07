
public class secondLargestNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {15,22,30,67,80,23};
		
		int first = 0 ;
		int second = 0;
		
		for(int i = 0 ; i < a.length ; i++) {
			if(a[i] > first) {
				second = first;
				first = a[i];
			}
			else if(second < a[i] && a[i] != first) {
				second = a[i];
			}
		}
		System.out.println("First ->"+ first);
		System.out.println("Second ->"+ second);
	}

}
