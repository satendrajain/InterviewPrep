
public class matchingCharacterInTwoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "abdefgh";
		String str2 = "cd";
		
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		
		for(int i = 0 ; i < arr1.length ; i++) {
			for(int j = 0; j < arr2.length ; j++ ) {
				if(arr1[i] == arr2[j]) {
					System.out.println("Found Duplicate -> "+ arr2[j]);
					char c = arr2[j];
					arr1[i] = 0;
				}
			}
		}
		
	}

}
