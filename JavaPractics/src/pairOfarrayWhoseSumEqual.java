
public class pairOfarrayWhoseSumEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {3,4,6,8,7,10,5,9,6};
		int sum = 15;
		
		for(int i = 0 ; i < a.length ; i++) {
			for (int j = i+1 ; j < a.length ; j++) {
				if(a[i]+a[j] == sum) {
					System.out.println("Pair is "+ "("+a[i] +","+ a[j]+")");
				}
			}
		}

	}

}
