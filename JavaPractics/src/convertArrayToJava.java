
public class convertArrayToJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] charray =  { 'g', 'e', 'e', 'k', 's', 'f', 'o', 'r', 'g', 'e', 'e', 'k', 's' };
		
		String str = new String(charray);
		
		for(char c: charray) {
			
			str = str+c;
		}
		
		System.out.println(str);

	}

}
