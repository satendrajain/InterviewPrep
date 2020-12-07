import java.util.HashSet;
public class repetationOfFirstCharactar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "abcdefaghj";
		char[] ch = str.toCharArray();
		 HashSet<Character> hs = new HashSet<Character>(); 
		 
		 for(char c: ch) {
			 if(hs.add(c)) {
				 System.out.println("Charactar is not repeated so far - >" + c);
			 }
			 else {
				 System.out.println("First Repeated Charater - >"+ c);
				 break;
			 }
		 }

	}

}
