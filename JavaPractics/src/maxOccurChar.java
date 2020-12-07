import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class maxOccurChar {
	
	public static void main(String argv[]) {
		
		String str = "ababcbcbcdaaababa";
		getOccurance(str);
		}
	
	public static int getOccurance(String str) {
		
			HashMap<Character, Integer> hs = new HashMap<Character,Integer>();
		
		char[] arr = str.toCharArray();
		
		for(int i = 0 ; i < arr.length;i++) {
			if(hs.get(arr[i])==null) {
				hs.put(arr[i], 1);
			}else {
				Integer no = hs.get(arr[i]);
				hs.put(arr[i], ++no);
			}
		}
		
		Set<Entry<Character,Integer>> entrys = hs.entrySet();
		int maxCount = 0;
		char c = 0 ;
		for(Entry <Character ,Integer> en: entrys) {
			if(maxCount < en.getValue()) {
				
				maxCount = en.getValue();
				c = en.getKey();
			}
			
			
			
		}
	System.out.println("Key "+ c + "Value "+ maxCount);
		
		
		
		return 1;
	}
	
	
}

