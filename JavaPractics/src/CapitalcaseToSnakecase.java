
public class CapitalcaseToSnakecase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "ThisIsCase";
		
		
		char[] mychar = str.toCharArray();
		
		String newstr = "";
		char s = Character.toLowerCase(mychar[0]);
		for(int i = 1 ; i < mychar.length ; i++) {
			if(Character.isUpperCase(mychar[i])) {
				newstr = newstr + "_"+Character.toLowerCase(mychar[i]);
			}else {
				newstr = newstr+mychar[i];
			}
		}
		
		newstr = s+newstr;
		System.out.println("New String ->   "+ newstr);
		

	}

}
