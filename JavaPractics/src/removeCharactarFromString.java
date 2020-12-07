
public class removeCharactarFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcdefg";
		String c = "a";
		String[] charray = str.split("");
		
		for(int i = 0 ; i < str.length(); i++) {
			if(charray[i].equals(c)) {
				charray[i].replace(c, "");
				
			}
			
		}
		str = charray.toString();
		System.out.println("New String - >"+ str);
		
	}

}
