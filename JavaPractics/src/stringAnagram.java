import java.util.Arrays;

public class stringAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "Army";
		String str2 = "Mary";
		StringBuilder sb = new StringBuilder();
		
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		
		
		
	}

}
