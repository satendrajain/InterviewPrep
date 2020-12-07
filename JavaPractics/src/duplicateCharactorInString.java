import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;


public class duplicateCharactorInString {
	public static void main (String argv[]) {
		
		String str = "abcdeabcc";
		char[] ch = str.toCharArray();
		HashMap<Character,Integer> hs = new HashMap<Character,Integer>();
		
		
		
		for(Character c: ch) {
			if(hs.get(c) == null) {
				hs.put(c, 1);
			}
			else {
				int no= hs.get(c);
				hs.put(c, ++no);
			}
		}
		
		Set<Entry<Character,Integer>> es = hs.entrySet();
		for(Entry<Character,Integer> en:es) {
			if(en.getValue() > 1) {
				System.out.println("Character - >" + en.getKey() +  " Occurance -> "+ en.getValue() );
			}
		}
		
	}

}
