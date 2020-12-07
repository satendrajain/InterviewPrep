import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;


public class countDuplicate {
	
	public static void main(String argv[]) {
		
		String str = "avbcdcder";
		
		char[] mychar = str.toCharArray();
		
		HashMap<Character,Integer> hm =new  HashMap<Character,Integer>();
		
		for(int i = 0 ; i < mychar.length ; i++) {
			if(hm.get(mychar[i])==null) {
				hm.put(mychar[i], 1);
			}
			else {
				Integer c = hm.get(mychar[i]);
				hm.put(mychar[i], ++c);
			}
		}
		System.out.println("HashMap - >"+ hm);
		
		Set<Entry<Character,Integer>> entry = hm.entrySet();
		
		for(Entry<Character,Integer> en:entry) {
			if(en.getValue() > 1) {
				System.out.println("latter -> "+ en.getKey() + "Duplication ->"+ en.getValue());
			}
		}
	}

}
