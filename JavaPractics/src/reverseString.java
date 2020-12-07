
public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "This";
	
		
		StringBuilder sb = new StringBuilder();
		
		char[] mychar = str.toCharArray();
		
		for(int i = mychar.length -1 ; i >= 0; i--) {
			
			sb.append(mychar[i]);
		}
		
		System.out.println("New String ->" + sb);
		
		System.out.println("New String ->" + sb.toString());

	}

}
