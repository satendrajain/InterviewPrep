import java.util.HashSet;
import java.util.Set;

public class FindDuplicateElementinJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] myarary = {10,3,4,12,5,10,6,3};
		
		int[] duplicate = new int[myarary.length];
		
		Set<Integer> myset = new HashSet<Integer>();
		
		for(int i = 0 ; i < myarary.length ;i++) {
			System.out.println("Array item ->" +myarary[i]);
			if(myset.add(myarary[i])) {
				System.out.println("No duplicate");
			}else {
				System.out.println("Duplicate Found ->"+ myarary[i]);
				duplicate[i] = myarary[i];
			}
			
		}
		for(int j = 0 ; j <duplicate.length;j++) {
		System.out.println("arary ->"+ duplicate[j]);
		}

	}

}
