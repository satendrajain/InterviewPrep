
public class removeDuplicatefromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {3,5,12,3,6,7};
		int temp;
		int n = a.length;
		int i ;
		for( i = 0 ; i < n ;i ++) {
			for(int j = 0 ; j < n ; j++) {
				if(a[i] == a[j] && i != j) {
					System.out.println("duplcate found ->"+ a[i] );
					  n = n-1;
					 
					break;
				}
				break;
			}
		}
		if(n < i) {
			for(int  j = i ; j < n ;j++) {
				a[j] = a[j+1]; 
			}
		}
		
		for(int k = 0 ; k < n ; k++) {
		System.out.print(a[k] + ",");
		}

	}

}
