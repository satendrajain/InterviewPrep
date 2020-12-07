

public class nthLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] myarray = {3,5,6,1,7,9,0};
		int temp = 0;
		for(int i = 0 ; i < myarray.length -1 ; i++) {
			
				if(myarray[i] < myarray[i+1]) {
					temp = myarray[i];
					myarray[i] = myarray[i+1];
					myarray[i+1] = myarray[i];
				}
			
		}
		
		for(int i = 0 ; i < myarray.length ; i++) {
			
			System.out.print(myarray[i] + ",");
		}
	}

}
