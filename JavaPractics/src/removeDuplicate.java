import java.util.Set;
import java.util.HashSet;

public class removeDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "aabcgdefgh";
		
		Set<Character> set = new HashSet<Character>();
		char[] mychar = str.toCharArray();
		
		for(int i =0; i< mychar.length ; i++) {
			set.add(mychar[i]);
			
		}
		System.out.println("Set - >"+ set);

	}

}
