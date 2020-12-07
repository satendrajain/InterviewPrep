import java.util.HashSet;
import java.util.Set;

public class longestSubStringwithoutRepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "abcdefghacbegd";
		String[]mystr = str.split("");
		
		Set<String> newStr = new HashSet<String>();
		
		for(String s: mystr) {
			newStr.add(s);
		}
		
		System.out.println("NewString - > "+ newStr.toString());
		System.out.println("Length - > "+ newStr.size());
		

	}

}
