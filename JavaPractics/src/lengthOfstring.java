
public class lengthOfstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "geeksforgeeks";
		int count = 0;
		
		System.out.println("length -> "+ str.length());
		
		char[] mych = str.toCharArray();
		
		for(char c : mych) {
			count++;
		}
		
		System.out.println("count ->"+ count);

	}

}
