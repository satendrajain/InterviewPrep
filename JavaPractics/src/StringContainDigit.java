
public class StringContainDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "asvcd34dfe6";
		
		char[] ch = str.toCharArray();
		
		for(char c: ch) {
			if(Character.isDigit(c)) {
			System.out.println("No - > "+ c);
			}
		}
	}

}
