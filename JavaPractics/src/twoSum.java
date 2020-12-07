import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class twoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,Integer> hmap = new HashMap<String,Integer>();
		hmap.put("a", 1);
		hmap.put("b", 2);
		hmap.put("c", 3);
		hmap.put("d", 4);
	
		Set<Entry <String,Integer>> entrySet = hmap.entrySet();
		
		for(Entry<String,Integer> entry : entrySet) {
			System.out.println(entry.getKey() + " " + entry.getValue() );
		}
	
		HashMap<String,Integer> amap = new HashMap<String,Integer>();
		amap.put("e", 5);
		amap.put("f", 6);
		
		System.out.println("amap ->"+ amap);
		
		System.out.println("==========================");
		
		amap.putAll(hmap);
		
		System.out.println("amap ->"+ amap);
		System.out.println("==========================");
		amap.putIfAbsent("g", 1);
		System.out.println("amap ->"+ amap);
		System.out.println("==========================");
		amap.putIfAbsent("a", 2);
		System.out.println("amap ->"+ amap);
		
		int val = amap.get("g");
		System.out.println("==========================");
		System.out.println("Value "+ val);
		System.out.println("==========================");
		System.out.println("Contains Key "+ amap.containsKey("a"));
		
		System.out.println("==========================");
		System.out.println("Contains Value "+ amap.containsValue(1));
		
		System.out.println("==========================");
		System.out.println("Size of hmap "+ hmap.size());
		System.out.println("==========================");
		System.out.println("Size of hmap "+ amap.size());
		System.out.println("==========================");
		
		Set<String> keys = amap.keySet();
		for(String key: keys) {
			System.out.println("Key -> "+ key);
		}
		System.out.println("==========================");
		Collection<Integer> values = amap.values();
		
		for(int value : values) {
			System.out.println("Value - > "+value);
			
		}
		
		System.out.println("==========================");
		amap.remove("a");
		
		entrySet = amap.entrySet();
		for(Entry<String,Integer> es: entrySet) {
			System.out.println(es.getKey() + " "+ es.getValue());
		}
		System.out.println("==========================");
		amap.remove("b",3);
		
		
		entrySet = amap.entrySet();
		
		for(Entry<String,Integer> es: entrySet) {
			System.out.println(es.getKey() + " " + es.getValue());
		}
		
	}
	

}
