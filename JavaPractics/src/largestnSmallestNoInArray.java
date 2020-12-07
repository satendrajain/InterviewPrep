import java.util.Arrays;

public class largestnSmallestNoInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int a[] = {4,6,23,56,12,9};
	Arrays.sort(a);
	System.out.println("Largest - >"+ a[a.length -1]);
	System.out.println("smallest - >"+ a[0]);
	
	//looping
	int largest = a[0] ;
	int smallest = a[0];
	
	for(int i = 0 ; i < a.length ; i++) {
		if(a[i] > largest) {
			largest = a[i];
			
		}
		else if(a[i] < smallest ) {
			smallest = a[i];
		}
	}
		
	System.out.println("Largest ->"+largest );
	System.out.println("smallest ->"+smallest );
	}

}
