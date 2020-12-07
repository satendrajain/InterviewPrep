
public class vowlsAndConsonants {

	public static void main(String[] args) {
		
		String str = "this is ear Phone";
		char[] ch = str.toCharArray();
		int vowls = 0;
		int consonants = 0;
		
		for(char c: ch) {
			
			if(c == 'a' || c == 'e' || c == 'i' || c =='o' || c == 'u') {
				vowls++;
				
			}
			else {
				consonants++;
			}
		}
		System.out.println("Total Vowls - >" + vowls + "consonants -> " + consonants);
	}

}
