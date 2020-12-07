
public class maxSum {

	public static void main(String[] args) {
		int a[] = {1,-3,4,-2,-1,6};
		int maxSum = 0;
		
		for(int i = 0 ; i <a.length;i++) {
			int currentSum = 0;
			for(int j = i ; j < a.length ;j++) {
				currentSum +=a[j];
				if(currentSum > maxSum) {
					maxSum = currentSum;
				}
			}
		}
		
		System.out.println("MAxSUm -> "+ maxSum);
		
	
	}
	
	

}
